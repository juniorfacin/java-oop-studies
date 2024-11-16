package br.com.screenmatch.principal;

import br.com.screenmatch.model.Titulo;
import br.com.screenmatch.model.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o filme para a busca:");

        var busca = scanner.nextLine();
        String myKey = "13ac755e";
        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=" + myKey;


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        String json = response.body();


        // Fazer um json builder para mudar a Politica de Nomenclatura
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        // Titulo title = gson.fromJson(json, Titulo.class);

        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);

        // Essa impressão já foi convertida pela Record e pelo Construtor
        Titulo outroTitulo = new Titulo(meuTituloOmdb);
        System.out.println(outroTitulo);


        scanner.close();

    }
}

