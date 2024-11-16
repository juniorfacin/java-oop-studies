package br.com.alura.mychallenges;

import br.com.alura.mychallenges.Person;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonToken;

import java.sql.SQLOutput;
import java.util.concurrent.Flow;

public class FlexibleObject {
    public static void main(String[] args) {

        //String formato JSON
        String jsonPessoa = "{\"name\":\"Bradoc\",\"age\":59,\"location\":\"Detroit\"}";
        String jsonPessoa2 = "{\"name\":\"\",\"age\":61,\"location\":\"Southfield\"}";

        Gson gson = new GsonBuilder().setLenient().create();
        Person pessoa = gson.fromJson(jsonPessoa, Person.class);

        Gson gson2 = new GsonBuilder().setLenient().create();
        Person pessoa2 = gson2.fromJson(jsonPessoa2, Person.class);

        //Imprimindo Objeto flexivel Pessoa
        System.out.println("Objeto primeira Pessoa: " + pessoa);
        //Impressão valor nome ausente
        System.out.println("Objeto segunda Pessoa: " + pessoa2);


        record Publisher(String name, String city, String country) { };

        record Book(String title, String author, Publisher publisher ) { };

        String bookJson = "{\"title\": \"Senhor dos Anéis\", \"author\": \"J.R.R.Tolkein\", " +
                "\"publisher\": { \"name\": \"Harper Collins\", \"city\": \"São Paulo\", \"country\": \"Brasil\"}}";

        Gson gson3 = new GsonBuilder().setLenient().create();

        Book book = gson3.fromJson(bookJson, Book.class);

        System.out.println("Objeto livro: " + book);


    }
}
