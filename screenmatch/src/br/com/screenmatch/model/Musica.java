package br.com.screenmatch.model;

public class Musica {
    private String titulo;
    private String artista;
    private int anoDeLancamento;
    private double avaliacao;
    private int numeroDeAvaliacoes;

    public Musica(String titulo, String artista, int anoDeLancamento) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoDeLancamento = anoDeLancamento;
        this.avaliacao = 0;
        this.numeroDeAvaliacoes = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public int getNumeroDeAvaliacoes() {
        return numeroDeAvaliacoes;
    }

    public void exibirFichaTecnica() {
        System.out.printf("Ficha técnica: %n" +
                "Titulo: %s%n" +
                "Artista: %s%n" +
                "Ano de Lançamento: %d%n", this.titulo, this.artista, this.anoDeLancamento);
    }

    public void avaliarMusica(int nota) {
        if (nota >= 1 && nota <= 10) {
            this.avaliacao += nota;
            this.numeroDeAvaliacoes++;
        } else {
            System.out.println("Nota inválida. Por favor, insira uma nota entre 1 e 10.");
        }
    }

    public double calcularMediaDeAvaliacao() {
        if (this.numeroDeAvaliacoes > 0) {
            return this.avaliacao / this.numeroDeAvaliacoes;
        } else {
            System.out.println("Nenhuma avaliação registrada.");
            return 0;
        }
    }
}
