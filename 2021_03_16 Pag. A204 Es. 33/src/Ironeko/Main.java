package Ironeko;
import Ironeko.Input.ConsoleInput;

import java.io.File;
import java.sql.Timestamp;
import Ironeko.Input.file.*;

public class Main{
    private static final File File = new File("file.bin");
    private static final FileInterface FILE_INTERFACE = new BinaryFile();

    private static Mailbox mails= new Mailbox();

    public static void main(String[] args) {
        importFile();
        boolean esc = true;
        System.out.println("Benvenuto al servizio Mail \n\"il Piccino Spennato\"");
        do{
            switch (ConsoleInput.readInt("Prego inserisca la sua decisine\n" + "\t1) Creare una nuova semail\n" + "\t2) Cancellare una mail\n" + "\t3) Ricerca tra le mail\n" + "\t4) Uscire\n")){
                case 1: newMail();break;
                case 2: delMail();break;
                case 3: searchMail(); break;
                case 4: esc = false;System.out.println("Grazie e Arrivederci");break;
                default: System.out.println("Errore Inserimento Errato");
            }
        }while(esc);
        saveFile();
    }

    private static void newMail(){
        Timestamp data=new Timestamp(System.currentTimeMillis());
        Mail nuova = new Mail(ConsoleInput.readString("Inserire mittente: "),ConsoleInput.readString("Inserire oggetto"),data,ConsoleInput.readString("Inserire testo:"));
        mails.addMail(nuova);
    }

    private static void delMail(){
        System.out.println(mails.toString());
        try {
            mails.remMail(ConsoleInput.readInt("Inserire numero da rimuovere"));
        }
        catch (Exception e){
            System.out.println("Errore I/O");
        };
    }

    private static void searchMail(){
        try {
            System.out.println(mails.seaMail(ConsoleInput.readString("Inserire Oggetto: ")));
        }
        catch (Exception e){
            System.out.println("unc'è");
        }
    }

    private static void importFile(){
        try{
            mails = FILE_INTERFACE.load(File, Mailbox.class);
        }
        catch(Exception e){
            mails =  new Mailbox();
        }
    }

    private static void saveFile(){
        try {
            FILE_INTERFACE.save(mails,File);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
