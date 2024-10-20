package br.com.alura.screenmatch.desafios;

public class ContaBancaria {
    private int numeroConta;
    private double saldoConta;
    public String titularConta;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void exibirDadosConta() {
        System.out.printf("******************* %n" +
                "Titular: %s%n" +
                "Número da Conta: %d%n" +
                "Saldo: R$ %.2f%n" +
                "******************* %n", titularConta, numeroConta, saldoConta);
    }
}


