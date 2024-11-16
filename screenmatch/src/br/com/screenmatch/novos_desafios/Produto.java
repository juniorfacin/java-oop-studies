package br.com.screenmatch.novos_desafios;


import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private double preco;
    private Integer quantidade;

    public Produto() {

    }

    public Produto(String nome, double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }
    public String getNome() {

        return nome;
    }

    public void setPreco(double preco) {

        this.preco = preco;
    }

    public double getPreco() {

        return preco;
    }

    public void setQuantidade(Integer quantidade) {

        this.quantidade = quantidade;
    }

    public Integer getQuantidade() {

        return quantidade;
    }

    public void calcularMediaDePreco() {


        List<Produto> listaDeProdutos = new ArrayList<>();

    }

}
