package br.com.alura.mychallenges;

import java.util.Scanner;

public class ExercicioSenha {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite seu senha: ");
        String senha = scanner.nextLine();


        try {
            validarSenha(senha);
            System.out.println("Senha cadastrada com sucesso.");

        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validarSenha(String senha) {
        if (senha.length() < 8 ) {
            throw new SenhaInvalidaException("Senha precisa de 8 caracteres ou mais");
        }
    }
}
