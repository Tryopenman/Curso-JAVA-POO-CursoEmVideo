package Aula09;

import java.sql.SQLOutput;

public class Aula09 {
    public static void main(String[] args) {

        Pessoa [] p =  new Pessoa[3];

        p[0] = new Pessoa("Francisco" , 18, "Masculino");
        p[1] = new Pessoa("Raquel", 18, "Feminino");
        p[2] = new Pessoa("José" , 30 , "Masculino");

        Livro [] l = new Livro[3];

        l[0] = new Livro("Amor de Perdição", "Camilo Castelo Branco",249, p[0]);
        l[1] = new Livro("Os Maias" , "Eça de Queirós", 925, p[1]);
        l[2] = new Livro("O Ano da Morte de Ricardo Reis" , "José Saramago" , 415, p[2]);

        l[0].abrir();
        l[0].folhear(249);
        l[0].avancarPag();
        l[0].getPagAtual();

        System.out.println();
        System.out.println(l[0].detalhes());

        System.out.println();
        System.out.println(l[1].detalhes());

    }
}