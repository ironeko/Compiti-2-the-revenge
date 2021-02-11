package Ironeko.Input;

public class FileException extends Exception{
    private String messaggio=" ";
    //costruttore
    public FileException (String messaggio){
        this.messaggio= messaggio;
    }
    public String getMessaggio() {
        return this.messaggio;
    }
}

