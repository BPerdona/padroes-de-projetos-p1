package composite;

public class CompraMangaComposta implements CompraManga{
    private CompraManga primeiro;
    private CompraManga segundo;
    private double desconto;

    public CompraMangaComposta(CompraManga primeiro, CompraManga segundo, double desconto){
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.desconto = desconto;
        if(primeiro.getEdicaoComeco().getNumeroEdicao()>primeiro.getEdicaoFinal().getNumeroEdicao()
                || segundo.getEdicaoComeco().getNumeroEdicao()>segundo.getEdicaoFinal().getNumeroEdicao()){
            throw new RuntimeException("O primeiro manga está com a edição maior que o segundo");
        }
    }

    @Override
    public Manga getEdicaoComeco() {
        return primeiro.getEdicaoComeco();
    }

    @Override
    public Manga getEdicaoFinal() {
        return segundo.getEdicaoFinal();
    }

    @Override
    public double getPreco() {
        double soma = primeiro.getPreco()+segundo.getPreco();
        return soma - (soma*(desconto/100));
    }

    @Override
    public String toString(){
        return primeiro.toString()+"\n"+segundo.toString();
    }
}
