package br.com.screenmatch.desafios;

public class Desafio {
    public static void main(String[] args) {
        // 1-Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double nota1 = 9.0;
        double nota2 = 8.0;
        double mediaNotas = (nota1 + nota2) / 2;
        System.out.println("Média das notas: " + mediaNotas + "\n");

        // 2-Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
        double temp1 = 32.5;
        System.out.println("Temperatura com double format: "+ temp1);
        int temp2 = 40;
        int tempMedia = (int) (temp1 + temp2) / 2;
        System.out.println("Media das Tempaturas com Casting: " + tempMedia + "\n");

        // 3-Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
        char letra = 'A';
        String frase = "É a primeira letra do alfabeto: ";
        System.out.println(frase + letra);

        /* 4-Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
       Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.*/
        int qtd = 10;
        double price = 50.00;
        double total = price * qtd;
        System.out.println("Total R$: " + total);

        /*
        Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
        Considere que o valor de 1 dólar é equivalente a 4.94 reais.
        Realize a conversão do valor em dólares para reais e imprima o resultado formatado
         */
        double valorEmDolares = 50.00;
        double dolar = 4.96;
        double dollarConverter = valorEmDolares * dolar;
        System.out.printf("O valor de R$ %.2f em dollar, para reais é R$ %.2f%n", valorEmDolares, dollarConverter);

        /*
        Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto.
        Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao
        produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
         */
        double precoOriginal = 150.0;

        double percentualDesconto = 10.0;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Novo preço com desconto: R$" + novoPreco);
    }
}
