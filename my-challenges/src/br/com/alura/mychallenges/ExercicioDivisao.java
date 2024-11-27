package br.com.alura.mychallenges;

import java.util.Scanner;

public class ExercicioDivisao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextInt();

        scanner.nextLine();

        try {

            double resultado = num1 / num2;
            System.out.printf("Resultado da divisão: %.2f%n", resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por 0 não permitida.");;
        }

    }
}
