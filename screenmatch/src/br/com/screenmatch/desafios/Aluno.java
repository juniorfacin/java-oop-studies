package br.com.screenmatch.desafios;

public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("O nome não pode estar vazio ou conter apenas espaços em branco.");
            this.nome = "Nome inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade invalido. A idade deve ser um valor inteiro maior que zero.");
            this.idade = 0;
        }
    }

    public void exibirDadosAluno() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
    }
}

