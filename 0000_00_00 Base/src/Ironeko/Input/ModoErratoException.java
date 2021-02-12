package Ironeko.Input;

public class ModoErratoException extends Exception {
    public ModoErratoException() {
        super("Modalità di apertura del file non consentita");
    }
}
