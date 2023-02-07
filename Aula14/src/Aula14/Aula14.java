package Aula14;

public class Aula14 {
    public static void main(String[] args){

        Video[] v = new Video[3];

        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 2 de POO");
        v[2] = new Video("Aula 3 de POO");

        System.out.println(v[0].toString());

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Francisco", 18, "Masculino", "xico");
        g[1] = new Gafanhoto("Maria", 18, "Feminino", "Maria");

        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
    }
}