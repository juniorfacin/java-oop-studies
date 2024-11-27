package br.com.screenmatch.principal;

import br.com.screenmatch.exceptions.ErroDeConversaoDeAnoException;
import br.com.screenmatch.model.Titulo;
import br.com.screenmatch.model.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.bind.util.ISO8601Utils;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();

        // Fazer um json builder para mudar a Politica de Nomenclatura
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        while (!busca.equalsIgnoreCase("Sair")) {

            System.out.println("Digite o filme para a busca:");
            busca = scanner.nextLine();

            if (busca.equalsIgnoreCase("Sair")) {
                break;
            }

            // Insira a API Key para que o código possa funcionar
            String endereco =
                    "https://www.omdbapi.com/?t="
                      + busca.replace(" ", "+")
                      + "&apikey=CHAVEAPI";
            System.out.println(endereco);

            try {

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo convertido.");
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }

        }

        System.out.println(titulos);
        System.out.println("O programa finalizou corretamente.");

        scanner.close();
    }


}

