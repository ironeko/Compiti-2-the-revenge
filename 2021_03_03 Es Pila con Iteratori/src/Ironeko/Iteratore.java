package Ironeko;

import java.io.Serializable;
import java.util.Iterator;

public class Iteratore<T> implements Iterator, Serializable {
    Nodo<T> current;

    public Iteratore(Nodo<T> current){ this.current = current; }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Object next() {
        Nodo<T> out = current;
        this.current = current.getNext();
        return out.getInfo();
    }

    @Override
    public void remove()  throws IndexOutOfBoundsException {
        if(hasNext() && current != null)
            this.current = current.getNext();
        else if(current != null)
            this.current = null;
        else
            throw new IndexOutOfBoundsException();

    }

}
