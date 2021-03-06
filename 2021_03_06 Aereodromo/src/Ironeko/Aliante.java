package Ironeko;

import java.io.Serializable;

public class Aliante extends Aereomobile implements Serializable {
    private double efficienza;

    public Aliante(String sigla, double efficienza) {
        super(sigla);
        this.efficienza = efficienza;
    }

    public double getEfficienza() {
        return efficienza;
    }

    public void setEfficienza(double efficienza) {
        this.efficienza = efficienza;
    }

    @Override
    public int compareTo(Aereomobile aereo) throws ClassCastException{
        return ((int) ((this.efficienza - ((Aliante) aereo).getEfficienza())*100));
    }

    @Override
    public String toString() {
        return "Aliante{" +
                "Sigla='" + Sigla + '\'' +
                ", efficienza=" + efficienza +
                "} ";
    }
}
