package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliarFilme(8);
        meuFilme.avaliarFilme(5);
        meuFilme.avaliarFilme(10);
        System.out.println("A soma das avaliação: " + meuFilme.getSomaAvaliacoes());
        System.out.println("Total de Aavaliação: " + meuFilme.getTotalDeAvaliacao());
        System.out.printf("Média: %.2f%n", meuFilme.pegaMedia());
    }
}
