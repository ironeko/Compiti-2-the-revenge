package Ironeko;

import java.io.Serializable;

public abstract class Aereomobile implements Comparable<Aereomobile>, Serializable {

    String Sigla;

    public Aereomobile(String sigla) {
        Sigla = sigla;
    }

    public String getSigla() {
        return Sigla;
    }

    public void setSigla(String sigla) {
        Sigla = sigla;
    }

    public abstract int compareTo(Aereomobile o);

}
