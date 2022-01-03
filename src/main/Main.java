package main;

import java.util.ArrayList;
import java.util.List;

import strategy.*;

public class Main {

	public static void main(String[] args) {
		
		//Utilizando o padr�o Strategy:
		System.out.println("___Padr�o Strategy___");
		
		Estudante bruno = new Estudante("Bruno", 6278);
		Computador maquina1 = new Computador(1, true);
		
		//Pode ser utilizado para armazenar em uma lista todas as sess�es ou at� mesmo servir como Log
		SessaoComputador sessao = new SessaoComputador(bruno, maquina1, 2);
		
		List<Integer> horas = new ArrayList<Integer>();
		List<Integer> dias = new ArrayList<Integer>();
		
		//Apartir da sess�o � possivel retirar o tempo de utiliza��o ou somar aos dias utilizados
		horas.add(sessao.getTempoUtil());
		horas.add(5);
		horas.add(1);
		horas.add(3);
		horas.add(2);
		
		//Cada add � um m�s
		dias.add(12);
		dias.add(3);
		dias.add(6);

		ResultadoUtilComputador planoHora = new ResultadoUtilComputador(bruno, horas, 5, new PlanoHora());
		ResultadoUtilComputador planoDia = new ResultadoUtilComputador(bruno, dias, 3, new PlanoDia());
		
		System.out.println("Plano por hora: "+ planoHora.calcularPrecoFinal());
		System.out.println("Plano por hora: "+ planoDia.calcularPrecoFinal());
		
		
	}

}
