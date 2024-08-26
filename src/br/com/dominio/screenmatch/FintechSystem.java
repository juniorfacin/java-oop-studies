package br.com.dominio.screenmatch;


import java.util.Scanner;

public class FintechSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco Java!");
        System.out.println("Informe seus dados para iniciar o sistema.");
        System.out.println("Nome: ");
        String nomeDoCliente = scanner.nextLine();
        System.out.println("Tipo da Conta: ");
        String tipoDeConta = scanner.nextLine();
        System.out.println("Saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("******************* %n" +
                "Nome: %s%n Tipo de Conta: %s%n Saldo inicial: %.2f%n" +
                "******************* %n", nomeDoCliente, tipoDeConta, saldo);

        int op;

        do {
            op = exibirMenu(scanner);

            switch (op) {
                case 1:
                    consultaDeSaldo(saldo);
                    break;
                case 2:
                    saldo = receberValor(scanner, saldo);
                    break;
                case 3:
                    saldo = transferirValor(scanner, saldo);
                    break;
                case 0:
                    System.out.println("Finalizando o ap...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (op != 0);

        scanner.close();
    }
    public static int exibirMenu(Scanner scanner) {
        System.out.println("Escolha uma das opções: ");
        System.out.println("1- Consultar Saldo.");
        System.out.println("2- Receber Valor.");
        System.out.println("3- Transferir Valor.");
        System.out.println("0- Sair.");
        System.out.print("Sua escolha: ");
        return scanner.nextInt();
    }

    public static void consultaDeSaldo(double balance) {
        System.out.printf("Seu saldo é: %.2f%n", balance);
    }

    public static double receberValor(Scanner scanner, double saldo) {
        System.out.println("Informe o valor à receber: ");
        double valorRecebido = scanner.nextDouble();
        scanner.nextLine();
        saldo += valorRecebido;
        return saldo;
    }

    public static double transferirValor(Scanner scanner, double saldo) {
        System.out.println("Informe o valor à ser transferido: ");
        double valorTransferido = scanner.nextDouble();
        scanner.nextLine();
        if (valorTransferido > saldo) {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        } else {
            saldo -= valorTransferido;
            System.out.printf("Valor transferido com sucesso. Seu novo saldo: %.2f%n", saldo);
        }
        return saldo;
    }
}
