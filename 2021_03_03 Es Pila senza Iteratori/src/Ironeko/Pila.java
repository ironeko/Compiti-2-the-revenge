package Ironeko;

public class Pila<T> {

    //attributi
    private Nodo<T> testa;

    //costruttore
    public Pila() {
        testa=null;//facoltativo
    }

    //metodi gestione pila

    //test pila vuota
    public boolean pilaVuota() {
        if (testa==null) return true;
        else return false;
    }

    //metodo push (inserimento in testa)
    public void push(T info) {
        Nodo<T> app= new Nodo<T>(info);

        /*ho creato un nuovo nodo (in giallo) chiamato app, che contiene
        l’oggetto (informazione) da aggiungere alla pila; ora lo devo
        collegare alla struttura esistente, in testa*/

        app.setNext(testa);

        /*A questo punto devo cambiare la testa della pila,
        perché la nuova testa è il nodo giallo*/

        testa=app;
    }

    //metodo pop (estrazione dalla testa)
    public T pop() {
        if(pilaVuota()) {
            return null;
        }

        //metodo pop (estrazione dalla testa)

        T app=testa.getInfo();

        //metodo pop (estrazione dalla testa)

        testa=testa.getNext();
        return app;
    }

    //calcolo lunghezza

    /*versione senza iteratore: devo conoscere i
    dettagli implementativi. In questo caso devo fare
    un ciclo while, fino a che non arrivo a null:*/

    public int lunghezza() {
        int l=0;
        Nodo<T> app=testa;
        while(app!=null) {
            l++;
            app=app.getNext();
        }
        return l;
    }
    /*toString: algoritmo molto simile a quello precedente*/

    // Aggiunta metodi: Lettura in testa, Ricerca

    public boolean ricerca(T ric) {
        Nodo<T> app=testa;
        while(app!=null) {
            if (app == ric)
                return true;
            app=app.getNext();
        }
        return false;
    }

    public T letturaInTesta() {
        if(pilaVuota())
            return null;
        else
            return testa.getInfo();
    }

    public String toString() {
        String appS=
                "";
        Nodo<T> appN=testa;
        while(appN!=null) {
            appS+=appN.toString();
            appN=appN.getNext();
        }
        return appS;
    }
}
