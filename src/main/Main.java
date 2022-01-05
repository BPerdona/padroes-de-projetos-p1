package main;

import java.util.ArrayList;
import java.util.List;

import strategy.*;
import nullObject.*;
import hookMethod.*;
import state.*;
import observerPattern.*;

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

		//Utilizando o padrão State Pattern
		System.out.println("\n___State Pattern___");

		//Criando livro com seus atributos
		LivroAcervo livroAcervo = new LivroAcervo("Sherlock Holmes", "Investigação", 476, 1.25);

		//Alterando o estado de cada objeto e imprimindo
		livroAcervo.disponivel();
		livroAcervo.state();
		livroAcervo.emprestado();
		livroAcervo.state();
		livroAcervo.perdido();
		livroAcervo.state();
		livroAcervo.perdido();

		//Utilizando o padrão Observer Pattern
		System.out.println("\n___Observer Pattern___");

		//Nesse padrao vou usar os computadores como observadores e o computador do Admin como o Observavel
		//Assim o Admin poderá mandar mensagem para todos os computadores ou para os específicos

		//Computadores como 'Device' que serão os Observadores
		Computador comp1 = new Computador(1, true);
		Computador comp2 = new Computador(2, true);
		Computador comp3 = new Computador(4, true);
		Computador comp4 = new Computador(7, true);

		//Novo 'Serviço' que será o observado
		ComputadorAdmin compAdm = new ComputadorAdmin("Júlio");

		//Adicionando Observadores
		compAdm.addObserver(comp1);
		compAdm.addObserver(comp2);
		compAdm.addObserver(comp3);
		compAdm.addObserver(comp4);

		//Enviando mensagem para todos e uma exclusiva para a maquina 7
		compAdm.notifyAll("Em 10 minutos estaremos fechando a biblioteca!");
		compAdm.notify(7,"Seu limite de tempo acaba em 10 minutos!!!");

		//Tirando observador
		compAdm.removeObserver(comp4);
		compAdm.notify(7,"Essa mensagem não irá aparecer!");
	}
}
