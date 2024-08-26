package br.com.dominio.screenmatch;

import java.util.Scanner;

public class SistemaFinanceiro {
    public static void main(String[] args) {

        String nome = "Clark Cant";
        String tipoDaConta = "Conta Corrente";
        double saldo = 1599.00;
        int opcao = 0;


        System.out.println("*****************");
        System.out.println(nome);
        System.out.println(tipoDaConta);
        System.out.println(saldo);
        System.out.println("*****************");

        String menu = """
                    **Digite a sua opção**
                    1- Consultar saldo
                    2- Transferir saldo
                    3- Receber valor
                    4- Sair
                    """;
        Scanner scanner = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo atual: R$ " + saldo + "\n");
            } else if (opcao == 2) {
                System.out.print("Digite o valor à ser transferido: R$ ");
                double valorParaTrasnferir = scanner.nextDouble();
                if (valorParaTrasnferir > saldo) {
                    System.out.println("Saldo insuficiente para transferência.");
                } else {
                    saldo -= valorParaTrasnferir;
                    System.out.println("Saldo atual: R$ " + saldo + "\n");
                }
            }  else if (opcao == 3) {
                System.out.print("Digite o valor recebido: R$ ");
                double valorRecebido = scanner.nextDouble();
                saldo += valorRecebido;
                System.out.println("Seu saldo atual: R$ " + saldo + "\n");
            }
        }
    }
}
