package br.com.alura.mychallenges;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TaskPerson {
    public static void main(String[] args) {

        String json = "{\"nome\":\"Junior\",\"idade\":30,\"cidade\":\"São Paulo\"}";;

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        // Conversão JSON para Objeto
        Person person1 = gson.fromJson(json, Person.class);

        System.out.println(json);

    }
}
