package ironeko.input.file;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class WriteOnFile {
    
    public static void emptyFile(String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.close();
        } catch (Exception exception) {
            System.out.println("IO Error");
        }
    }
    
    public static void fileWrite(String fileName, Object obj) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            if (obj instanceof String){ writer.write((String) obj);}
            else{
                writer.write(obj.toString());
            }
            writer.write("\n");
            writer.close();
        } catch (Exception exception) {
            System.out.println("IO Error");
        }
    }

    public static <T> T fileReadline(String filename, int line, Class<T> type) {
        String str = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            return type.cast(reader.lines().collect(Collectors.toList()).get(line));
        }catch(Exception exception){
            System.out.println("File could not be found or could not be read");
        }
        return null;
    }

    public static List<String> fileRead(String filename){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            return reader.lines().collect(Collectors.toList());
        }catch(Exception exception){
            System.out.println("File could not be found or could not be read");
        }
        return null;
    }


    public static int fileLineCount(String filename){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            return (int)reader.lines().count();
        }catch(Exception exception){
            return -1;
        }
    }
}
