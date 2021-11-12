package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import builder.AntigoCourseBuilder;
import builder.AntigoCourseDirector;
import builder.AntigoDevCourseBuilder;
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
		
		ProductTypes type = ProductTypes.DISCIPLINA;
		String nameClass = "Padroes de projeto";
		String codeClass = "000144";
		Double priceClass = 500.00;
		Integer chTotalClass = 90;
		DisciplinaFactory fabricaProduto = new DisciplinaFactory();
		ProductIF produto2 = fabricaProduto.createProduct(type, nameClass, codeClass, priceClass);
		Disciplina disciplina = (Disciplina) produto2;
		System.out.println(disciplina);
		
	
		Course curso = CourseBuilder.reset().withName("ADS").withCode("123").withCumprido(10.0).withPrice(10.0).withTotal(100).thatsAll();
		System.out.println(curso);
		
		Course curso2 = curso.prototipar();
		
		System.out.println(curso2);
		
		

		
		
		
	}
	
	
}
