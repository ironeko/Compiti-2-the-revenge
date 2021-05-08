package ironeko;

import ironeko.input.file.WriteOnFile;

import java.util.ArrayList;

public class Menu {
    private static final String FILE_NAME = "file.txt";

    private static Navy ships = new Navy();

    public static void start() {
        importFile();
        /*AircraftCarriers test = new AircraftCarriers("gino","trattorino", "er meglio che c'e",69, 420,90);
        Destroyers test2 = new Destroyers("franco", "no", "il piu stupido del branco", 32.2, 90.001, 0, 1000);
        ships.addShip(test);
        ships.addShip(test2);*/
        System.out.println(ships.toString());
        saveFile();

    }

    private static void importFile() {//e moh
        ArrayList<String> out = (ArrayList<String>) WriteOnFile.fileRead(FILE_NAME);

        if (out != null) {
            ArrayList<String> app = new ArrayList<>(8);
            for (int i = 0; i < out.size(); i++) {
                if (out.get(i).equals("AircraftCarriers")) {
                    i++;
                    int j=i;
                    j+=7;
                    for (; i < j; i++) {
                        app.add(out.get(i));
                    }
                    loadAircraft(app);
                    app.clear();
                } else if (out.get(i).equals("Destroyers")) {
                    i++;
                    int j=i;
                    j+=8;
                    for (; i < j; i++) {
                        app.add(out.get(i));
                    }
                    loadDestroyer(app);
                    app.clear();
                }
            }
        }
    }

    private static void saveFile() {
        WriteOnFile.emptyFile(FILE_NAME);
        ArrayList<Ships> navy = ships.getNavy();
        for (Ships ship : navy) {
            if (ship instanceof Destroyers) {
                saveDestroyer((Destroyers) ship);
            } else {
                saveAircraft((AircraftCarriers) ship);
            }
            WriteOnFile.fileWrite(FILE_NAME, "\n");
        }

    }

    private static void saveAircraft(AircraftCarriers obj) {
        WriteOnFile.fileWrite(FILE_NAME, "AircraftCarriers");
        WriteOnFile.fileWrite(FILE_NAME, obj.getName());
        WriteOnFile.fileWrite(FILE_NAME, obj.getCode());
        WriteOnFile.fileWrite(FILE_NAME, obj.getInformation());
        WriteOnFile.fileWrite(FILE_NAME, obj.getHeavy());
        WriteOnFile.fileWrite(FILE_NAME, obj.getLife());
        WriteOnFile.fileWrite(FILE_NAME, obj.getAircraft());
    }

    private static void saveDestroyer(Destroyers obj) {
        WriteOnFile.fileWrite(FILE_NAME, "Destroyers");
        WriteOnFile.fileWrite(FILE_NAME, obj.getName());
        WriteOnFile.fileWrite(FILE_NAME, obj.getCode());
        WriteOnFile.fileWrite(FILE_NAME, obj.getInformation());
        WriteOnFile.fileWrite(FILE_NAME, obj.getHeavy());
        WriteOnFile.fileWrite(FILE_NAME, obj.getLife());
        WriteOnFile.fileWrite(FILE_NAME, obj.getRocketLauncher());
        WriteOnFile.fileWrite(FILE_NAME, obj.getSubmachineGun());
    }

    private static void loadAircraft(ArrayList<String> list) {
        ships.addShip(new AircraftCarriers(list.get(0), list.get(1), list.get(2), Double.parseDouble(list.get(3)), Double.parseDouble(list.get(4)), Integer.parseInt(list.get(5))));
    }

    private static void loadDestroyer(ArrayList<String> list) {
        ships.addShip(new Destroyers(list.get(0), list.get(1), list.get(2), Double.parseDouble(list.get(3)), Double.parseDouble(list.get(4)), Integer.parseInt(list.get(5)), Integer.parseInt(list.get(6))));
    }
}

// per il JavaDoc /**enter
