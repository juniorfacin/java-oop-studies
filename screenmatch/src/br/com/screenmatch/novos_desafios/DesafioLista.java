package br.com.screenmatch.novos_desafios;

import br.com.screenmatch.desafios.Desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesafioLista {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(50);
        numbers.add(8);
        numbers.add(20);
        numbers.add(32);
        numbers.add(42);
        numbers.add(60);

        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
