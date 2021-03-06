package Ironeko;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Aereodromo implements Serializable {

    private ArrayList<Aereomobile> aerei = new ArrayList<>();

    public Aereodromo(ArrayList<Aereomobile> aerei) {
        this.aerei = aerei;
    }

    public ArrayList<Aereomobile> getAerei() {
        return aerei;
    }

    public void setAerei(ArrayList<Aereomobile> aerei) {
        this.aerei = aerei;

    }

    public Aereodromo() {}

    public Aereomobile getAereo(int i) {
        return aerei.get(i);
    }

    public boolean addAereo(Aereomobile app) {
        return this.aerei.add(app);

    }

    public boolean delete (String i){
        return aerei.remove(search(i));
    }

    public Aereomobile search (String i){
        return aerei.stream()
                .filter(aereomobile -> aereomobile.getSigla().equals(i))
                .findFirst()
                .orElse(null);
    }

    @Override// a jacopo non piaceva il toString
    public String toString() {
        return "Aereodromo{" +
                "aerei=\n" + aerei.stream()
                .map(aereomobile -> " - " + aereomobile.toString())
                .collect(Collectors.joining("\n")) +
                '}';
    }



}
