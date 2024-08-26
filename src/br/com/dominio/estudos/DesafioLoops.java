package br.com.dominio.estudos;

import java.util.Scanner;

public class DesafioLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*1- Crie um programa que solicite ao usuário digitar um número.
        // Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".*/
        System.out.println("Digite um número para verificar se é Positivo ou Negativo: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("O número é positivo.\n");
        } else {
            System.out.println("O número é negativo.\n");
        }

        /*2-Peça ao usuário para inserir dois números inteiros.
        Compare os números e imprima uma mensagem indicando se são iguais, diferentes,
        o primeiro é maior ou o segundo é maior.*/
        System.out.println("Digite 02 números para verificação: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.println("Os números são iguais!");
        } else if (number1 > number2) {
            System.out.println("O num. 1 é maior!");
        } else {
            System.out.println("O num 2 é maior!");
        }

        /*3- Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e
        "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada. */
        System.out.printf(
                "__Menu__%n" +
                        "Escolha uma das opções:%n" +
                        "1-Calcular área do quadrado.%n" +
                        "2-Calcular a área do circulo.%n" +
                        "3-Sair.%n");

        int op = scanner.nextInt();
        scanner.nextLine();

        switch (op) {
            case 1:
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
                break;
            case 2:
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);
                break;
            case 3:
                System.out.println("Finalizando o programa...");
            default:
                System.out.println("Opção inválida!");
        }

        //4- Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        /* 5- Crie um programa que solicite ao usuário a entrada de um número inteiro.
        Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.*/
        System.out.print("Digite um número inteiro: ");
        int numeroParaTabuada = scanner.nextInt();

        if (numeroParaTabuada % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        // 6-Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
        System.out.print("Digite um número: ");
        int numeroFatorial = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numeroFatorial; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        scanner.close();
    }
}



