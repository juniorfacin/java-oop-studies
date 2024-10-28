package br.com.screenmatch.novos_desafios;

import br.com.screenmatch.novos_desafios.NovoProduto;

import java.util.ArrayList;

public class Compras {
    public static void main(String[] args) {

        ArrayList<NovoProduto> listaDeProdutos = new ArrayList();

        NovoProduto produto1 = new NovoProduto("Banana", 10.00, 12);
        NovoProduto produto2 = new NovoProduto("Maçã", 20.00, 12);
        NovoProduto produto3 = new NovoProduto("Carne Moída", 30.00, 12);
        ProdutoPerecivel produto4 = new ProdutoPerecivel("Pão Integral", 12.00,
                12, "27/10/2025");

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        listaDeProdutos.add(produto4);

        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println("Recuperando produtos: " + listaDeProdutos.get(0).getNome());

        for (NovoProduto produto : listaDeProdutos) {
            System.out.println(produto.toString());
        }

        System.out.println("Data de validade do Produto 4: " + produto4.getDataValidade());
    }
}
