package Ironeko;
import Ironeko.Input.*;

import java.io.File;

public class Menu {
    private static Treno treno;
    private static final File FILE = new File("file.bin");

    private static final FileInterface FILE_INTERFACE = new BinaryFile();

    public static void start() {
        importFile();
        int choose = 0;
        int esc = 0;

        System.out.println("Buongiorno e benvenuto all'areoporto inter-planetario di San Giusto");
        do {
            choose = ConsoleInput.readInt("""
                    1) Aggiunta Vagone\r
                    2) Eliminare Vagone\r
                    3) Cercare tutti i vagoni di una certa azienda costruttrice \r
                    4) visualizzare le informazioni complete di un treno\r
                    5) Save & Exit\s""");
            switch (choose) {
                case 1:
                    choose = ConsoleInput.readInt("Inserire 1 se si tratta di un vagone passeggeri, in alternativa inserire 0");
                    if (choose == 1){ Passeggeri app = new Passeggeri(ConsoleInput.readString("Inserire Codice:"),ConsoleInput.readDouble("Inserire peso a Vuoto del vagone:"),ConsoleInput.readString("Inserire Costruttore del vagone:"),ConsoleInput.readInt("Inserire anno di costruzione:"),ConsoleInput.readString("Inserire classe:"),ConsoleInput.readInt("Inserire numero posti liberi:"),ConsoleInput.readInt("Insereire numero posti totali:"));treno.aggiungiVagone(app); }
                    else{ Merci app = new Merci(ConsoleInput.readString("Inserire Codice:"),ConsoleInput.readDouble("Inserire peso a Vuoto del vagone:"),ConsoleInput.readString("Inserire Costruttore del vagone:"),ConsoleInput.readInt("Inserire anno di costruzione:"),ConsoleInput.readDouble("Inserire volume:"),ConsoleInput.readDouble("Inserire peso massimo:"),ConsoleInput.readDouble("Inserire peso:"));treno.aggiungiVagone(app); }
                    break;
                case 2: if(!treno.rimuoviVagone(ConsoleInput.readString("Inserire codice vagone:"))){System.out.println("Errore vagone non trovato");}else{System.out.println("Rimozione Eseguita");};break;
                case 3:
                    String app = ConsoleInput.readString("Inserisci nome compagnia:");
                    for (int i=0; i<treno.getSize();i++){
                        if (treno.getVagone(i).getCostruttore().equals(app)){
                            System.out.println(treno.getVagone(i).toString());
                        }
                    }
                    break;
                case 4: if (treno.getSize()>0){System.out.println(treno.MEGAtoString());}else{System.out.println("ERRORE NUMERO INCOMPATIBILE");};break;
                case 5: esc=1;saveFile();break;
                default:System.out.println("ERRORE NUMERO INCOMPATIBILE");
            }
        }while(esc==0);
    }

    private static void importFile(){
        try{
            treno = FILE_INTERFACE.load(FILE,Treno.class);
        }
        catch(Exception e){
            treno =  new Treno();
        }
    }

    private static void saveFile(){
        try {
            FILE_INTERFACE.save(treno,FILE);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
