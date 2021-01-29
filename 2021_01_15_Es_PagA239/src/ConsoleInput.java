import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Classe per l'aquisizione si stringhe
dallo standard input
*/

public class ConsoleInput {
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