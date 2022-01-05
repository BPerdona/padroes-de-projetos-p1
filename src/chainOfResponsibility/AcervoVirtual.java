package chainOfResponsibility;

import java.util.HashMap;
import java.util.Map;

public class AcervoVirtual extends RecuperadorLivro{
    private Map<String, LivroPesquisa> acervoLivros = new HashMap<>();

    public AcervoVirtual(RecuperadorLivro proximo){
        super(proximo);
        acervoLivros.put("Frankenstein", new LivroPesquisa("Frankenstein", 489, 45.00, "Mary Shelley","Acervo Virtual"));
        acervoLivros.put("Essencialismo", new LivroPesquisa("Essencialismo", 489, 36.90, "Greg Mckeown","Acervo Virtual"));
        acervoLivros.put("A revolucao", new LivroPesquisa("A revolucao", 231, 15.00, "George Orwell","Acervo Virtual"));
    }

    @Override
    protected LivroPesquisa recuperarArquivo(String titulo) {
        if(acervoLivros.containsKey(titulo))
            return  acervoLivros.get(titulo);
        return null;
    }
}
