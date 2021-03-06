package Ironeko;

public class Coda<T> implements Iterable<T> {

    //attributi
    private Nodo<T> testa;
    private Nodo<T> coda;

    //costruttore
    public Coda(T data) {
        this.testa = new Nodo<>(data);
        this.coda = this.testa;
    }

    //metodi gestione coda

    //test coda vuota
    public boolean codaVuota() {
        return testa == null && coda == null;
    }

    //metodo enqueue(inserimento in coda)
    public void enqueue(T info) {
        Nodo<T> app= new Nodo<T>(info);

        app.setPrev(coda);
        coda.setNext(app);
        coda = app;

    }

    //metodo dequeue (estrazione dalla testa)
    public T dequeue() {
        if(codaVuota()) { return null; }

        //metodo dequeue (estrazione dalla testa)

        T app=testa.getInfo();

        //metodo dequeue (estrazione dalla testa)

        testa=testa.getNext();
        return app;
    }

    //calcolo lunghezza

    /*versione senza iteratore: devo conoscere i
    dettagli implementativi. In questo caso devo fare
    un ciclo while, fino a che non arrivo a null:*/

    public int lunghezza() {
        int l=0;
        Nodo<T> app=coda;
        while(app!=null) {
            l++;
            app=app.getPrev();
        }
        return l;
    }

    //Aggiuna iteratore

    @Override
    public Iteratore<T> iterator() {
        return new Iteratore<T>(testa);
    }

    public IteratoreCoda<T> iteratore() {
        return new IteratoreCoda<T>(coda);
    }

    public String toString() {
        String appS=
                "";
        Nodo<T> appN=coda;
        while(appN!=null) {
            appS+=appN.toString();
            appN=appN.getPrev();
        }
        return appS;
    }
}
