import java.io.*;

/*
Classe per l'aquisizione si stringhe
dallo standard input
*/

//classe per la gestione di un file di testo

public class Input {

    private char mode; //R=read, W=write
    private BufferedReader reader;
    private BufferedWriter writer;

    /*costruttore che costruisce un oggetto di tipo BufferedReader-BufferedWriter sopra il file specificato come parametro
    @param filename percorso e nome del file
    @param mode R per sola lettura, W per sola scrittura*/

    public TextFile(String filename, char mode) throws IOException {
        this.mode = 'R';
        if (mode == 'W' || mode == 'w'){
            this.mode = 'W';
            writer = new BufferedWriter(new FileWriter(filename));
        }
        else{
            reader = new BufferedReader(new FileReader(filename));
        }
    }
    /*metodo per scrivere una riga di testo nel file se il file è aperto in scrittura
    @param line riga di testo da scrivere nel file
    @throws FileException se il file è aperto in lettura*/
    public void toFile (String line) throws FileException, IOException {
        if (this.mode=='R') throw new FileException("Solo lettura!");
        writer.write(line);
        writer.newLine();
    }

        /*metodo per leggere una riga di testo da un file aperto in lettura
        @return riga di testo letta dal file
        @throws FileException se il file è aperto in scrittura
        @throws FileException se è stata raggiunta la fine del file*/

    public String fromFile () throws FileException, IOException {
        String tmp;
        if (this.mode=='W') throw new FileException("Solo Scrittura!");
        tmp=reader.readLine(); if (tmp==null) throw new FileException("Fine File!");
        return tmp;
    }
    /*chiude il file aperto dal costruttore*/

    public void closeFile () throws IOException {
        if (this.mode=='W')
            writer.close();
        else
            reader.close();
    }


    /*
     * Costruire un oggetto di tipo BufferedReader
     * sopra lo standard input (System.in)
     */

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    /*
     * Legge uuna riga e la converte in un valore intero:
     * la linea deve contenere un solo valore intero, eventualmente
     * proceduto dal segno, ma senza altri caratteri
     * @return valore intero digitato
     */
    public static int readInt(String print){
        System.out.println(print);
        return readInt();
    }

    public static int readInt(){
        boolean ok = false;
        int ret = 0;
        while(!ok) {
            try {
                ret = Integer.parseInt(reader.readLine());
                ok = true;
            }
            catch(IOException exception){
                System.out.println("Error 01 IOException is incorrect, retry");
            }
            catch(NumberFormatException exception) {
                System.out.println("Error 02 NumberFormatException is incorrect, retry");
            }
        }
        return ret;
    }

    /*
     * Legge uuna riga e la converte in un valore double:
     * la linea deve contenere un solo valore intero, eventualmente
     * proceduto dal segno, ma senza altri caratteri
     * @return valore double digitato
     */
    public static double readDouble(String print){
        System.out.println(print);
        return readDouble();
    }

    public static double readDouble(){
        boolean ok = false;
        double ret = 0;
        while(!ok) {
            try {
                ret = Double.parseDouble(reader.readLine());
                ok = true;
            }
            catch(IOException exception){
                System.out.println("Error 01 IOException is incorrect, retry");
            }
            catch(NumberFormatException exception) {
                System.out.println("Error 02 NumberFormatException is incorrect, retry");
            }
        }
        return ret;
    }

    /*
     * legge una riga di testo in input
     * @return stringa digitata
     */
    public static String readString(String print){
        System.out.println(print);
        return readString();
    }

    public static String readString(){
        boolean ok = false;
        String ret = "";
        while(!ok) {
            try {
                ret = reader.readLine();
                ok = true;
            }
            catch(IOException exception){
                System.out.println("Error 01 IOException is incorrect, retry");
            }
        }
        return ret;
    }

}