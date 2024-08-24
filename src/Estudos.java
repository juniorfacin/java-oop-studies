import java.util.Scanner;

public class Estudos {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "Junior";
        System.out.println("Olá, " + frase);

        frase = "Tudo bem?";
        System.out.println(frase);

        String estudos;
        System.out.println("Faça suas anotações de Estudo:");
        estudos = sc.nextLine();
        System.out.println(estudos);


        System.out.println("Informe os números 1 e 2 para Soma: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int resultadoSoma = num1 + num2;
        System.out.println(resultadoSoma);

        System.out.println("Informe os números 1 e 2 para Subtração: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int resultadoSub = number1 - number2;
        System.out.println(resultadoSub);

        sc.close();
    }

}
