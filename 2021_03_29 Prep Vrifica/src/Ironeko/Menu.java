package Ironeko;

import Ironeko.WriteOnFile;

import java.util.ArrayList;

public class Menu {

    private static final String FILE_NAME = "file.txt";

    private static Navy ships= new Navy();

    public static void start (){

        AircraftCarriers test = new AircraftCarriers("gino","trattorino", "er meglio che c'e",69, 420,90);
        //ships.addShip(test);
        System.out.println(ships.toString());
        saveFile();

    }

    private static void importFile() {

    }

    private static void saveFile(){
        ArrayList<Ships> navy = ships.getNavy();
        for (Ships ship: navy) {
            if (ship instanceof Destroyers){

            }
            else{

            }
            WriteOnFile.fileWrite(FILE_NAME,"\n");
        }

    }



}

/*
    private static final File file = new File("file.bin");
    private static final FileInterface FILE_INTERFACE = new BinaryFile();*/

/*
    private static void importFile(){
        try{
            ships = FILE_INTERFACE.load(file, Navy.class);
        }
        catch(Exception e){
            ships =  new Navy();
        }
    }

    private static void saveFile(){
        try {
            FILE_INTERFACE.save(ships,file);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }*/