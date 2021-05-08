package ironeko;

import java.util.Calendar;

public class Agonisti extends Atleti {
//categoria agoniti
    private String categoria;
//costruttore agonisti
    public Agonisti(String nome, String cognome, int dataDiNascita, String disciplina, int numeroDiTessera, int dataDiScadenzaAbbonamento, int dataDiAbbonamento) {
        super(nome, cognome, dataDiNascita, disciplina, numeroDiTessera, dataDiScadenzaAbbonamento, dataDiAbbonamento);
        this.categoria = calcoloCategoria(dataDiNascita);
    }

    /**
     * calcolo categoria agonisti
     * @param dataDiNascita
     * @return
     */
    private String calcoloCategoria(int dataDiNascita) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());

        int mYear = calendar.get(Calendar.YEAR);

        if (mYear -dataDiNascita/10000 < 19) {
            return "junior";
        } else if (mYear -dataDiNascita/10000 < 40) {
            return "senior";
        }
        return "gentleman";
    }
//getter e setter agonisti
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
//toString agonisti
    @Override
    public String toString() {
        return "\nAgonisti{" +
                "categoria='" + categoria + '\'' +
                "} " + super.toString();
    }
}
