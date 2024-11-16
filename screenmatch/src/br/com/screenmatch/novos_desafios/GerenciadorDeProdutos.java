package br.com.screenmatch.novos_desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeProdutos {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Produto> produtos = new ArrayList<>();


    public void adicionarProduto() {
        System.out.println("Digite o nome do produto para ser adicionado: ");
        Produto produto = new Produto();
        produto.setNome(scanner.nextLine());
        System.out.println("Digite o preço do produto: ");
        produto.setPreco(scanner.nextDouble());
        scanner.nextLine();
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void listarProdutos() {
        System.out.println("Listando os produtos: ");
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - R$ " + produto.getPreco());
        }
        System.out.println("*************** \n");
    }

    public void calcularMediaDePreco () {
        if (produtos.isEmpty()) {
            System.out.println("A lista está vazia, cadastre produtos!");
        } else {

            double totalDePreco = 0;
            for (Produto produto : produtos) {
                totalDePreco += produto.getPreco();
            }

            double mediaDePreco = totalDePreco / produtos.size();
            System.out.printf("O preço médio dos produtos: %.2f%n", mediaDePreco);
        }
    }
}
