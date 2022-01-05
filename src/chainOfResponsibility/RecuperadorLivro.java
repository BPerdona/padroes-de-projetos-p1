package chainOfResponsibility;

public abstract class RecuperadorLivro {
    private RecuperadorLivro proximo;

    public RecuperadorLivro(RecuperadorLivro proximo){
        this.proximo=proximo;
    }

    //Executa o metodo recuperar arquivo e se conseguir retorna se não passa para o proximo elo da corrente
    public LivroPesquisa recuperar(String titulo){
        LivroPesquisa livro = recuperarArquivo(titulo);
        if(livro==null)
            return chamarProximo(titulo);
        else
            return livro;
    }

    public LivroPesquisa chamarProximo(String titulo){
        if(proximo == null)
            throw new RuntimeException("Não foi possivel recuperar o livro "+titulo);
        return proximo.recuperar(titulo);
    }

    //metodo que as classes filhas deveram implementar
    protected abstract LivroPesquisa recuperarArquivo(String titulo);
}
