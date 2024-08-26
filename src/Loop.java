import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mediaAvaliacao = 0;
        int qtdNotas = 0;

        System.out.println("Informe a quantidade de notas: ");
        qtdNotas = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite as notas de acordo com a quantidade informada: ");
        for (int i = 0; i < qtdNotas; i++) {
            int nota = scanner.nextInt();
            mediaAvaliacao += nota;
        }
        mediaAvaliacao /= qtdNotas;
        System.out.printf("Média das Notas: %.2f%n", mediaAvaliacao);

        scanner.close();
        }
    }

