package application;

import enums.ProductTypes;
import factories.BookFactory;
import factories.DisciplinaFactory;
import interfaces.ProductIF;
import model.Book;
import model.Course;
import model.Disciplina;

public class App {


	public static void main(String[] args) throws CloneNotSupportedException  {
		
		App teste = new App();
		teste.q1();
		teste.q2();
		teste.q3();		
	}
	
	public void q1() {
		ProductTypes type2 = ProductTypes.BOOK;
		String nomeLivro = "livro 1";
		String codeLivro = "15616";
		double priceLivro = 50.0;
		BookFactory fabricaLivro = new BookFactory();
		ProductIF produto = fabricaLivro.createProduct(type2, nomeLivro, codeLivro, priceLivro);
		Book livro = (Book) produto;
		
		ProductTypes type = ProductTypes.DISCIPLINA;
		String nameClass = "Padroes de projeto";
		String codeClass = "000144";
		Double priceClass = 500.00;
		DisciplinaFactory fabricaProduto = new DisciplinaFactory();
		ProductIF produto2 = fabricaProduto.createProduct(type, nameClass, codeClass, priceClass);
		Disciplina disciplina = (Disciplina) produto2;
		System.out.println(disciplina);
		
		Course cursoCompose = new Course();
		cursoCompose.setName("Padroes de Projeto");
		cursoCompose.setCode("002");
		cursoCompose.setCHTotal(100);
		cursoCompose.addComponent(disciplina);
		cursoCompose.addBook(livro);
		System.out.println(cursoCompose.getPreco());
		
		Course curso = new Course();
		curso.setName("ADS");
		curso.setCode("001");
		curso.setCHTotal(300);
		curso.addComponent(cursoCompose);
		curso.addComponent(cursoCompose);
		curso.addComponent(disciplina);
		curso.addBook(livro);
		curso.addBook(livro);		
		System.out.println(curso.getPreco());
	}
	
	public void q2() {
		System.out.println("q2 falta implementação");
	}
	
	public void q3() {
		System.out.println("teste");
	}	
}
