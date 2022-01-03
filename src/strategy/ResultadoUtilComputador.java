package strategy;

import java.util.List;

public class ResultadoUtilComputador {
	private Estudante estudante;
	private List<Integer> tempo;
	private int qtdUsos;
	private InterfaceCustoUtilizacao calculoPrecoFinal;
	
	public ResultadoUtilComputador(Estudante estudante, List<Integer> tempo, int qtdUsos, InterfaceCustoUtilizacao calculoPrecoFinal) {
		super();
		this.estudante = estudante;
		this.tempo = tempo;
		this.qtdUsos = qtdUsos;
		this.calculoPrecoFinal = calculoPrecoFinal;
	}
	
	public double calcularPrecoFinal() {
		return calculoPrecoFinal.calcular(tempo);
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public List<Integer> getTempo() {
		return tempo;
	}

	public int getQtdUsos() {
		return qtdUsos;
	}

	public InterfaceCustoUtilizacao getCalculoPrecoFinal() {
		return calculoPrecoFinal;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

	public void setTempo(List<Integer> tempo) {
		this.tempo = tempo;
	}

	public void setQtdUsos(int qtdUsos) {
		this.qtdUsos = qtdUsos;
	}

	public void setCalculoPrecoFinal(InterfaceCustoUtilizacao calculoPrecoFinal) {
		this.calculoPrecoFinal = calculoPrecoFinal;
	}
	
	
}
