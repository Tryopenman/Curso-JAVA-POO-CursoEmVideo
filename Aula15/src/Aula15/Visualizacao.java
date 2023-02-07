package Aula15;

public class Visualizacao {

    // Atributos
    private Gafanhoto espetador;
    private Video filme;

    // Métodos Especiais
    public Visualizacao(Gafanhoto espetador, Video filme) {
        this.espetador = espetador;
        this.filme = filme;
        this.espetador.setTotAssistido(this.espetador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public Gafanhoto getEspetador() {
        return espetador;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espetador=" + espetador + ", filme=" + filme + '}';
    }

    public void setEspetador(Gafanhoto espetador) {
        this.espetador = espetador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    // Métodos

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(double perc) {
        int tot = 0;
        if (perc <= 20){
            tot = 3;
        } else if (perc <= 50) {
            tot = 5;
        } else if (perc <= 90) {
            tot = 8;
        }else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
}
