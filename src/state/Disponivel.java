package state;

public class Disponivel extends LivroState{

    public Disponivel(LivroAcervo livro){
        super(livro);
    }

    @Override
    public void livroDisponivel() {
        System.out.println("Esse livro já está Disponivel!");
    }

    @Override
    public void livroEmprestado() {
        getLivro().setState(new Emprestado(getLivro()));
    }

    @Override
    public void livroPerdido() {
        getLivro().setState(new Perdido(getLivro()));
    }

    public void myState(){
        System.out.println("Estado: Disponivel");
    }


}
