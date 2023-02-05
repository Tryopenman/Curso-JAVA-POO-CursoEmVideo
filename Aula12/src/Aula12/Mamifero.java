package Aula12;

public class Mamifero extends Animal{

    //Atributos
    private String corPelo;

    // Métodos Especiais

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    // Métodos Abstratos

    @Override
    public void locomover() {
        System.out.println("A correr!");
    }

    @Override
    public void alimentar() {
        System.out.println("A mamar!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som do mamífero!");
    }
}
