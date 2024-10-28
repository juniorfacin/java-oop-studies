package br.com.screenmatch.desafios;

public class ConversorTemp {

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Conversor de Temperatura!");

        double tempCelcius = 35.0;

        double tempFahrenheit = (tempCelcius * 1.8) + 32;

        System.out.printf("A temperatura em Celsius: %.2f e em Fahrenheit: %.2f%n", tempCelcius, tempFahrenheit);

        // Casting
        int tempFahrenheitInteira = (int) tempFahrenheit;
        System.out.println("Temperatura em Fahrenheit (inteiro): " + tempFahrenheitInteira);
    }
}
