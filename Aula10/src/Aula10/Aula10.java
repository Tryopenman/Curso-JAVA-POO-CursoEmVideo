package Aula10;

public class Aula10 {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2  = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");

        p1.setSexo("Masculino");
        p4.setSexo("Feminino");

        p2.setIdade(18);

        p2.setCurso("Engenharia Informática");
        p3.setSalario(2500.75);
        p4.setSetor("Estoque");

        p3.receberAum(500.20);
        p4.mudarTrabalho();
        p2.cancelarMatr();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}