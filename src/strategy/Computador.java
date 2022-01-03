package strategy;

public class Computador extends Patrimonio{
	private int numeroMaquina;
	private boolean disponivel;
	
	public Computador(int numeroMaquina, boolean disponivel){
		super();
		this.numeroMaquina = numeroMaquina;
		this.disponivel = true;
	}

	public int getNumeroMaquina() {
		return numeroMaquina;
	}

	public void setNumeroMaquina(int numeroMaquina) {
		this.numeroMaquina = numeroMaquina;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
}
