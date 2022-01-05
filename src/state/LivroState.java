package state;

public abstract class LivroState {
    private LivroAcervo livro;

    public LivroState(LivroAcervo livro){
        this.livro=livro;
    }

    public abstract void livroDisponivel();

    public abstract void livroEmprestado();

    public abstract void livroPerdido();

    public abstract void myState();

    public LivroAcervo getLivro() {
        return livro;
    }

    public void setLivro(LivroAcervo livro) {
        this.livro = livro;
    }
}
