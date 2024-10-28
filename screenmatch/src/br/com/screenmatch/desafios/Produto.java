package br.com.screenmatch.desafios;

public class Produto {
    private String nomeProduto;
    private double precoProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public void calcularDesconto(double desconto) {
        if (desconto >= 10 && desconto <= 50) {
            double valorDesconto = precoProduto - ((desconto /100 ) * precoProduto);
            System.out.printf("O preço do %s com desconto é: R$ %.2f%n", nomeProduto, valorDesconto);
        } else {
            System.out.println("Número informado é inválido, tente novamente.");
        }
    }
}
