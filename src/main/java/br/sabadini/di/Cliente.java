package br.sabadini.di;

/**
 * Created by felipesabadinifacina on 04/03/18.
 */
public class Cliente {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
