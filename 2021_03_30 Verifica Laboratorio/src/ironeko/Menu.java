package ironeko;

import ironeko.input.ConsoleInput;
import ironeko.input.file.WriteOnFile;
import java.util.ArrayList;
import java.util.Calendar;

/* Esempi usati:
        Agonisti test = new Agonisti("Andrea", "Luchi", 20030201, "Nullafacente",12545,20200205,20210503);
        Amatori test2 = new Amatori("Jacopo","Del Granchio", 20030809, "Sollevatore di polemiche", 12052,20200823,20311121,"Maestro Shifu");
        atleti.add(test);
        atleti.add(test2);
 */

public class Menu {
    private static final String FILE_NAME = "file.txt";

    private static ArrayList <Atleti> atleti = new ArrayList<>();

    /**
     * menu vero e proprio con switch salvataggio e importazione da file txt
     */
    public static void start() {
        importFile();
        System.out.println("Benvenuti al cento Fitness Covid & co.\n vi dicono di andare in palestra ma voi non avete voglia?\n non preoccupatevi, venite da noi, noi siamo gl'unici \n SEMPRE CHIUSI!!!");
        int choose;
        do{
            switch (choose = ConsoleInput.readInt("Menu:\n" +
                    "1) Crea nuovo utente\n" +
                    "2) Rinnovare Abbonamento\n" +
                    "3) Rimuovere Cliente\n" +
                    "4) Stampare tutti i clienti\n" +
                    "5) Exit\n")){
                case 1: nuovoUtente(); break;
                case 2:
                    Atleti app = searchPerTessera( ConsoleInput.readInt("Inserire numero tessera: "));
                    if ( app != null){
                        switch (ConsoleInput.readInt("Inserire il numero di mesi per il rinnovo (1,3,12): ")){
                            case 1:
                                if (app instanceof Amatori && ((Amatori) app).getEsperienza()=="esperto"){
                                    System.out.println("il costo è di "+ (50-50*0.15));
                                }
                                else if (app instanceof Agonisti && ((Agonisti) app).getCategoria()=="junior"){
                                    System.out.println("il costo è di "+ (50-50*0.50));
                                }
                                else if (app instanceof Agonisti && ((Agonisti) app).getCategoria()=="senior"){
                                    System.out.println("il costo è di "+ (50-50*0.30));
                                }
                                else if (app instanceof Agonisti && ((Agonisti) app).getCategoria()=="gentleman"){
                                    System.out.println("il costo è di "+ (50-50*0.20));
                                }
                                else{
                                    System.out.println("il costo è di "+ 50);
                                }
                                app.setDataDiScadenzaAbbonamento(controlloData(app.getDataDiScadenzaAbbonamento() + 100));break;
                            case 3:
                                if (app instanceof Amatori && ((Amatori) app).getEsperienza()=="esperto"){
                                    System.out.println("il costo è di "+ (120-120*0.15));
                                }
                                else if (app instanceof Agonisti && ((Agonisti) app).getCategoria()=="junior"){
                                    System.out.println("il costo è di "+ (120-120*0.50));
                                }
                                else if (app instanceof Agonisti && ((Agonisti) app).getCategoria()=="senior"){
                                    System.out.println("il costo è di "+ (120-120*0.30));
                                }
                                else if (app instanceof Agonisti && ((Agonisti) app).getCategoria()=="gentleman"){
                                    System.out.println("il costo è di "+ (120-120*0.20));
                                }
                                else{
                                    System.out.println("il costo è di "+ 120);
                                }
                                app.setDataDiScadenzaAbbonamento(controlloData(app.getDataDiScadenzaAbbonamento() + 300));break;
                            case 12:
                                if (app instanceof Amatori && ((Amatori) app).getEsperienza()=="esperto"){
                                    System.out.println("il costo è di "+ (300-300*0.15));
                                }
                                else if (app instanceof Agonisti && ((Agonisti) app).getCategoria()=="junior"){
                                    System.out.println("il costo è di "+ (300-300*0.50));
                                }
                                else if (app instanceof Agonisti && ((Agonisti) app).getCategoria()=="senior"){
                                    System.out.println("il costo è di "+ (300-300*0.30));
                                }
                                else if (app instanceof Agonisti && ((Agonisti) app).getCategoria()=="gentleman"){
                                    System.out.println("il costo è di "+ (300-300*0.20));
                                }
                                else{
                                    System.out.println("il costo è di "+ 300);
                                }
                                app.setDataDiScadenzaAbbonamento(controlloData(app.getDataDiScadenzaAbbonamento() + 10000));break;
                            default: System.out.println("Errore inserire 1, 3 o 12");
                        }
                    }
                    else {
                        System.out.println("Errore Utente non trovato");
                    }
                    break;
                case 3: if (atleti.remove( searchPerTessera( ConsoleInput.readInt("Inserire numero tessera: "))) != true){ System.out.println("Errore Utente non trovato"); }break;
                case 4: System.out.println(atleti.toString());break;
                case 5: break;
                default:
                    System.out.println("Errore di Inserimento");
            }
        }while (choose!=5);
        saveFile();
        System.out.println("Grazie e Arrivederci");

    }

    /**
     * metodo per il caricamento da file
     */
    private static void importFile() {
        ArrayList<String> out = (ArrayList<String>) WriteOnFile.fileRead(FILE_NAME);

        if (out != null) {
            ArrayList<String> app = new ArrayList<>(9);
            for (int i = 0; i < out.size(); i++) {
                if (out.get(i).equals("Agonisti")) {
                    i++;
                    int j=i;
                    j+=8;
                    for (; i < j; i++) {
                        app.add(out.get(i));
                    }
                    loadAgonisti(app);
                    app.clear();
                } else if (out.get(i).equals("Amatori")) {
                    i++;
                    int j=i;
                    j+=9;
                    for (; i < j; i++) {
                        app.add(out.get(i));
                    }
                    loadAmatori(app);
                    app.clear();
                }
            }
        }
    }

    /**
     * metodo salvataggio si file
     */
    private static void saveFile() {
        WriteOnFile.emptyFile(FILE_NAME);
        for (Atleti atleta : atleti) {
            if (atleta instanceof Amatori) {
                saveAmatori((Amatori) atleta);
            } else {
                saveAgonisti((Agonisti) atleta);
            }
            WriteOnFile.fileWrite(FILE_NAME, "\n");
        }

    }

    /**
     * metodo salvataggio Amatori su file
     * @param obj
     */
    private static void saveAmatori(Amatori obj) {
        WriteOnFile.fileWrite(FILE_NAME, "Amatori");
        WriteOnFile.fileWrite(FILE_NAME, obj.getNome());
        WriteOnFile.fileWrite(FILE_NAME, obj.getCognome());
        WriteOnFile.fileWrite(FILE_NAME, obj.getDataDiNascita());
        WriteOnFile.fileWrite(FILE_NAME, obj.getDisciplina());
        WriteOnFile.fileWrite(FILE_NAME, obj.getNumeroDiTessera());
        WriteOnFile.fileWrite(FILE_NAME, obj.getDataDiScadenzaAbbonamento());
        WriteOnFile.fileWrite(FILE_NAME, obj.getDataDiAbbonamento());
        WriteOnFile.fileWrite(FILE_NAME, obj.getEsperienza());
    }

    /**
     * metodo savatoggio Agonisti su file
     * @param obj
     */
    private static void saveAgonisti(Agonisti obj) {
        WriteOnFile.fileWrite(FILE_NAME, "Agonisti");
        WriteOnFile.fileWrite(FILE_NAME, obj.getNome());
        WriteOnFile.fileWrite(FILE_NAME, obj.getCognome());
        WriteOnFile.fileWrite(FILE_NAME, obj.getDataDiNascita());
        WriteOnFile.fileWrite(FILE_NAME, obj.getDisciplina());
        WriteOnFile.fileWrite(FILE_NAME, obj.getNumeroDiTessera());
        WriteOnFile.fileWrite(FILE_NAME, obj.getDataDiScadenzaAbbonamento());
        WriteOnFile.fileWrite(FILE_NAME, obj.getDataDiAbbonamento());
    }

    /**
     * metodo caricamento amatori da file
     * @param list
     */
    private static void loadAmatori(ArrayList<String> list) {
        atleti.add(new Amatori(list.get(0),list.get(1),Integer.parseInt( list.get(2) ), list.get(3),Integer.parseInt( list.get(4) ),Integer.parseInt( list.get(5) ),Integer.parseInt( list.get(6) ), list.get(7)));
    }

    /**
     * etodo caricamento agonisti da file
     * @param list
     */
    private static void loadAgonisti(ArrayList<String> list) {
        atleti.add(new Agonisti(list.get(0),list.get(1),Integer.parseInt( list.get(2) ), list.get(3),Integer.parseInt( list.get(4) ),Integer.parseInt( list.get(5) ),Integer.parseInt( list.get(6) )));
    }

    /**
     * metodo creazione nuovo utete
     */
    private static void nuovoUtente(){
        String input = ConsoleInput.readString("Inserisci se si tratta di un utente Amatoriale o Agonista");
        if (input.toLowerCase().equals("amatoriale")){
            atleti.add(new Amatori( ConsoleInput.readString("Inserire nome Utente: "), ConsoleInput.readString("Inserire cognome Utente: "),
                    data("Insere data di nascita: "), ConsoleInput.readString("Inserire disciplina Utente: "), ConsoleInput.readInt("Inserire numero tessera"),
                    controlloData(dataOdierna() + ConsoleInput.readInt("Inserire mesi abbonamento: ")),dataOdierna(), ConsoleInput.readString("Inserire esperienza Utente: ")));

        }else if (input.toLowerCase().equals("agonista")){
            atleti.add(new Agonisti( ConsoleInput.readString("Inserire nome Utente: "), ConsoleInput.readString("Inserire cognome Utente: "),
                    data("Insere data di nascita: "), ConsoleInput.readString("Inserire disciplina Utente: "), ConsoleInput.readInt("Inserire numero tessera"),
                    controlloData(dataOdierna() + ConsoleInput.readInt("Inserire mesi abbonamento: ")),dataOdierna()));
        }
        else{
            System.out.println("Errore: ");
            nuovoUtente();
        }
    }

    /**
     * metodo creazione data in formato int
     * @param messaggio
     * @return
     */
    private static int data(String messaggio){
        System.out.println(messaggio);
        int data=0;
        data += ConsoleInput.readInt("Inserire Anno: ")*10000;
        data += ConsoleInput.readInt("Inserire mese: ")*100;
        data += ConsoleInput.readInt("Inserire giorno: ");
        return data;
    }

    /**
     * metodo retuitore data odierna in formato int
     * @return
     */
    private static int dataOdierna(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int data=0;
        data += calendar.get(Calendar.YEAR)*10000;
        data += calendar.get(Calendar.MONTH)*100;
        data += calendar.get(Calendar.DATE);
        return data;
    }

    /**
     * metodo ricerca atleta per numero tessera
     * @param numerotessera
     * @return
     */
    private static Atleti searchPerTessera(int numerotessera){
        for (Atleti atleta : atleti) {
            if (atleta.getNumeroDiTessera() == numerotessera)
                return atleta;
        }
        return null;
    }

    /**
     * metodo controllo data
     * @param data
     * @return
     */
    private static int controlloData(int data){
        int data2=data/100;
        if (data2%100 >12){
            data2-=12;
            data2+=100;
        }
        return data%100+data2*100;
    }

}

