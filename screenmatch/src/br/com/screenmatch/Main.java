package br.com.screenmatch;


import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.calculos.FiltroRecomendacao;
import br.com.screenmatch.model.Episodio;
import br.com.screenmatch.model.Filme;
import br.com.screenmatch.model.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
//        meuFilme.setNome("O poderoso chefão");
//        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.printf("A média das avaliações é: %.2f%n", meuFilme.pegaMedia());
//        meuFilme.getSomaDasAvaliacoes();
//        meuFilme.getTotalDeAvaliacoes();
//        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
//        lost.setNome("Lost");
//        lost.setAnoDeLancamento(2000);
        lost.exibirFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
//        outroFilme.setNome("Avatar");
//        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        System.out.println("*****************");
        System.out.println("Filtro de Recomendação:");
        filtro.filtra(meuFilme);

        Episodio episodioLost = new Episodio("Lost", 2000);
//        episodioLost.setNome("Lost");
//        episodioLost.setAnoDeLancamento(2000);
        episodioLost.setNumero(1);
        episodioLost.setSerie(lost);
        episodioLost.setTotalVisualizacoes(300);
        episodioLost.exibirFichaTecnica();
        filtro.filtra(episodioLost);

        var filmeNovo = new Filme("Dogville", 2003);
//        filmeNovo.setNome("Dogville");
        filmeNovo.setDuracaoEmMinutos(200);
//        filmeNovo.setAnoDeLancamento(2003);
        filmeNovo.avalia(10);

        var listaFilmes = new ArrayList<Filme>();
//        ArrayList<Filme> listaFilmes = new ArrayList<>();

        listaFilmes.add(filmeNovo);
        listaFilmes.add(meuFilme);
        listaFilmes.add(outroFilme);

        System.out.println("\nFilme escolhido: " + listaFilmes.get(0).getNome());
        System.out.println("\nFilme escolhido: " + listaFilmes.get(0).toString());
        System.out.println("Tamanho do Array: " + listaFilmes.size());

        System.out.println(listaFilmes);
    }
}
