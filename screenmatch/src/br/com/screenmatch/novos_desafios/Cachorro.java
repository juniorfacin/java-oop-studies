package br.com.screenmatch.novos_desafios;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome) {
        super(nome);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void latir() {
        System.out.println(getNome() + ": Au Au Au!");
    }
}
