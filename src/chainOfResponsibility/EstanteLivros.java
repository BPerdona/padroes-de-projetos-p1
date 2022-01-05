package chainOfResponsibility;

import java.util.ArrayList;

public class EstanteLivros extends RecuperadorLivro{
    private ArrayList<LivroPesquisa> livros = new ArrayList<>();

    public EstanteLivros(RecuperadorLivro proximo){
        super(proximo);
        this.livros.add(new LivroPesquisa("Sherlock Holmes", 578, 23.00, "Arthur Conan Doyle", "Estante"));
        this.livros.add(new LivroPesquisa("Ultimo desejo", 420, 32.00, "Andrzej Sapkowski", "Estante"));
        this.livros.add(new LivroPesquisa("Harry Potter", 321, 15.50, "J. K. Rowling", "Estante"));
    }

    @Override
    protected LivroPesquisa recuperarArquivo(String titulo) {
        for(LivroPesquisa l : livros){
            if(l.getTitulo().equalsIgnoreCase(titulo))
                return l;
        }
        return null;
    }
}
