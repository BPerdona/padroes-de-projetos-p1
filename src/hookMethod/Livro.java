package hookMethod;

public abstract class Livro {
    private String titulo;
    private int numPags;
    private Double precoEmprestimo;

    public Livro(String titulo, int numPags, Double precoEmprestimo){
        this.titulo = titulo;
        this.numPags = numPags;
        this.precoEmprestimo = precoEmprestimo;
    }

    public Double calcularPreçoExtendido(int semanas){
        return calcularPreçoEmprestimo()*semanas;
    }

    protected abstract Double calcularPreçoEmprestimo();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPags() {
        return numPags;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    public Double getPrecoEmprestimo() {
        return precoEmprestimo;
    }

    public void setPrecoEmprestimo(Double precoEmprestimo) {
        this.precoEmprestimo = precoEmprestimo;
    }

    public Double getPrecoDia() {
        return precoEmprestimo;
    }

    public void setPrecoDia(Double precoDia) {
        this.precoEmprestimo = precoDia;
    }

}
