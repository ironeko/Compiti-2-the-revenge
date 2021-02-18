package Ironeko;

import java.io.Serializable;

public abstract class Vagoni implements Serializable {
    String codice;
    double tara;
    String costruttore;
    int anno;

    public Vagoni(String codice, double tara, String costruttore, int anno) {
        this.codice = codice;
        this.tara = tara;
        this.costruttore = costruttore;
        this.anno = anno;
    }

    public String getCodice() {
        return codice;
    }

    public double getTara() {
        return tara;
    }

    public String getCostruttore() {
        return costruttore;
    }

    public int getAnno() {
        return anno;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public void setTara(double tara) {
        this.tara = tara;
    }

    public void setCostruttore(String costruttore) {
        this.costruttore = costruttore;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Vagoni{" +
                "codice='" + codice + '\'' +
                ", tara=" + tara +
                ", costruttore='" + costruttore + '\'' +
                ", anno=" + anno +
                '}';
    }
}
