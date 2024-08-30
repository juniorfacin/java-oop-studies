package br.com.screenmatch;

import br.com.screenmatch.model.Aluno;
import br.com.screenmatch.model.Musica;
import br.com.screenmatch.model.Pessoa;
import br.com.screenmatch.model.CalculadoraDobro;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Digite o seu nome: ");
//        String nome = sc.nextLine();
//
//        Pessoa pessoa1 = new Pessoa(nome);
//        pessoa1.dizerOla();

//        System.out.println("Insira um número para Calcular o dobro: ");
//        int number = sc.nextInt();
//        CalculadoraDobro numero1 = new CalculadoraDobro(number);
//        int resultado = numero1.calcularDobro();
//
//        System.out.println("O dobro de " + number + " é: " + resultado);

//        Musica musica = null;
//
//        int menu;
//        do {
//            System.out.println("Bem-vindo ao avaliador de Músicas!\n" +
//                    "1 - Criar música\n" +
//                    "2 - Exibir ficha técnica\n" +
//                    "3 - Avaliar sua Música\n" +
//                    "4 - Média das Avaliações\n" +
//                    "0 - Sair");
//
//            menu = sc.nextInt();
//            sc.nextLine();
//
//            switch (menu) {
//                case 1:
//                    System.out.println("Digite o título da música:");
//                    String titulo = sc.nextLine();
//                    System.out.println("Digite o nome do artista:");
//                    String artista = sc.nextLine();
//                    System.out.println("Digite o ano de lançamento:");
//                    int anoDeLancamento = sc.nextInt();
//
//                    musica = new Musica(titulo, artista, anoDeLancamento);
//                    System.out.println("Música criada com sucesso!\n");
//                    break;
//
//                case 2:
//                    if (musica != null) {
//                        musica.exibirFichaTecnica();
//                    } else {
//                        System.out.println("Nenhuma música criada ainda.\n");
//                    }
//                    break;
//
//                case 3:
//                    if (musica != null) {
//                        System.out.println("Dê sua nota entre 1 e 10:");
//                        int nota = sc.nextInt();
//                        musica.avaliarMusica(nota);
//                    } else {
//                        System.out.println("Nenhuma música criada ainda.\n");
//                    }
//                    break;
//
//                case 4:
//                    if (musica != null) {
//                        double media = musica.calcularMediaDeAvaliacao();
//                        if (media > 0) {
//                            System.out.printf("A média das avaliações da música '%s' é %.2f%n", musica.getTitulo(), media);
//                        }
//                    } else {
//                        System.out.println("Nenhuma música criada ainda.\n");
//                    }
//                    break;
//
//                case 0:
//                    System.out.println("Saindo...");
//                    break;
//
//                default:
//                    System.out.println("Opção inválida, tente novamente.\n");
//            }
//        } while (menu != 0);

        System.out.println("Bem-vindo Aluno, digite seu Nome e Idade");
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Idade: ");
        int idade = sc.nextInt();
        Aluno aluno = new Aluno(nome, idade);

        aluno.exibirDadosAluno();

        sc.close();
    }
}
