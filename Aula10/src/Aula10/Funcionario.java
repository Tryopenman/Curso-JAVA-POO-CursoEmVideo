package Aula10;

public class Funcionario extends Pessoa{

    // Atributos
    private String setor;
    private boolean trabalhar;

    public void mudarTrabalho(){
        if (this.getTrbalhar()){
            this.setTrabalhar(false);
        }else if (!this.getTrbalhar()){
            this.setTrabalhar(true);
        }

    }
    public void setSetor(String setor){
        this.setor = setor;
    }
    public String getSetor(){
        return setor;
    }
    public void setTrabalhar(boolean trabalhar){
        this.trabalhar = trabalhar;
    }
    public boolean getTrbalhar(){
        return trabalhar;
    }
}
