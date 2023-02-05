package Aula12;

public class Aula12 {
    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(35.3);
        m.setCorPelo("Marrom");
        m.setMembros(40);
        m.alimentar();
        m.locomover();
        m.emitirSom();

        a.setPeso(25);
        a.setCorPena("Branca");
        a.locomover();

        p.locomover();

        r.locomover();

        Canguru c = new Canguru();
        Cao ca = new Cao();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara ar = new Arara();

        c.locomover();
        c.emitirSom();
        ca.locomover();
        ca.emitirSom();
        co.alimentar();
        t.alimentar();
        g.locomover();
        ar.locomover();
    }
}