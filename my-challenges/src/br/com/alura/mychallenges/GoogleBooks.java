package br.com.alura.mychallenges;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("******************* \n"+
                            "Digite UMA palavra-chave do Livro (autor, titulo etc.): ");

        var bookInfo = sc.nextLine();
        String address = "https://www.googleapis.com/books/v1/volumes?q=" + bookInfo +
                "APIKEY";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
