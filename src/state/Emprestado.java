package state;

public class Emprestado extends LivroState{

    public Emprestado(LivroAcervo livro){
        super(livro);
    }

    @Override
    public void livroDisponivel() {
        getLivro().setState(new Disponivel(getLivro()));
    }

    @Override
    public void livroEmprestado() {
        System.out.println("Esse livro já está emprestadoS");
    }

    @Override
    public void livroPerdido() {
        getLivro().setState(new Perdido(getLivro()));
    }

    public void myState(){
        System.out.println("Estado: Emprestado");
    }
}
