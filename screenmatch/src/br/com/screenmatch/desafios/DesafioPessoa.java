package br.com.screenmatch.desafios;

import java.util.ArrayList;

public class DesafioPessoa {
    public static void main(String[] args) {

//        ArrayList<Pessoa> listaDePessoas = new ArrayList<Pessoa>();

        var listaDePessoas = new ArrayList<Pessoa>();

        var pessoa1 = new Pessoa();
        var pessoa2 = new Pessoa();
        var pessoa3 = new Pessoa();
        var pessoa4 = new Pessoa();

        pessoa1.setNome("Junior");
        pessoa1.setIdade(30);

        pessoa2.setNome("Bia");
        pessoa2.setIdade(31);

        pessoa3.setNome("Irani");
        pessoa3.setIdade(58);

        pessoa4.setNome("Gutão");
        pessoa4.setIdade(62);

//        listaDePessoas.addAll(Arrays.asList(pessoa1, pessoa2, pessoa3, pessoa4));

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        listaDePessoas.add(pessoa4);

        System.out.println(listaDePessoas);
        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.get(0));
    }
}
