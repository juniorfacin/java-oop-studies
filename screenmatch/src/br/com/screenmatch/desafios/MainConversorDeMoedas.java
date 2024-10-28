package br.com.screenmatch.desafios;

public class MainConversorDeMoedas {
    public static void main(String[] args) {
        Moeda real = new Moeda();

        real.setTipo("Real");
        real.setValor(100);

        System.out.printf("O valor de R$ %.2f reais será: R$ %.2f em dolar.%n",
                real.getValor(), real.conversorDeMoedas(5.45));
    }
}
