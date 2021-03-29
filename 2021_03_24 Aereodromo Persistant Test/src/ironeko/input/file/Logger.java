package ironeko.input.file;

import java.io.*;
import java.util.BitSet;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

// TODO: thread-safe, when multithreading could print Thread name, also object caller with stacktrace?
public enum Logger {

    DEBUG    (System.out, " @ "),
    FILE     (Logger::file, ""),
    INFO     (System.out, "   "),
    ITERABLE (System.out, " + "),
    MENU     (System.out, " - "),
    INPUT    (System.out, " ->"),
    WARN     (System.out, " ! "),
    ERROR    (System.err, " ! "),
    FATAL    (System.err, " # ");

    private static final BitSet ENABLED;
    static {
        ENABLED = new BitSet(values().length);
        FILE.enable();
        DEBUG.disable();
        INFO.enable();
        ITERABLE.enable();
        MENU.enable();
        INPUT.enable();
        WARN.enable();
        ERROR.enable();
        FATAL.enable();
    }

    private final PrintStream stream;

    private static Boolean shouldAdd = true;
    private final String indent;

    Logger(PrintStream stream, String indent) {
        this.stream = stream;
        this.indent = indent;
    }

    Logger(Supplier<PrintStream> supplier, String indent) {
        this.stream = supplier.get();
        this.indent = indent;
    }
    
    public void enable() {
        ENABLED.set(ordinal(), true);
    }

    public void disable() {
        ENABLED.set(ordinal(), false);
    }

    private String wrap(String s) {
        return s.chars()
                .mapToObj(c -> {
                    if (shouldAdd) {
                        shouldAdd = false;
                        return indent + ((char) c);
                    }
                    if (c == '\n') shouldAdd = true;
                    return String.valueOf((char) c);
                })
                .collect(Collectors.joining());
    }

    // Exception

    public void exception(Exception e) {
        List<Character> string = new LinkedList<>();
        e.printStackTrace(new PrintStream(new OutputStream() {
            @Override
            public void write(int b) {
                string.add((char) b);
            }
        }));
        print(string.stream().map(Object::toString).collect(Collectors.joining()));
    }

    // Print Wrapper

    public void print(String s) {
        s = wrap(s);
        if (ENABLED.get(ordinal())) stream.print(s);
        if (this != FILE) FILE.print(s);
    }

    public void print(Object o) {
        print(o.toString());
    }

    // Println Wrapper

    public void println(String s) {
        s = wrap(s);
        shouldAdd = true;
        if (ENABLED.get(ordinal()))  stream.println(s);
        if (this != FILE) FILE.println(s);
    }

    public void println(Object o) {
        println(o.toString());
    }

    public void println() {
        shouldAdd = true;
        if (ENABLED.get(ordinal())) stream.println();
        if (this != FILE) FILE.println();
    }

    // Utility

    private static PrintStream file() {
        try {
            File file = new File("./logs/" + System.currentTimeMillis() + ".log");
            file.getParentFile().mkdirs();
            return new PrintStream(new FileOutputStream(file));
        } catch (FileNotFoundException e) {
            return new PrintStream(new OutputStream() {
                @Override
                public void write(int b) {
                    // NO-OP
                }
            });
        }
    }

}
