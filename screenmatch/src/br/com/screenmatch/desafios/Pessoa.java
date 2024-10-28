package br.com.screenmatch.desafios;

public class Pessoa {
    private String nome;
    private int idade;

   public String getNome() {
       return nome;
   }

   public void setNome(String nome) {
       this.nome = nome;
   }

   public int getIdade() {
       return idade;
   }

   public void setIdade(int idade) {
       this.idade = idade;
   }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " - Idade: " + this.getIdade() + " anos;";
    }

    public void dizerOla() {
        System.out.println("Olá mundo, aqui é o(a) " + this.nome);
    }
}




