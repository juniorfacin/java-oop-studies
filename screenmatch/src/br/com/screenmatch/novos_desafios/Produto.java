package br.com.screenmatch.novos_desafios;


public class Produto {
    private String nome;
    private double preco;
    private Integer quantidade;

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
}
