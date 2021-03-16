package Ironeko;

import java.sql.Timestamp;

public class Mail {
    private String mittente;
    private String oggetto;
    private Timestamp data;
    private String testo;

    public Mail() {}

    public Mail(String mittente, String oggetto, Timestamp data, String testo) {
        this.mittente = mittente;
        this.oggetto = oggetto;
        this.data = data;
        this.testo = testo;
    }

    public String getMittente() {
        return mittente;
    }

    public void setMittente(String mittente) {
        this.mittente = mittente;
    }

    public String getOggetto() {
        return oggetto;
    }

    public void setOggetto(String oggetto) {
        this.oggetto = oggetto;
    }

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "mittente='" + mittente + '\'' +
                ", oggetto='" + oggetto + '\'' +
                ", data=" + data +
                ", testo='" + testo + '\'' +
                '}';
    }
}
