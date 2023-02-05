package Aula12;

public class Reptil extends Animal{

    // Atributos
    private String corEscama;

    // Métodos Especiais

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    // Métodos Abstratos

    @Override
    public void locomover() {
        System.out.println("A rastejar!");
    }

    @Override
    public void alimentar() {
        System.out.println("A comer vegetais!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som do réptil!");
    }
}
