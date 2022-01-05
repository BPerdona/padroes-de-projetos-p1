package state;

public class Perdido extends LivroState{

    public Perdido(LivroAcervo livro){
        super(livro);
    }

    @Override
    public void livroDisponivel() {
        getLivro().setState(new Disponivel(getLivro()));
    }

    @Override
    public void livroEmprestado() {
        getLivro().setState(new Emprestado(getLivro()));
    }

    @Override
    public void livroPerdido() {
        System.out.println("Esse livro já está perdido!");
    }

    public void myState(){
        System.out.println("Estado: Perdido");
    }
}
