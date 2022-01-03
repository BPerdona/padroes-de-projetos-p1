package strategy;

import java.util.List;

public class PlanoHora implements InterfaceCustoUtilizacao{
	
	public double calcular(List<Integer> tempo) {
		Double total = 0.0;
		for(Integer t : tempo) {
			total += t*0.55;
		}
		return total;
	}
}
