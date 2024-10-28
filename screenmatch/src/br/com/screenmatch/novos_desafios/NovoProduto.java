package br.com.screenmatch.novos_desafios;

public class NovoProduto {
    String nome;
    double preco;
    int quantidade;

    public NovoProduto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "NovoProduto: " +
                "\nNome: " + nome +
                "\nPreco: " + preco +
                "\nQuantidade: " + quantidade;
    }
}
