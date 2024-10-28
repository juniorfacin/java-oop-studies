package br.com.screenmatch.novos_desafios;

import java.util.Scanner;

public class DesafioProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GerenciadorDeProdutos gerenciador = new GerenciadorDeProdutos();

        int op;

        do {
            System.out.println(
                    "Bemm-vindo ao Gerenciamento de Produtos:\n" +
                    "1-Cadastrar produto\n" +
                    "2- Listar Produtos\n" +
                    "0- Sair\n"
                    );

            op = scanner.nextInt();

            switch (op) {
                case 1:
                    gerenciador.adicionarProduto();
                    break;
                case 2:
                    gerenciador.listarProdutos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }

        } while (op != 0);

        scanner.close();

    }
}
