package application;

import java.util.ArrayList;

import builder.CourseBuilder;
import builder.CourseDirector;
import builder.DevCourseBuilder;
import enums.ProductTypes;
import factory.FactoryIF;
import factory.ProductFactory;
import model.Book;
import model.Course;
import model.Disciplina;
import model.Ementa;
import model.ProductIF;


public class App {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		/*"Forneça um esquema de criação de produtos, que permita a criação de instâncias de Livros e Disciplinas, sem   que   isto\n"
		+ "gere   impacto   na aplicação. A classe cliente precisa ser isolada do processo de criação e do conhecimento sobre os tipos\n"
		+ "concretos,   de   forma   a   não   ser impactada   pelo   oferecimento   de novos tipos de Produtos. Use um enum para definir\n"
		+ "o tipo de produto a ser criado. No método de criação, permita também, que seja fornecido o código e o nome do produto em instanciação."
		*/
		test();
	}
	
	public static Course order(String name, String code, Double price, Integer ChTotal, ArrayList<Book> listaLivros, ArrayList<Disciplina> listaDisciplinas, CourseBuilder builder) {
		System.out.println("Ordering a " + name);
		CourseDirector devDirector = new CourseDirector(builder);
		devDirector.constructCourse(name, code, price, ChTotal, listaLivros, listaDisciplinas);
		return devDirector.getCourse();
	}
	
	public static void test() {
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
		ProductIF produto3 = fabricaProduto.createProduct(type1, name, code, price);
		Disciplina disciplina = (Disciplina) produto2;
		Disciplina disciplina1 = (Disciplina) produto3;
		disciplina.setChTotal(chTotal);
		disciplina1.setChTotal(chTotal);
		
		ArrayList<Book> listaLivros = new ArrayList<>();
		ArrayList<Disciplina> listaDisciplinas = new ArrayList<>();
		listaLivros.add(book);
		listaLivros.add(book);
		listaDisciplinas.add(disciplina);
		listaDisciplinas.add(disciplina1);
		
		ProductTypes type2 = ProductTypes.COURSE;
		name = "ADS";
		code = "00001";
		price = 2000.00;

		Course course = order(name, code, price, chTotal, listaLivros, listaDisciplinas, new DevCourseBuilder());
		System.out.println(course);
		
		Ementa ementa = new Ementa(course);
		System.out.println(ementa);		
	}
}
