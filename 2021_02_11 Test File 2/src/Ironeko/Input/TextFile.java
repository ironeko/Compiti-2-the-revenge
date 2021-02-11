package Ironeko.Input;

import Ironeko.Input.FileException;

import java.io.*;

//classe per la gestione di un file di testo
public class TextFile {
    private char mode; //R=read, W=write
    private BufferedReader reader;
    private BufferedWriter writer;

    /*costruttore che costruisce un oggetto di tipo BufferedReader-BufferedWriter
    sopra il file specificato come parametro
    @param filename percorso e nome del file
    @param mode R per sola lettura, W per sola scrittura*/
    public TextFile(String filename, char mode) throws IOException {
        this.mode = 'R';
        if (mode == 'W' || mode == 'w') {
            this.mode = 'W';
            writer = new BufferedWriter(new FileWriter(filename));
        } else {
            reader = new BufferedReader(new FileReader(filename));
        }
    }

    /*metodo per scrivere una riga di testo nel file se il file è aperto in
    scrittura
    @param line riga di testo da scrivere nel file
    @throws FileException se il file è aperto in lettura*/
    public void toFile(String line) throws FileException, IOException {
        if (this.mode == 'R') throw new FileException("Solo lettura!");
        writer.write(line);
        writer.newLine();
    }

    /*metodo per leggere una riga di testo da un file aperto in lettura
    @return riga di testo letta dal file
    @throws FileException se il file è aperto in scrittura
    @throws FileException se è stata raggiunta la fine del file*/
    public String fromFile() throws FileException, IOException {
        String tmp;
        if (this.mode == 'W') throw new FileException("Solo Scrittura!");
        tmp = reader.readLine();
        if (tmp == null) throw new FileException("Fine File!");
        return tmp;
    }

    /*chiude il file aperto dal costruttore*/
    public void closeFile() throws IOException {
        if (this.mode == 'W')
            writer.close();
        else
            reader.close();
    }
}
