package Ironeko;

public class Merci extends Vagoni{
    double volume;
    double maxPeso;
    double Peso;

    public Merci(String codice, double tara, String costruttore, int anno, double volume, double maxPeso, double peso) {
        super(codice, tara, costruttore, anno);
        this.volume = volume;
        this.maxPeso = maxPeso;
        Peso = peso;
    }

    public Merci(){};

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMaxPeso() {
        return maxPeso;
    }

    public void setMaxPeso(double maxPeso) {
        this.maxPeso = maxPeso;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    @Override
    public String toString() {
        return "Merci{" +
                "volume=" + volume +
                ", maxPeso=" + maxPeso +
                ", Peso=" + Peso +
                "} " + super.toString();
    }
}
