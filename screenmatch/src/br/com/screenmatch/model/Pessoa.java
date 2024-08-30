package br.com.screenmatch.model;

public class Pessoa {
    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void dizerOla() {
        System.out.println("Olá mundo, aqui é o(a) " + this.nome);
    }
}




