package Aula10;

public class Pessoa {

    // Atributos
    private String nome;
    private int idade;
    private String sexo;

    // Métodos

    public void fazerAniv(){
        this.idade++;
    }

    // Métodos Especiais

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        return sexo;
    }

    @Override
    public String toString() {
        return "Pessoa {" + "nome = " + nome + '\'' + ", idade=" + idade + ", sexo='" + sexo + '\'' + '}';
    }
}
