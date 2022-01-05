package composite;

public class Manga {
    private String titulo;
    private int numeroEdicao;

    public Manga(String titulo, int numeroEdicao){
        this.titulo = titulo;
        this.numeroEdicao = numeroEdicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }
}
