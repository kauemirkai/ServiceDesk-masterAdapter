package br.usjt.deswebmob.servicedesk.Model;

import java.io.Serializable;

/**
 * Created by arqdsis on 21/03/2018.
 */

class Fila implements Serializable{
    private int id;
    private String nome;



    public int getId() {
        return id;
    }

    public Fila() {
    }

    @Override
    public String toString() {
        return "Fila{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Fila(int id, String nome) {

        this.id = id;
        this.nome = nome;
    }
}
