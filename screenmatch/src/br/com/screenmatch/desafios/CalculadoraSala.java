package br.com.screenmatch.desafios;

public class CalculadoraSala implements CalcGeometrico {

    @Override
    public void calcularArea(double altura, double largura) {
        double area = largura * altura;
        System.out.printf("Valor da area: %.0f%n", area);    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = largura * 2;
        System.out.printf("Valor do perímetro: %.0f%n", perimetro);    }
}
