import java.text.BreakIterator;
import java.util.ArrayList;

public class Menu {

    public static void start() {//qui parte il menù
        var carrello = new Carrello();//creo carrello
        int choose = 0;

        System.out.println("Benvenuto nel menù del mega supermercato \n~~~~ Buzziland & Co ~~~~\n\n");

        Boolean esc = false;
        do{//ciclo per la ripetizione del menù fino alla esplicita uscita del cliente
            System.out.println("Sei nel Carrello: ");
            System.out.println("1) Inserisci Prodotto\n" +//scelte
                    "2) Calcola prezzo totale\n" +
                    "3) Calcola calorie Totali\n" +
                    "4) Visualizza contenuto\n" +
                    "5) EXIT\n");
            choose = ConsoleInput.readInt("Inserisci la tua scelta:");
            switch (choose) {
                case 1:// inserisco il prodoto nel carrello utilizzando una variabile di appoggio
                    do {
                        choose = ConsoleInput.readInt("Che tipo di porodotto è?: \n" +
                                "1) Freschi \n" +
                                "2) Conservati \n" +
                                "3) Abbigliamento \n");
                    }while (choose > 3 && choose<=0) ;
                    switch (choose) {
                        case 1:
                            Boolean conf = true;
                            choose = ConsoleInput.readInt("Inserire 1 se si tratta di un prodotto confezionato:");
                            if (choose != 1)
                                conf = false;
                            Freschi ap = new Freschi(ConsoleInput.readString("Inserisci Codice: "), ConsoleInput.readDouble("Inserisci Prezzo: "), ConsoleInput.readString("Inserisci Descrizione: "), ConsoleInput.readDouble("Inserisci Peso: "), ConsoleInput.readDouble("Inserisci Calorie: "), conf);
                            carrello.inserisciProdotto(ap);
                            break;
                        case 2:
                            Conservati app = new Conservati(ConsoleInput.readString("Inserisci Codice: "), ConsoleInput.readDouble("Inserisci Prezzo: "), ConsoleInput.readString("Inserisci Descrizione: "), ConsoleInput.readDouble("Inserisci Peso: "), ConsoleInput.readDouble("Inserisci Calorie: "),ConsoleInput.readString("Inserisci Marca: "));
                            carrello.inserisciProdotto(app);
                            break;
                        case 3:
                            Abbigliamento appp = new Abbigliamento(ConsoleInput.readString("Inserisci Codice: "), ConsoleInput.readDouble("Inserisci Prezzo: "),ConsoleInput.readString("Inserisci 'M' se Maschile o 'F' se Femminile: "),ConsoleInput.readString("Inserisci Taglia: "),ConsoleInput.readString("Inserisci Tipologia: "));
                            carrello.inserisciProdotto(appp);
                            break;
                    }
                    break;
                case 2:// utilizzo i metodi già esistenti
                    System.out.println(carrello.calcolaPrezzoTotale());
                    break;
                case 3:
                    System.out.println(carrello.calcolaCalorieTotali());
                    break;
                case 4://to string
                    for ( int i = 0; i < carrello.contenutoCarrello.size(); i++){
                        if (carrello.contenutoCarrello.get(i) instanceof Freschi){
                            System.out.println(((Freschi) carrello.contenutoCarrello.get(i)).toString());
                        }
                        if (carrello.contenutoCarrello.get(i) instanceof Conservati){
                            System.out.println(((Conservati) carrello.contenutoCarrello.get(i)).toString());
                        }
                        if (carrello.contenutoCarrello.get(i) instanceof Abbigliamento){
                            System.out.println(((Abbigliamento) carrello.contenutoCarrello.get(i)).toString());
                        }
                    }
                    break;
                case 5:
                    esc = true;
                    break;
                default:
                    System.out.println("ERRORE NUMERO INCOMPATIBILE");

            }
        }while(esc == false);
        System.out.println("Grazie e Arrivederci");

    }
}
