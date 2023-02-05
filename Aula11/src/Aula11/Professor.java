package Aula11;

public class Professor extends Pessoa {

    private String especialidade;
    private double salario;

    public void receberAumento(double aumento){

        this.setSalario(this.getSalario() + aumento);
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public String getEspecialidade(){
        return especialidade;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
}
