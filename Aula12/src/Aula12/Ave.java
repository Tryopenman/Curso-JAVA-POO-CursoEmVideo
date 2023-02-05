package Aula12;

public class Ave extends Animal{

    // Atributos
    private String corPena;

    // Métodos

    public void fazerNinho(){
        System.out.println("A fazer o ninho!");
    }

    // Métodos Especiais

    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    // Métodos Abstratos

    @Override
    public void locomover() {
        System.out.println("A voar!");
    }

    @Override
    public void alimentar() {
        System.out.println("A comer frutas!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som da ave!");
    }
}
