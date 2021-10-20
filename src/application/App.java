package application;

import java.util.ArrayList;

import builder.Builder;
import builder.CourseBuilder;
import builder.CourseDirector;
import builder.CursoAbstractBuilder;
import builder.DevCourseBuilder;
import builder.EmentaBuilder;
import director.CursoDirector;
import enums.ProductTypes;
import factory.FactoryIF;
import factory.ProductFactory;
import model.Book;
import model.Course;
import model.Disciplina;
import model.ProductIF;


public class App {

	public static void main(String[] args) {
		
		/*"Forneça um esquema de criação de produtos, que permita a criação de instâncias de Livros e Disciplinas, sem   que   isto\n"
		+ "gere   impacto   na aplicação. A classe cliente precisa ser isolada do processo de criação e do conhecimento sobre os tipos\n"
		+ "concretos,   de   forma   a   não   ser impactada   pelo   oferecimento   de novos tipos de Produtos. Use um enum para definir\n"
		+ "o tipo de produto a ser criado. No método de criação, permita também, que seja fornecido o código e o nome do produto em instanciação."
		*/
		FactoryIF fabricaProduto = new ProductFactory();
		ProductTypes type = ProductTypes.BOOK;
		String name = "livro 1";
		String code = "000123";
		Double price = 100.00;
		String isbn = "0125478539";
		
		ProductIF produto1 = fabricaProduto.createProduct(type, name, code, price);
		Book book = (Book) produto1;
		book.setIsbn(isbn);	
		
		ProductTypes type1 = ProductTypes.DISCIPLINA;
		name = "padroes de projeto";
		code = "000144";
		price = 500.00;
		Integer chTotal = 90;
		
		ProductIF produto2 = fabricaProduto.createProduct(type1, name, code, price);
		Disciplina disciplina = (Disciplina) produto2;
		disciplina.setChTotal(chTotal);
		
		ProductTypes type2 = ProductTypes.COURSE;
		name = "ADS";
		code = "00001";
		price = 2000.00;
		
		//ProductIF produto3 = fabricaProduto.createProduct(type2, name, code, price);
		//Course curso =  (Course) produto3;

	
		
		System.out.println(book);
		System.out.println(disciplina);
		//System.out.println(curso);
		order(name, code, price, chTotal, null, null, new DevCourseBuilder());
		
	}
	
	public static void order(String name, String code, Double price, Integer ChTotal, ArrayList<Book> books, ArrayList<Disciplina> disciplinas, CourseBuilder builder) {
		System.out.println("Ordering a " + name);
		CourseDirector devDirector = new CourseDirector(builder);
		devDirector.constructCourse(name, code, price, ChTotal, books, disciplinas);
		System.out.println(devDirector.getCourse());
		System.out.println("--------------------");
	}
	
}
