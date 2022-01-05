package composite;

public class CompraMangaSimples implements CompraManga{
    private TemporadaManga temporada;
    private double preco;

    public CompraMangaSimples(TemporadaManga temporada, Double preco){
        this.temporada = temporada;
        this.preco = preco;
        if(temporada.getPrimeiraEdicao()>temporada.getUltimaEdicao())
            throw new RuntimeException("A edição do primeiro manga é maior que o do segundo!");
    }

    @Override
    public Manga getEdicaoComeco() {
        return temporada.getMangas().get(0);
    }

    @Override
    public Manga getEdicaoFinal() {
        return temporada.getMangas().get(temporada.getMangas().size()-1);
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString(){
        return "[Manga: "+temporada.getMangas().get(0).getTitulo()+" | Edição: "+temporada.getPrimeiraEdicao()+" a "+ temporada.getUltimaEdicao()+"]";
    }
}
