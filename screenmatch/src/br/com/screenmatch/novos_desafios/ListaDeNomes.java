package br.com.screenmatch.novos_desafios;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ListaDeNomes {
    public static void main(String[] args) {

           var nomes = new ArrayList<>();
           nomes.add("Junior");
           nomes.add("Bia");
           nomes.add("Leo");
           nomes.add("João");

           nomes.forEach(nome -> System.out.println("Nome: " + nome));

           nomes.forEach(System.out::println);

    }
}
