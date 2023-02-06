package Aula13;

public class Aula13 {
    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cao c = new Cao();

        m.emitirSom();

        l.emitirSom();

        c.emitirSom();
        c.reagir("Olá");
        c.reagir("Vais levar!");
        c.reagir(11,45);
        c.reagir(21,00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2,12.5);
        c.reagir(17,4.5);
    }
}