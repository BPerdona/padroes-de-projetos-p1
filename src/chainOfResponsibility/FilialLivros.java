package chainOfResponsibility;

import java.util.ArrayList;

public class FilialLivros extends RecuperadorLivro{
    private String nomeFilial;
    private ArrayList<LivroPesquisa> acervoLivros = new ArrayList<>();

    public FilialLivros(RecuperadorLivro proximo){
        super(proximo);
        this.acervoLivros.add(new LivroPesquisa("O poder do hábito", 231, 39.00, "Charles Duhigg", "Filial"));
        this.acervoLivros.add(new LivroPesquisa("O senhor da guerra", 390, 41.90, "Bernard Cornwell", "Filial"));
        this.acervoLivros.add(new LivroPesquisa("Extraordinário", 203, 22.45, "J. R. Palacio", "Filial"));
    }

    @Override
    protected LivroPesquisa recuperarArquivo(String titulo) {
        for(LivroPesquisa livro : acervoLivros){
            if(livro.getTitulo().equalsIgnoreCase(titulo))
                return livro;
        }
        return null;
    }
}
