package Aula15;

public abstract class Pessoa {

    // Atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    protected double experiencia;

    // Métodos Especiais

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        return sexo;
    }
    public void setExperiencia(double experiencia){
        this.experiencia = experiencia;
    }
    public double getExperiencia(){
        return experiencia;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome='" + nome + '\'' + ", idade=" + idade + ", sexo='" + sexo + '\'' + ", experiencia=" + experiencia + '}';
    }
    // Métodos

    public abstract void ganharExperiencia(double experiencia);

}
