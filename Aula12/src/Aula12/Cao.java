package Aula12;

public class Cao extends Mamifero{

    public void enterrarOsso(){
        System.out.println("A enterrar o osso!");
    }
    public void abanarRabo(){
        System.out.println("A abanar o rabo!");
    }
    @Override
    public void emitirSom(){
        System.out.println("Au Au Au!");
    }
}
