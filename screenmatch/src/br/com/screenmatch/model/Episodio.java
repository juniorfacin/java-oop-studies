package br.com.screenmatch.model;

import br.com.screenmatch.calculos.Classificavel;

public class Episodio extends Titulo implements Classificavel {
    private int numero;
    private Serie serie;
    private int totalVisualizacoes;

    public Episodio(String nome, int anoDeLancamento) {

        super(nome, anoDeLancamento);
    }

    public int getNumero() {

        return numero;
    }

    public void setNumero(int numero) {

        this.numero = numero;
    }

    public Serie getSerie() {

        return serie;
    }

    public void setSerie(Serie serie) {

        this.serie = serie;
    }

    public int getTotalVisualizacoes() {

        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {

        this.totalVisualizacoes = totalVisualizacoes;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
