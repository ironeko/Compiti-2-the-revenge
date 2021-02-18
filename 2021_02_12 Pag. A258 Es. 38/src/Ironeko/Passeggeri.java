package Ironeko;

public class Passeggeri extends Vagoni{
    private String classe;
    private int postiLiberi;
    private int postiOccupati;

    public Passeggeri(String codice, double tara, String costruttore, int anno, String classe, int postiLiberi, int postiOccupati) {
        super(codice, tara, costruttore, anno);
        this.classe = classe;
        this.postiLiberi = postiLiberi;
        this.postiOccupati = postiOccupati;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getPostiLiberi() {
        return postiLiberi;
    }

    public void setPostiLiberi(int postiLiberi) {
        this.postiLiberi = postiLiberi;
    }

    public int getPostiOccupati() {
        return postiOccupati;
    }

    public void setPostiOccupati(int postiOccupati) {
        this.postiOccupati = postiOccupati;
    }

    @Override
    public String toString() {
        return "Passeggeri{" +
                "classe=" + classe +
                ", postiLiberi=" + postiLiberi +
                ", postiOccupati=" + postiOccupati +
                "} " + super.toString();
    }
}
