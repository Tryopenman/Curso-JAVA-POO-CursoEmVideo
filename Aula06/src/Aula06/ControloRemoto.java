package Aula06;

public class ControloRemoto implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocar;

    public ControloRemoto() {

        this.volume = 50;
        this.ligado = false;
        this.tocar = false;
    }
    private void setVolume(int volume){

        this.volume = volume;
    }
    private int getVolume(){

        return volume;
    }
    private void setLigado(boolean ligado) {

        this.ligado = ligado;
    }
    private boolean getLigado() {
        return ligado;
    }
    private void setTocar(boolean tocar){

        this.tocar = tocar;
    }
    private boolean getTocar(){

        return tocar;
    }

    // Métodos Abstratos

    @Override
    public void ligar() {

        this.setLigado(true);
    }

    @Override
    public void desligar() {

        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (getLigado()){
            System.out.println("---------- Menu ----------");
            System.out.println("Está ligado? " + this.getLigado());
            System.out.println("Está a tocar: " + this.getTocar());
            System.out.print("Volume: " + this.getVolume() + " ");

            for (int i = 0; i <= this.getVolume(); i+=10){
                System.out.print("|");
            }
            System.out.println();
        }else {
            System.out.println("Não se ecnontra ligado!");
        }
    }


    @Override
    public void fecharMenu() {
        if (getLigado()){
            System.out.println("Fechando o menu");
        }else {
            System.out.println("Não se ecnontra ligado!");
        }
    }

    @Override
    public void maisVolume() {

        if (this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }else {
            System.out.println("Impossível diminuir o volume!");
        }
    }

    @Override
    public void menosVolume() {

        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }else {
            System.out.println("Impossível diminuir o volume!");
        }
    }

    @Override
    public void ligarMudo() {

        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {

        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {

        if (this.getLigado() && !this.getTocar()){
            this.setTocar(true);
        }else {
            System.out.println("Não é possível reproduzir");
        }
    }

    @Override
    public void pause() {

        if (this.getLigado() && this.getTocar()){
            this.setTocar(false);
        }else {
            System.out.println("Não é possível pausar");
        }
    }
}
