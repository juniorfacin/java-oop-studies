import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito: ");
        String filme = scanner.nextLine();
        System.out.println("Ano de lançameneto: ");
        int anoDeLancamento = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite a nota de avaliação do Filme: ");
        double notaDeAvaliacao = scanner.nextDouble();
        scanner.nextLine();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(notaDeAvaliacao);

        scanner.close();
    }
}
