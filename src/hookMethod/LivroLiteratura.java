package hookMethod;

public class LivroLiteratura extends Livro {
    private String autor;
    private String genero;

    public LivroLiteratura(String titulo, int numPags, Double precoEmprestimo, String autor, String genero) {
        super(titulo, numPags, precoEmprestimo);
        this.autor = autor;
        this.genero = genero;
    }

    protected  Double calcularPreçoEmprestimo(){
        return this.getPrecoEmprestimo() * 0.75;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
