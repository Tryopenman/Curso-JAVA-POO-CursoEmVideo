package Aula11;

public final class Tecnico extends Aluno{

    private String registroProfissional;

    public void praticar(){

        System.out.println("Estou a praticar");
    }
    public String getRegistroProfissional() {
        return registroProfissional;
    }
    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
