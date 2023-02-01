package Aula05;

import java.security.PKCS12Attribute;

public class Aula05 {
    public static void main(String[] args) {

        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Francisco");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Maria");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);

        p2.levantar(100);

        p1.levantar(150);
        p1.fecharConta();

        p1.statusAtual();
        p2.statusAtual();
    }
}