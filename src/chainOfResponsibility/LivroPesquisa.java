package chainOfResponsibility;

import hookMethod.Livro;

public class LivroPesquisa extends Livro{
    private String autor;
    private String origem;

    public LivroPesquisa(String titulo, int paginas, double preco, String autor, String origem){
        super(titulo,paginas,preco);
        this.autor=autor;
        this.origem=origem;
    }

    @Override
    protected Double calcularPreçoEmprestimo() {
        return getPrecoEmprestimo();
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
}
