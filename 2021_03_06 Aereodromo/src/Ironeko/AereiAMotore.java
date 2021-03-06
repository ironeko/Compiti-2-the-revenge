package Ironeko;

import java.io.Serializable;

public class AereiAMotore extends Aereomobile implements Serializable {
    private double potenza;

    public AereiAMotore(String sigla, double potenza) {
        super(sigla);
        this.potenza = potenza;
    }

    public double getPotenza() {
        return potenza;
    }

    public void setPotenza(double potenza) {
        this.potenza = potenza;
    }

    @Override
    public int compareTo(Aereomobile aereo) throws ClassCastException{
        return ((int) ((this.potenza - ((AereiAMotore) aereo).getPotenza()) * 100));
    }

    @Override
    public String toString() {
        return "AereiAMotore{" +
                "Sigla='" + Sigla + '\'' +
                ", potenza=" + potenza +
                "} ";
    }
}
