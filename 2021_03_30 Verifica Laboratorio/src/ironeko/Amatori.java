package ironeko;

public class Amatori extends Atleti{
//esperienza amatori
    private String esperienza;
//costruttore amatore
    public Amatori(String nome, String cognome, int dataDiNascita, String disciplina, int numeroDiTessera, int dataDiScadenzaAbbonamento, int dataDiAbbonamento, String esperienza) {
        super(nome, cognome, dataDiNascita, disciplina, numeroDiTessera, dataDiScadenzaAbbonamento, dataDiAbbonamento);
        this.esperienza = esperienza;
    }
//getter e setter amatori
    public String getEsperienza() {
        return esperienza;
    }

    public void setEsperienza(String esperienza) {
        this.esperienza = esperienza;
    }
//toString amatore
    @Override
    public String toString() {
        return "\nAmatori{" +
                "esperienza='" + esperienza + '\'' +
                "} " + super.toString();
    }
}
