package Aula10;

public class Professor extends Pessoa {

    // Atributos
    private String especialidade;
    private double salario;

    // Métodos

    public void receberAum( double valor){
        this.setSalario(getSalario() + valor);
    }

    // Métodos Especiais

    public void setSalario( double salario){
        this.salario =  salario;
    }
    public double getSalario(){
        return salario;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public String getEspecialidade(){
        return especialidade;
    }
}
