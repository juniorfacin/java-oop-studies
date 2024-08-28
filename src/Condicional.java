public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoDePlano = "Plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("\nLançamento que os clientes estão curtindo!");
        } else {
            System.out.println("\nFilme retrô que vale a pena assistir!");
        }

        System.out.println(notaDoFilme);

        if (incluidoNoPlano == true || tipoDePlano.equals("Plus")) {
            System.out.println("Filme liberado para assistir.");
        } else {
            System.out.println("Filme não está liberado, será preciso alugar.");
        }


    }
}
