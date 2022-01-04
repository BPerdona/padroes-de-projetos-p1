package hookMethod;

public class LivroCientifico extends Livro{
    private String editora;
    private String materia;

    public LivroCientifico(String titulo, int numPags, Double precoEmprestimo, String editora, String materia) {
        super(titulo, numPags, precoEmprestimo);
        this.editora = editora;
        this.materia = materia;
    }

    protected  Double calcularPreçoEmprestimo(){
        return this.getPrecoEmprestimo() * 0.20;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
