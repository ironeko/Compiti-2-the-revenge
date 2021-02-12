package Ironeko;

import java.io.Serializable;

public class Studente implements Serializable {

    String nome;

    public Studente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Ironeko.Studente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
