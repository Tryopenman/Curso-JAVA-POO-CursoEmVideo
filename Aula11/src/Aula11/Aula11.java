package Aula11;

public class Aula11 {
    public static void main(String[] args) {

        // Pessoa p1 = new Pessoa();

        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("Masculino");
        v1.fazerAniv();
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Engenharia Informática");
        a1.setIdade(16);
        a1.setSexo("Masculino");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5);
        b1.setSexo("Masculino");
        b1.pagarMensalidade();

        Professor p1 = new Professor();
        p1.setNome("Francisco");
        p1.setEspecialidade("Artes");
        System.out.println(p1.getEspecialidade());
        p1.setSalario(2500);
        System.out.println(p1.getSalario());

        Tecnico t1 = new Tecnico();
        t1.setNome("Miguel");
        t1.setIdade(20);
        t1.setRegistroProfissional("Futebolista");
        System.out.println(t1.getRegistroProfissional());
        t1.praticar();
    }
}