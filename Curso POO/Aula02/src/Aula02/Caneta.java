package Aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    void rabiscar(){

        if (this.tampada == true){
            System.out.println("Erro! Não posso rabiscar");
        }else {
            System.out.println("Estou a rabiscar");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
