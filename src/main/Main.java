package main;

import java.util.ArrayList;
import java.util.List;

import strategy.*;
import nullObject.*;
import hookMethod.*;

public class Main {

	public static void main(String[] args) {
		
		//Utilizando o padrão Strategy:
		System.out.println("___Padrão Strategy___");
		
		Estudante bruno = new Estudante("Bruno", 6278);
		Computador maquina1 = new Computador(1, true);
		
		//Pode ser utilizado para armazenar em uma lista todas as sess�es ou at� mesmo servir como Log
		SessaoComputador sessao = new SessaoComputador(bruno, maquina1, 2);
		
		List<Integer> horas = new ArrayList<Integer>();
		List<Integer> dias = new ArrayList<Integer>();
		
		//Apartir da sessão é possivel retirar o tempo de utilização ou somar aos dias utilizados
		horas.add(sessao.getTempoUtil());
		horas.add(5);
		horas.add(1);
		horas.add(3);
		horas.add(2);
		
		//Cada add é um mês
		dias.add(12);
		dias.add(3);
		dias.add(6);

		ResultadoUtilComputador planoHora = new ResultadoUtilComputador(bruno, horas, 5, new PlanoHora());
		ResultadoUtilComputador planoDia = new ResultadoUtilComputador(bruno, dias, 3, new PlanoDia());
		
		System.out.println("Plano por hora: "+ planoHora.calcularPrecoFinal());
		System.out.println("Plano por hora: "+ planoDia.calcularPrecoFinal());
		
		//Utilizando o padrão Null Object
		System.out.println("\n___Padrão Strategy___");
		
		//Buscando e armazenando resultado das revistas
		AbstractMagazine revista1 = MagazineDAO.getCustomer("outside");
		AbstractMagazine revista2 = MagazineDAO.getCustomer("Universo em uma casca de noz");
		AbstractMagazine revista3 = MagazineDAO.getCustomer("cell");
		AbstractMagazine revista4 = MagazineDAO.getCustomer("A teoria de tudo");
		AbstractMagazine revista5 = MagazineDAO.getCustomer("Ciencia Hoje");
		
		System.out.println("Revistas: ");
		System.out.println("\nTitle: "+revista1.getTitle()+"\nPaginas: "+revista1.getPages());
		System.out.println("\nTitle: "+revista2.getTitle()+"\nPaginas: "+revista2.getPages());
		System.out.println("\nTitle: "+revista3.getTitle()+"\nPaginas: "+revista3.getPages());
		System.out.println("\nTitle: "+revista4.getTitle()+"\nPaginas: "+revista4.getPages());
		System.out.println("\nTitle: "+revista5.getTitle()+"\nPaginas: "+revista5.getPages());

		//Utilizando o padrão Hook Method
		System.out.println("\n___Hook Method___");

		//Livros Cientificos tem 80% de seu preço normal
		Livro geoGeral = new LivroCientifico("Geografia geral do Brasil", 471, 50.0, "Scipione", "Geografia");

		//Livros de Literatura tem 25% de desconto
		Livro domCasmurro = new LivroLiteratura("Dom Casmurro", 187, 12.25, "Machado de Assis", "Romance");

		//Calculo dos resultados
		System.out.println("Preço do Livro "+geoGeral.getTitulo()+ " com desconto é: "+geoGeral.calcularPreçoExtendido(4));
		System.out.println("Preço do Livro "+domCasmurro.getTitulo()+ " com desconto é: "+domCasmurro.calcularPreçoExtendido(2));

	}

}
