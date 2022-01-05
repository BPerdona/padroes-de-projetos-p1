package strategy;

import observerPattern.ComputadorAdmin;
import observerPattern.Observable;
import observerPattern.Observer;

public class Computador extends Patrimonio implements Observer {
	private int numeroMaquina;
	private boolean disponivel;
	
	public Computador(int numeroMaquina, boolean disponivel){
		super();
		this.numeroMaquina = numeroMaquina;
		this.disponivel = true;
	}

	@Override
	public void notify(Observable observable, String message) {
		//Cast para conseguir no nome do Admin
		System.out.println(((ComputadorAdmin)observable).getNomeAdmin() +" para maquina "+this.numeroMaquina+": "+message);
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
