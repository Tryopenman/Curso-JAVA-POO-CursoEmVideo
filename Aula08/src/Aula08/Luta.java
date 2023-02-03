package Aula08;

import java.util.Random;

public class Luta {

    //Atributos

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos Públicos

    public void marcarLuta(Lutador l1, Lutador l2){

        if (l1.getCategoria().equals(l2.getCategoria()) && !l1.equals(l2)){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante =l2;
        }else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){

        if (this.aprovada){
            System.out.println("----- Desafiado -----");
            this.desafiado.apresentar();
            System.out.println("----- Desafiante -----");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            System.out.println("---------- Resultado da Luta ----------");
            switch (vencedor){

                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1:
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2:
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        }else {
            System.out.println("Não é possível acontecer a luta!");
        }
        System.out.println("---------------------------------------");
    }

    //Métodos Especiais

    public void setDesafiado (Lutador desafiado){

        this.desafiado = desafiado;
    }
    public Lutador getDesafiado (){

        return desafiado;
    }
    public void setDesafiante(Lutador desafiante){

        this.desafiante = desafiante;
    }
    public Lutador getDesafiante(){

        return desafiante;
    }
}
