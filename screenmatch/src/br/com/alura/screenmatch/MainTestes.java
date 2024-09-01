package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.ContaBancaria;
import br.com.alura.screenmatch.model.IdadePessoa;
import br.com.alura.screenmatch.model.Produto;
import br.com.alura.screenmatch.model.MediaAluno;
import br.com.alura.screenmatch.model.Livro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTestes {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.titularConta = "Júnior";
        conta.setNumeroConta(123);
        conta.setSaldoConta(1000.00);
        conta.exibirDadosConta();

        IdadePessoa pessoa = new IdadePessoa();

        pessoa.setNome("João");
        pessoa.setIdade(18);
        pessoa.verificaIdade();

        Produto produto = new Produto();

        produto.setNomeProduto("Camiseta");
        produto.setPrecoProduto(200.00);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe um número entre 10 e 50 para calcular o desconto: ");

            if (scanner.hasNextDouble()) {
                double desconto = scanner.nextDouble();
                produto.calcularDesconto(desconto);
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira um número.");
        }

        MediaAluno aluno1 = new MediaAluno("Lulu", 7.5, 8.0, 9.2);
        MediaAluno aluno2 = new MediaAluno("Karina", 6.8, 7.3, 8.5);

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println();

        System.out.println("Aluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Média: " + aluno2.calcularMedia());


        Livro livro1 = new Livro();
        livro1.setTitulo("Lógica de Programação");
        livro1.setAutor("Paulo Silveira");

        Livro livro2 = new Livro();
        livro2.setTitulo("A lógica do jogo");
        livro2.setAutor("Marcus Becker");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();

    }
}

