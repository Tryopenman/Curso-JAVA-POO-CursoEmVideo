package Aula05;

import java.sql.SQLOutput;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //Métodos Especiais

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    public int getNumConta(){

        return numConta;
    }
    public void setNumConta(int numeroConta){

        this.numConta = numeroConta;
    }
    public String getTipo(){

        return tipo;
    }
    public void setTipo(String tipo){

        this.tipo = tipo;
    }
    public String getDono(){

        return dono;
    }
    public void setDono(String dono){

        this.dono = dono;
    }
    public double getSaldo(){

        return saldo;
    }
    public void setSaldo(double saldo){

        this.saldo = saldo;
    }
    public boolean getStatus(){

        return status;
    }
    public void setStatus(boolean status) {

        this.status = status;
    }

    //Métodos Personalizados

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);

        if (tipo.equals("CC")){
            this.setSaldo(50);
        } else if (tipo.equals("CP")) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){

        if (this.saldo > 0 ){
            System.out.println("Ainda tem saldo, não é possível");
        } else if (this.saldo < 0) {
            System.out.println("Está a dever dinheiro, t");
        }else {
            this.setStatus(false);
        }
    }
    public void depositar(int montante){

        if (this.getStatus()){

            this.setSaldo(getSaldo() + montante);
            System.out.println("Depoósito realizado na conta de " + this.getDono());
        }else {

            System.out.println("ERRO!");
        }
    }
    public void levantar(int montante){

        if (this.getStatus()){
            if (this.getSaldo() >= montante){
                this.setSaldo(this.getSaldo() - montante);
                System.out.println("Levantamento realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("Erro!Conta fechada.");
        }
    }
    public void mensalidade() {

        double valorMensal=0;

        if (this.getTipo().equals("CC")){
            valorMensal = 12;
        }else if (this.getTipo().equals("CP")){
            valorMensal =20;
        }
        if (this.getStatus()){
            if (this.getSaldo() > 0){

                this.setSaldo(getSaldo() - valorMensal);
            }else {
                System.out.println("Saldo Insuficiente");
            }
        }else {
            System.out.println("Erro!");
        }
    }
    public void statusAtual(){

        System.out.println("--------------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
}
