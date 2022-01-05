package composite;

import java.util.ArrayList;
import java.util.List;

public class TemporadaManga {
    private ArrayList<Manga> mangas = new ArrayList<Manga>();
    private int primeiraEdicao;
    private int ultimaEdicao;

    public TemporadaManga(ArrayList<Manga> mangas){
        this.mangas = mangas;
        if(mangas!=null)
            this.primeiraEdicao = mangas.get(0).getNumeroEdicao();
            this.ultimaEdicao = mangas.get(mangas.size()-1).getNumeroEdicao();
    }

    public List<Manga> getMangas() {
        return mangas;
    }

    public void setMangas(ArrayList<Manga> mangas) {
        this.mangas = mangas;
    }

    public int getPrimeiraEdicao() {
        return primeiraEdicao;
    }

    public void setPrimeiraEdicao(int primeiraEdicao) {
        this.primeiraEdicao = primeiraEdicao;
    }

    public int getUltimaEdicao() {
        return ultimaEdicao;
    }

    public void setUltimaEdicao(int ultimaEdicao) {
        this.ultimaEdicao = ultimaEdicao;
    }
}
