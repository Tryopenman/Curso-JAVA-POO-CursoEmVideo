package Aula12;

public class Peixe extends Animal{

    // Atributos
    private String corEscama;

    // Métodos

    public void soltarBolha(){
        System.out.println("A soltar bolhas!");
    }

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
        System.out.println("A nadar!");
    }

    @Override
    public void alimentar() {
        System.out.println("A comer substâncias!");
    }

    @Override
    public void emitirSom() {
        System.out.println("O peixe não faz som!");
    }
}
