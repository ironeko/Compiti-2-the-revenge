package Ironeko;

import Ironeko.Input.ConsoleInput;
import Ironeko.Input.file.*;

import java.io.File;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main{
    private static final File FILE = new File("file.bin");
    private static final FileInterface FILE_INTERFACE = new BinaryFile();

    private static Aereodromo aerei;

    public static void main(String[] args) {

        importFile();

        System.out.println(aerei.toString());

        String uno = ConsoleInput.readString("Dimmi il codice 1:");
        String due = ConsoleInput.readString("Dimmi il codice 2:");
        if (aerei.search(uno) != null && aerei.search(due) != null){
            try{
                int app = aerei.search(uno).compareTo(aerei.search(due));
                if (app == 0){
                    System.out.println("Gli Aereomobili sono uguali");
                }
                else if (app > 0){
                    System.out.println(uno + " è migliore di " + due);
                }
                else {
                    System.out.println(uno + " è peggiore di " + due);
                }
            }
            catch (Exception e){
                System.out.println("Sigle di tipi di Aereomobili diversi");;
            }
        }
        else {
            System.out.println("Sigle inesistenti");
        }


        saveFile();

    }

    private static void importFile(){
        try{
            aerei = FILE_INTERFACE.load(FILE,Aereodromo.class);
        }
        catch(Exception e){
            aerei =  new Aereodromo();
        }
    }

    private static void saveFile(){
        try {
            FILE_INTERFACE.save(aerei,FILE);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
