package Ironeko.Input;

import Ironeko.Studente;

import java.io.*;

public class FileBinario {
    private ObjectOutputStream scrivi;
    private ObjectInputStream leggi;
    private char mode;

    //Costruttore, apre il file (nomeFile) nel modo (mode) richiesto
    public FileBinario(String nomeFile, char mode) throws ModoErratoException, FileNotFoundException, IOException {
        this.mode = mode;
        if (mode == 'r' || mode == 'R')
            leggi = new ObjectInputStream(new FileInputStream(nomeFile));
        else if (mode == 'w' || mode == 'W') {
            scrivi = new ObjectOutputStream(new FileOutputStream(nomeFile));
        } else
            throw new ModoErratoException();
    }

    public void scriviFile(Studente elenco) throws IOException, ModoErratoException {
        if (mode == 'w' || mode == 'W') {
            scrivi.writeObject(elenco);
            scrivi.close();
        } else
            throw new ModoErratoException();

    }

    public Studente leggiFile(FileBinario file) throws ClassNotFoundException, IOException, ModoErratoException {
        Studente app;
        if (mode == 'r' || mode == 'R') {
            app = (Studente) leggi.readObject();
            //casting al tipo di attributo nel quale andrà il risultato della lettura da file
            leggi.close();
            return app;
        } else
            throw new ModoErratoException();
    }
}
