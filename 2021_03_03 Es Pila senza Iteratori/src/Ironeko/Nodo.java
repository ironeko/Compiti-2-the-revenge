package Ironeko;

public class Nodo<T> {

    //attributi
    private T info; //informazione del nodo; il tipo è quello degli oggetti della collezione
    private Nodo<T> next; //collegamento con l'elemento successivo, che è sempre un nodo

    //costruttore
    public Nodo(T info){
        this.info=info;
        this.next=null;
    }

    //get e set
    public T getInfo() {
        return info;
    }
    public void setInfo(T info) {
        this.info = info;
    }
    public Nodo<T> getNext() {
        return next;
    }
    public void setNext(Nodo<T> next) {
        this.next = next;
    }
    public String toString() {
        return info.toString();
    }
}
