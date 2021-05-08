package ironeko;

public abstract class Atleti {
//attributi comuni a tutti gli atleti
    private String nome;
    private String cognome;
    private int dataDiNascita;
    private String disciplina;
    private int numeroDiTessera;
    private int dataDiScadenzaAbbonamento;
    private int dataDiAbbonamento;
 // costruttore per gli atleti
    public Atleti(String nome, String cognome, int dataDiNascita, String disciplina, int numeroDiTessera, int dataDiScadenzaAbbonamento, int dataDiAbbonamento) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.disciplina = disciplina;
        this.numeroDiTessera = numeroDiTessera;
        this.dataDiScadenzaAbbonamento = dataDiScadenzaAbbonamento;
        this.dataDiAbbonamento = dataDiAbbonamento;
    }
// getter e setter atleti
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(int dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getNumeroDiTessera() {
        return numeroDiTessera;
    }

    public void setNumeroDiTessera(int numeroDiTessera) {
        this.numeroDiTessera = numeroDiTessera;
    }

    public int getDataDiScadenzaAbbonamento() {
        return dataDiScadenzaAbbonamento;
    }

    public void setDataDiScadenzaAbbonamento(int dataDiScadenzaAbbonamento) {
        this.dataDiScadenzaAbbonamento = dataDiScadenzaAbbonamento;
    }

    public int getDataDiAbbonamento() {
        return dataDiAbbonamento;
    }

    public void setDataDiAbbonamento(int dataDiAbbonamento) {
        this.dataDiAbbonamento = dataDiAbbonamento;
    }
// toString atleti
    @Override
    public String toString() {
        return "Atleti{\n\t" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                ", disciplina='" + disciplina + '\'' +
                ", numeroDiTessera=" + numeroDiTessera +
                ", dataDiScadenzaAbbonamento=" + dataDiScadenzaAbbonamento +
                ", dataDiAbbonamento=" + dataDiAbbonamento +
                "}";
    }
}
