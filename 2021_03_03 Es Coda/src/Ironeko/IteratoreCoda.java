package Ironeko;

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratoreCoda<T> implements Iterator<T>, Serializable {
    Nodo<T> current;

    public IteratoreCoda(Nodo<T> current){ this.current = current; }

    public boolean hasNext() {
        return current != null;
    }

    public T next() {
        if (!hasNext()) throw new NoSuchElementException();
        Nodo<T> out = current;
        this.current = current.getNext();
        return out.getInfo();
    }

    public void remove()  throws IndexOutOfBoundsException {
        if(hasNext() && current != null)
            this.current = current.getNext();
        else if(current != null)
            this.current = null;
        else
            throw new IndexOutOfBoundsException();

    }

}
