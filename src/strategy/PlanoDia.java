package strategy;

import java.util.List;

public class PlanoDia implements InterfaceCustoUtilizacao{

	public double calcular(List<Integer> tempo) {
		Double total = 0.0;
		
		//Por conta de estar utilizando uma lista no qual cada elemento significa um mês então
		//poderá ser possivel pagar no final de qualquer mês.
		
		for(Integer dia : tempo) {
			total += dia*1.25;
		}
		return total;
	}

}
