import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ConsultaCep consultaCep = new ConsultaCep();
        System.out.println("Digite o CEP desejado: ");
        var cep = sc.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorArquivo gerador =  new GeradorArquivo();
            gerador.salvarJson(novoEndereco);
        } catch(RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação!");
        }
    }
}
