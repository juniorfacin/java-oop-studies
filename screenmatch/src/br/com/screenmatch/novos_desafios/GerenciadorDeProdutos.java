package br.com.screenmatch.novos_desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeProdutos {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Produto> produtos = new ArrayList<>();


    public void adicionarProduto() {
        System.out.println("Digite o nome do produto para ser adicionado: ");
        Produto produto = new Produto();
        produto.setNome(scanner.nextLine());
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void listarProdutos() {
        System.out.println("Listando os produtos: ");
        for (Produto produto : produtos) {
            System.out.println(produto.getNome());
        }
    }
}
