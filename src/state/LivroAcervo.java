package state;

import hookMethod.Livro;

public class LivroAcervo extends Livro {
    private String genero;
    private LivroState state;

    public LivroAcervo(String titulo, String genero, int paginas, Double preco) {
        super(titulo,paginas,preco);
        this.genero = genero;
        this.state = new Disponivel(this);
    }

    @Override
    protected Double calcularPreçoEmprestimo() {
        return this.getPrecoEmprestimo() * 0.20;
    }

    public void emprestado(){
        state.livroEmprestado();
    }

    public void perdido(){
        state.livroPerdido();
    }

    public void disponivel(){
        state.livroDisponivel();
    }

    public void state(){
        state.myState();
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LivroState getState() {
        return state;
    }

    public void setState(LivroState state) {
        this.state = state;
    }
}
