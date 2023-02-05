package Aula11;

public final class Bolsista extends Aluno{

    // Atributos
    private double bolsa;

    // Métdodos

    public void renovarBolsa(){

        System.out.println("A renovar a bolsa do aluno " + this.getNome());
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Pagar Mensalidade...");
    }

    // Métodos Especiais

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
