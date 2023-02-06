package Aula13;

public class Mamifero extends Animal{

    // Atributos
    protected String corPelo;

    //Métodos Abstratos
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }
    // Métodos Especiais


    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
