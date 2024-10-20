package br.com.alura.screenmatch.desafios;

public class IdadePessoa {
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

    public void verificaIdade() {
        if (idade >= 18) {
            System.out.println("\n" + nome + " é maior de idade.\n");
        } else {
            System.out.println("\n" + nome + " é menor do idade.\n");
        }
    }
}

