package Ironeko;

import java.io.Serializable;
import java.util.ArrayList;

public class Treno implements Serializable {
    ArrayList<Vagoni> treno = new ArrayList<Vagoni>();
    public final double pesoPasseggero = 65;
    public final double motrice = 490000;
    /*
    suppongo che il calcolo vada fatto su un treno carco e pronto a partire,
    ho fatto le presupposizioni su questo treno:

    "Frecciarossa 1000 Elettrotreno
    Massa in servizio: 490 tonnellate
    Massa vuoto	: 454 tonnellate"

    non ho previsto un limite massimo di vagoni, guardando un po' su internet ho trovato questo:

    "The record-breaking ore train from the same company,
    682 cars and 7,300 m long, once carried 82,000 metric tons
    of ore for a total weight of the train,
    largest in the world, of 99,734 tonnes.
    It was driven by eight locomotives distributed along
    its length to keep the coupling loads and curve performance controllable."

    quindi ho deciso di non impostare un limite ma dare la possibilità di avere un treno "infinito"

    Fonte: Wikipedia
     */

    public Treno(ArrayList<Vagoni> treno) {
        this.treno = treno;
    }

    public Treno(){};

    public ArrayList<Vagoni> getTreno() {
        return treno;
    }

    public void setTreno(Treno newTreno) {
        for (int i=0; i<newTreno.getSize();i++){
            aggiungiVagone(newTreno.getVagone(i));
        }
    }

    public double getPesoPasseggero() {
        return pesoPasseggero;
    }

    public double getMotrice() {
        return motrice;
    }

    public void aggiungiVagone(Vagoni nuovo){
        this.treno.add(nuovo);
    }

    public boolean rimuoviVagone(String codice){
        boolean fin = false;
        for (int i=0; i<this.treno.size();i++){
            if (this.treno.get(i).getCodice().equals(codice)){
                this.treno.remove(i);
                fin = true;
            }
        }
        return fin;
    }

    public int getSize(){
        if (this.treno.isEmpty()){
            return 0;
        }
        return this.treno.size();
    }

    public Vagoni getVagone(int index) {
        return treno.get(index);
    }

    public double pesoTotale(){
        double tot=0;
        for(int i=0;i< treno.size(); i++){
            if (treno.get(i) instanceof Passeggeri){
                tot +=  ((Passeggeri) treno.get(i)).getPostiOccupati() * pesoPasseggero;
            }
            else if (treno.get(i) instanceof Merci){
                tot +=  ((Merci) treno.get(i)).getPeso() * pesoPasseggero;
            }
            tot+= treno.get(i).getTara();
        }
        return tot;
    }

    public double pesoTotaleLocomotiva(){
        double tot=0;
        for(int i=0;i< treno.size(); i++){
            if (treno.get(i) instanceof Passeggeri){
                tot +=  ((Passeggeri) treno.get(i)).getPostiOccupati() * pesoPasseggero;
            }
            else if (treno.get(i) instanceof Merci){
                tot +=  ((Merci) treno.get(i)).getPeso() * pesoPasseggero;
            }
            tot+= treno.get(i).getTara();
        }
        return tot+motrice;
    }

    public String MEGAtoString(){
        String finale = this.toString() + "\n";
        for (int i=0; i<this.treno.size();i++){
            finale += this.treno.get(i).toString();
            finale += "\n";
        }
        return finale;
    }

    @Override
    public String toString() {
        return "Treno{" +
                "treno=" + treno +
                ", pesoPasseggero=" + pesoPasseggero +
                ", motrice=" + motrice +
                ", peso senza motrice=" + pesoTotale() +
                ", peso con motrice=" + pesoTotaleLocomotiva() +
                '}';
    }
}
