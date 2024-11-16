package br.com.screenmatch.novos_desafios;

import java.util.ArrayList;
import java.util.List;

public class DesafioAnimal {
    public static void main(String[] args) {

        var cachorro1 = new Cachorro("Fiapo de Manga");

        var cachorro2 = new Cachorro("Meg");

        var cachorro3 = new Cachorro("Raica");

        var animal = new Animal("Galinha");

        var animal2 = new Animal("Pardal");

        var cachorro4 = new Cachorro("Rabisco");

        List<Animal> listaDeAnimais = new ArrayList<>();
        listaDeAnimais.add(cachorro1);
        listaDeAnimais.add(cachorro2);
        listaDeAnimais.add(cachorro3);
        listaDeAnimais.add(animal);
        listaDeAnimais.add(animal2 );



        for (Animal animais : listaDeAnimais) {

            if (animais instanceof Cachorro cachorro) {
                System.out.println("É um cachorro(a): " + animais.getNome());
                cachorro.latir();
            } else {
                System.out.println("Esses não são Cachorros: " + animais.getNome());
            }
        }
    }
}
