package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import builder.CourseBuilder;
import enums.ProductTypes;
import factories.BookFactory;
import factories.DisciplinaFactory;
import interfaces.FactoryIF;
import interfaces.ProductIF;
import model.Book;
import model.Course;
import model.Disciplina;
import model.Ementa;
import singleton.CoursePool;


public class App {


	public static void main(String[] args) throws CloneNotSupportedException  {
		

		new App().q1();	
		
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
		int chTotalClass = 90;
		DisciplinaFactory fabricaProduto = new DisciplinaFactory();
		ProductIF produto2 = fabricaProduto.createProduct(type, nameClass, codeClass, priceClass);
		Disciplina disciplina = (Disciplina) produto2;
		System.out.println(disciplina);
		
		Course cursoCompose = new Course();
		cursoCompose.setName("Padroes de Projeto");
		cursoCompose.setCode("002");
		cursoCompose.setCHTotal(100);
		cursoCompose.addComponent(disciplina);
		System.out.println(cursoCompose.getPreco());
		
		Course curso = new Course();
		curso.setName("ADS");
		curso.setCode("001");
		curso.setCHTotal(300);
		curso.addComponent(disciplina);
		curso.addComponent(cursoCompose);
		curso.addComponent(cursoCompose);
		curso.addBook(livro);
		curso.addBook(livro);
		
		System.out.println(curso.getPreco());
	}
	
	
}
