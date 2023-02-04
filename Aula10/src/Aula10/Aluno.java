package Aula10;

public class Aluno extends Pessoa {

    // Atributos
    private int matr;
    private String curso;

    // Métodos

    public void cancelarMatr(){
        System.out.println("A matrícula será cancelada!");
    }

    //Métodos Especiais

    public void setMatr(int matr){
        this.matr = matr;
    }
    public int getMatr(){
        return matr;
    }
    public void setCurso (String curso){
        this.curso = curso;
    }
    public String getCurso(){
        return curso;
    }
}
