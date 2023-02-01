package Aula04;

public class Caneta {

    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String modelo,String cor, float ponta) {
        this.modelo = modelo;
        this.ponta = ponta;;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void status(){

        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: "+ this.cor);
    }
}
