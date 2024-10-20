package br.com.alura.screenmatch.desafios;

public class Moeda implements ConversorDeMoedas {
    private String tipo;
    private double valor;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double conversorDeMoedas(double taxaConversao) {
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor: R$ " + valor);
        return valor * taxaConversao;
    }
}
