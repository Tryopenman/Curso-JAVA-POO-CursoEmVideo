package Aula09;

public class Livro implements Publicação {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // Métodos

    public String detalhes() {
        return "Livro{" + "titulo = " + titulo + '\n' + " autor = '" + autor + '\n' + " totPaginas = " + totPaginas
                + "\n pagAtual = " + pagAtual + "\n aberto = " + aberto + "\n leitor = " + leitor.getNome() + "\n idade = " + leitor.getIdade() + "\n sexo = " + leitor.getSexo();
    }

    // Métodos especiais


    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {

        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public String getAutor() {

        return autor;
    }

    public void setAutor(String autor) {

        this.autor = autor;
    }

    public int getTotPaginas() {

        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {

        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {

        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {

        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {

        return aberto;
    }

    public void setAberto(boolean aberto) {

        this.aberto = aberto;
    }

    public Pessoa getLeitor() {

        return leitor;
    }

    public void setLeitor(Pessoa leitor) {

        this.leitor = leitor;
    }

    // Métodos abstratos

    @Override
    public void abrir() {

        this.setAberto(true);
    }

    @Override
    public void fechar() {

        this.setAberto(false);
    }

    @Override
    public void folhear(int pag) {

        if (pag > this.getTotPaginas()){
            this.setPagAtual(0);
        }else{
            this.setPagAtual(pag);
        }
    }

    @Override
    public void avancarPag() {

        if (getPagAtual() == getTotPaginas()){
            System.out.println("FIM");
            setPagAtual(getTotPaginas());
        }else{
            this.setPagAtual(this.getPagAtual() + 1);
        }
    }

    @Override
    public void voltarPag() {

        if (getPagAtual() == 0){
            System.out.println("Esta já é a primeira página do livro!");
            setPagAtual(0);
        }else {
            this.setPagAtual(this.getPagAtual() - 1);
        }
    }
}
