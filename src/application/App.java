package application;

import java.util.ArrayList;
import java.util.Scanner;

import builder.CourseBuilder;
import builder.CourseDirector;
import builder.DevCourseBuilder;
import enums.ProductTypes;
import factory.FactoryIF;
import factory.ProductFactory;
import model.Book;
import model.Course;
import model.Course.Builder;
import model.Disciplina;
import model.Ementa;
import model.Product;
import model.ProductIF;
import singleton.CoursePool;


public class App {

	@SuppressWarnings("null")
	public static void main(String[] args) throws CloneNotSupportedException  {
		
		/*"Forneça um esquema de criação de produtos, que permita a criação de instâncias de Livros e Disciplinas, sem   que   isto\n"
		+ "gere   impacto   na aplicação. A classe cliente precisa ser isolada do processo de criação e do conhecimento sobre os tipos\n"
		+ "concretos,   de   forma   a   não   ser impactada   pelo   oferecimento   de novos tipos de Produtos. Use um enum para definir\n"
		+ "o tipo de produto a ser criado. No método de criação, permita também, que seja fornecido o código e o nome do produto em instanciação."
		*/
		//test();
		test2();	
	
	}
	
	public static Course order(String name, String code, Double price, Integer ChTotal, ArrayList<Book> listaLivros, ArrayList<Disciplina> listaDisciplinas, CourseBuilder builder) {
		System.out.println("Ordering a " + name);
		CourseDirector devDirector = new CourseDirector(builder);
		devDirector.constructCourse(name, code, price, ChTotal, listaLivros, listaDisciplinas);
		
		CoursePool pool = CoursePool.getInstance();
		pool.setCourseCatalogo("Ads", devDirector.getCourse());
		System.out.println("*************************************");
		System.out.println(pool);
		System.out.println("*************************************");		
		
		return devDirector.getCourse();	
		
	}
	
	public static void test() throws CloneNotSupportedException {
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
		course.getClasses().get(0).setPctCumprido(100.00);
		System.out.println(course);
		
		
		Ementa ementa = new Ementa(course);
		System.out.println(ementa);	
		
		ProductTypes type3 = ProductTypes.DISCIPLINA;
		name = "Banco de Dados";
		code = "000155";
		price = 600.00;
		Integer chTotal1 = 90;
		
		ProductIF produto4 = fabricaProduto.createProduct(type3, name, code, price);
		Disciplina disciplina4 = (Disciplina) produto4;
		disciplina4.setChTotal(chTotal1);
		listaDisciplinas.add(disciplina4);
		
		
		CoursePool pool = CoursePool.getInstance();
		Builder clone1 = pool.cloner("Ads");
		Course clone2 = pool.cloner("Ads").withClasses(listaDisciplinas).now();
		System.out.println("*************************************");
		System.out.println(clone1);
		System.out.println(clone2);
		System.out.println("*************************************");
	}
	
	public static void test2() {
		
		Integer opcao = 999;
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);
		ProductFactory fabricaProduto = new ProductFactory();
		
		while (opcao != 0) {
			menu();
			System.out.println("Informe uma opcão: ");
			opcao = leitor.nextInt();
			
			switch (opcao) {
			case 0:
				System.out.println("quit");
				break;
			case 1:
				ProductTypes type = ProductTypes.BOOK;
				String name = "livro 1";
				String code = "000123";
				Double price = 100.00;
				String isbn = "0125478539";				
				ProductIF produto1 = fabricaProduto.createProduct(type, name, code, price);
				Book book = (Book) produto1;
				book.setIsbn(isbn);
				System.out.println(book);
				break;
			case 2:
				ProductTypes type1 = ProductTypes.DISCIPLINA;
				String name1 = "padroes de projeto";
				String code1 = "000144";
				Double price1 = 500.00;
				Integer chTotal1 = 90;
				ProductIF produto2 = fabricaProduto.createProduct(type1, name1, code1, price1);
				Disciplina disciplina = (Disciplina) produto2;
				disciplina.setChTotal(chTotal1);
				disciplina.setPctCumprido(50.00);
				System.out.println(disciplina);
				break;
			}
		}
	}
	
	public static void menu() {
		System.out.println(" -------------------------------------");
		System.out.println("| 0 - Sair                            |");
		System.out.println("| 1 - Criar e testar livro            |");
		System.out.println("| 2 - Criar e testar disciplina       |");
		System.out.println("| 3 - Criar testar e clonar um curso  |");
		System.out.println(" -------------------------------------");
	}
}
