package br.com.screenmatch.desafios;
import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double  mediaDeAvaliacao = 0;
        double nota = 0;
        int qtdNotas = 0;

        while (nota != -1) {
            System.out.println("Digite as Notas para o Cálculo de Média ou -1 para sair: ");
            nota = scanner.nextDouble();
            scanner.nextLine();

            if (nota != -1) {
                mediaDeAvaliacao += nota;
                qtdNotas++;
            }
        }

        mediaDeAvaliacao /= qtdNotas;
        System.out.printf("Média do Aluno: %.2f%n", mediaDeAvaliacao);

        // Método para tratar um possível loop infinito
        int contador = 1;
        while (contador <= 10) {
            System.out.printf("%d ", contador);
            contador++;
        }

        scanner.close();
    }
}
