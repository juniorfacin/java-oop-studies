public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun - Mavrick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        boolean incluidoNoPlano;

        if (media >= 5.0) {
            incluidoNoPlano = true;
            System.out.println(incluidoNoPlano);
            System.out.println("O filme está incluido no seu plano, aproveite.");
        } else {
            incluidoNoPlano = false;
            System.out.println(incluidoNoPlano);
            System.out.println("O filme não está incluido no seu plano.");
      }
        // Text Block - A partir do Java 15
        String sinopse;
        sinopse = """
                Filme Top Gun Maverick
                Ator: Tom Cruise
                Ano de Lançamento:
                """ + anoDeLancamento;
        System.out.println(sinopse);

        // Casting Explícito
        int classificao = (int) (media / 2);
        System.out.println("Forçando a saída com Casting: " + classificao);
    }
}
