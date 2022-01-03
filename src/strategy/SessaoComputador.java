package strategy;

public class SessaoComputador {
	private Estudante estudante;
	private Computador computador;
	private int tempoUtil;
	
	public SessaoComputador(Estudante estudante, Computador computador, int tempoUtil) {
		this.estudante = estudante;
		this.computador = computador;
		this.tempoUtil = tempoUtil;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public Computador getComputador() {
		return computador;
	}

	public int getTempoUtil() {
		return tempoUtil;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

	public void setComputador(Computador computador) {
		this.computador = computador;
	}

	public void setTempoUtil(int tempoUtil) {
		this.tempoUtil = tempoUtil;
	}
	
}
