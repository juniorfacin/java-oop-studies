package br.com.minhascompras.model;

public class Compra implements Comparable<Compra>{
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compras: " +
                "Descricao: " + this.descricao + "\n" +
                "Valor R$" + this.valor;
    }


    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(outraCompra.valor);
    }
}
