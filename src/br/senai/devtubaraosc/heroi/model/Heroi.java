package br.senai.devtubaraosc.heroi.model;

public class Heroi {
    private String nome;
    private String superpoder;
    private int idade;

    public Heroi(String nome, String superpoder, int idade) {
        this.nome = nome;
        this.superpoder = superpoder;
        this.idade = idade;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
