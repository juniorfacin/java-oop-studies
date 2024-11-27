package br.com.alura.mychallenges;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaGitHub {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do usuário do GitHub: ");

        String username = sc.nextLine();

        String address = "https://api.github.com/users/" + username;;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(address))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado.");
            }

            String json = response.body();
            System.out.println(json);
        } catch (IOException | InterruptedException e) {
            System.out.println("Opss...Houve um erro durante a consulta.");
            e.printStackTrace();

        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }
    }
}
