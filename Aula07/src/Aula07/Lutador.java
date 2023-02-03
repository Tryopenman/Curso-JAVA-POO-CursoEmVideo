package Aula07;

public class Lutador {

    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

     //Métodos Públicos

    public void apresentar(){

        System.out.println("--------------------------------------------------");
        System.out.println("CHEGOU A HORA! APRESENTAMOS O LUTADOR: " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.print("Com " + this.getIdade() + " anos e ");
        System.out.println(this.getAltura() );
        System.out.println("Pesa: " + this.getPeso() + "kg");
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }
    public void status(){

        System.out.print(this.getNome());
        System.out.println(" é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }
    public void ganharLuta(){

        this.setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){

        this.setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){

        this.setEmpates(getEmpates() + 1);
    }

    //Métodos especiais

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    public String getNome(){

        return nome;
    }
    public void setNome(String nome){

        this.nome = nome;
    }
    public String getNacionalidade(){

        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade){

        this.nacionalidade = nacionalidade;
    }
    public int getIdade(){

        return idade;
    }
    public void setIdade(int idade){

        this.idade = idade;
    }
    public double getAltura(){

        return altura;
    }
    public void setAltura(double altura){

        this.altura = altura;
    }

    public double getPeso() {
        
        return peso;
    }
    public void setPeso(double peso) {
        
        this.peso = peso;
        setCategoria();
    }

    private void setCategoria() {

        if (this.getPeso() < 52.2){
            this.categoria = "Inválido";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        }else if (this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        }else {
            this.categoria = "Inválido";
        }
    }
    private String getCategoria() {

        return categoria;
    }

    public int getVitorias() {
        
        return vitorias;
    }
    
    public void setVitorias(int vitorias) {
        
        this.vitorias = vitorias;
    }
    
    public int getDerrotas() {
        
        return derrotas;
    }
    
    public void setDerrotas(int derrotas) {
        
        this.derrotas = derrotas;
    }
    
    public int getEmpates() {
        
        return empates;
    }

    public void setEmpates(int empates) {

        this.empates = empates;
    }
}
