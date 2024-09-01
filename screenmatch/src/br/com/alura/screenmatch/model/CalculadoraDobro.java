package br.com.alura.screenmatch.model;

public class CalculadoraDobro {
    int number;

    public CalculadoraDobro(int number) {
        this.number = number;
    }

    // Ao usar o int eu posso reutilizar o valor no meu código main.
    public int  calcularDobro() {
        return  this.number * 2;
    }
}
