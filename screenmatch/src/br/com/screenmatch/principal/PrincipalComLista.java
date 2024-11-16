package br.com.screenmatch.principal;

import br.com.screenmatch.model.Filme;
import br.com.screenmatch.model.Serie;
import br.com.screenmatch.model.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComLista {
    public static void main(String[] args) {
        var meuFilme = new Filme("O Poderoso Chefão", 1970);
        meuFilme.avalia(10);
        var outroFilme = new Filme("Avatar", 2020);
        outroFilme.avalia(7);
        var lost = new Serie("Lost", 2000);
        lost.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);

        List<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        lista.add(filmeDoPaulo);

        for (Titulo item : lista) {

            // Fazer um type casting para buscar o getClassificao de Filme
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println(
                        "****************** \n" +
                                "Titulo: " + item.getNome() + "\n" +
                                "Avaliação: " + ((Filme) item).getClassificacao()
                );
            }
        }

        //        Metodo foEach com expressão lambda
        lista.forEach(nome -> System.out.println(nome));

        //        forEach com Method Reference
        lista.forEach(System.out::println);


            List<String> listaNomes = new ArrayList<>();
        listaNomes.add("Júnior");
        listaNomes.add("Bia");
        listaNomes.add("Leo");

        // Imprime na ordem que inserimos
        System.out.println("**********************************");
        System.out.println(listaNomes);
        // Ordena a lista para a impressão na ordem alfatbética
        Collections.sort(listaNomes);
        System.out.println(listaNomes);


        // Verificar a Classe Titulo para entender o metodo compareTo (compara os títulos da lista)
        Collections.sort(lista);
        System.out.println(lista);

        // Forma de comparar com base no Ano de Lancamento usando .sort()
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println("Ordenando por Ano de Lançamento: ");
        System.out.println(lista);
    }
}


