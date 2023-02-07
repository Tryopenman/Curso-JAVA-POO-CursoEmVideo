package Aula14;

public class Gafanhoto extends Pessoa{

    // Atributos
    private String login;
    private int totAssistido;

    // Métodos Especiais

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + "login='" + login + '\'' + ", totAssistido=" + totAssistido + ", nome='" + nome + '\'' + ", idade=" + idade + ", sexo='" + sexo + '\'' + ", experiencia=" + experiencia + '}';
    }

    @Override
    public void ganharExperiencia(double experiencia) {
        this.setExperiencia(this.getExperiencia() + 1);
    }
    // Métodos

    public void viuMaisUm(){

    }
}
