package main;

import java.util.ArrayList;
import java.util.List;

import strategy.*;
import nullObject.*;
import hookMethod.*;
import state.*;
import observerPattern.*;
import composite.*;

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
		System.out.println("Title: "+revista1.getTitle()+"\nPaginas: "+revista1.getPages());
		System.out.println("Title: "+revista2.getTitle()+"\nPaginas: "+revista2.getPages());
		System.out.println("Title: "+revista3.getTitle()+"\nPaginas: "+revista3.getPages());
		System.out.println("Title: "+revista4.getTitle()+"\nPaginas: "+revista4.getPages());
		System.out.println("Title: "+revista5.getTitle()+"\nPaginas: "+revista5.getPages());

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

		//Utilizando Padrão Composite
		System.out.println("\n___Padrão Composite___");

		//Criação dos mangas, adicionando em um array
		Manga fullMetal1 = new Manga("FullMetal Alchemist",1);
		Manga fullMetal2 = new Manga("FullMetal Alchemist", 2);
		Manga fullMetal3 = new Manga("FullMetal Alchemist",3);
		Manga fullMetal4 = new Manga("FullMetal Alchemist", 4);
		ArrayList<Manga> fm = new ArrayList<>();
		fm.add(fullMetal1);
		fm.add(fullMetal2);
		fm.add(fullMetal3);
		fm.add(fullMetal4);

		Manga deathNote1 = new Manga("Death Note",1);
		Manga deathNote2 = new Manga("Death Note",2);
		Manga deathNote3 = new Manga("Death Note",3);
		ArrayList<Manga> dn = new ArrayList<>();
		dn.add(deathNote1);
		dn.add(deathNote2);
		dn.add(deathNote3);

		Manga onePunch1 = new Manga("One Punch",1);
		Manga onePunch2 = new Manga("One Punch",2);
		ArrayList<Manga> op = new ArrayList<>();
		op.add(onePunch1);
		op.add(onePunch2);

		//Utilizo os ArrayList para criar o Objeto TemporadaManga
		TemporadaManga fullMetal = new TemporadaManga(fm);
		TemporadaManga deathNote = new TemporadaManga(dn);
		TemporadaManga onePunch = new TemporadaManga(op);

		//Criando as compras simples, ou seja, comprando apenas uma temporada do manga
		CompraManga simplesA = new CompraMangaSimples(fullMetal, 34.50);
		CompraManga simplesB = new CompraMangaSimples(deathNote, 29.00);
		CompraManga simplesC = new CompraMangaSimples(onePunch, 12.15);

		//Criando as compras compostas pois se comprar mais que uma temporada receberá um desconto de 10% a cada temp adicionada
		CompraManga compostaA = new CompraMangaComposta(simplesA,simplesB, 10);
		CompraManga compostaB = new CompraMangaComposta(simplesC, compostaA, 10);

		//Simples
		System.out.println("\nSimples:\n"+simplesC+"\nPreço: "+12.15);

		//Composta
		System.out.println("\nComposta:\n"+compostaB);
		System.out.println("Preço: "+ compostaB.getPreco());
	}
}
