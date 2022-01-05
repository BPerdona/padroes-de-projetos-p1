package strategy;

public class Estudante {
	private String nome;
	private int idCadastro;
	
	public Estudante(String nome, int idCadastro) {
		this.nome = nome;
		this.idCadastro = idCadastro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdCadastro() {
		return idCadastro;
	}

	public void setIdCadastro(int idCadastro) {
		this.idCadastro = idCadastro;
	}

}
