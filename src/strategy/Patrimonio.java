package strategy;

import java.util.Random;

public abstract class Patrimonio {
	private int idPatrimonio;

	public Patrimonio() {
		super();
		Random r = new Random();
		this.idPatrimonio = r.nextInt(1000);
	}

	public int getIdPatrimonio() {
		return idPatrimonio;
	}
}
