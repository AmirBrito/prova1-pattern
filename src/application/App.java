package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import builder.CourseBuilder;
import builder.CourseDirector;
import builder.DevCourseBuilder;
import enums.ProductTypes;
import factory.ProductFactory;
import interfaces.ProductIF;
import model.Book;
import model.Course;
import model.Disciplina;
import model.Ementa;
import singleton.CoursePool;


public class App {


	public static void main(String[] args) throws CloneNotSupportedException  {
		
		test();		
	}
	
	public static Course order(String name, String code, Double price, List<Book> listaLivros, List<Disciplina> listaDisciplinas, CourseBuilder builder) {
		System.out.println("Ordering a " + name);
		CourseDirector devDirector = new CourseDirector(builder);
		devDirector.constructCourse(name, code, price, listaLivros, listaDisciplinas);
		return devDirector.getCourse();		
	}
	
	public static void test() throws CloneNotSupportedException {
		
		Boolean sair = false;
		Integer opcao = 0;
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);
		ProductTypes type = ProductTypes.BOOK;
		Course course1 = new Course();
		Course course2 = new Course();
		Course courseAux = new Course();
		Ementa ementa1 = new Ementa(course1);
		Ementa ementa2 = new Ementa(course2);
		ProductFactory fabricaProduto = new ProductFactory();
		List<Book> library1 = new ArrayList<Book>();
		List<Book> library2 = new ArrayList<Book>();
		List<Disciplina> listClasses1 = new ArrayList<Disciplina>();
		List<Disciplina> listClasses2 = new ArrayList<Disciplina>();
		CoursePool pool = CoursePool.getInstance();
		
		while (sair != true) {
			menu();
			System.out.println("Informe uma opcao: ");
			opcao = leitor.nextInt();
			
			switch (opcao) {
			case 0:
				sair = true;
				System.out.println("quit");
				break;				
			case 1:
				type = ProductTypes.BOOK;
				String nameBook = "livro 1";
				String codeBook = "000123";
				Double priceBook = 100.00;
				String isbn = "0125478539";				
				ProductIF produto1 = fabricaProduto.createProduct(type, nameBook, codeBook, priceBook);
				Book book = (Book) produto1;
				book.setIsbn(isbn);
				library1.add(book);
				
				nameBook = "livro 2";
				codeBook = "00124";
				priceBook = 125.00;
				isbn = "15115321548";
				produto1 = fabricaProduto.createProduct(type, nameBook, codeBook, priceBook);
				book = (Book) produto1;
				book.setIsbn(isbn);
				library1.add(book);
				
				nameBook = "livro 3";
				codeBook = "01156";
				priceBook = 80.00;
				isbn = "151516515487";
				produto1 = fabricaProduto.createProduct(type, nameBook, codeBook, priceBook);
				book = (Book) produto1;
				book.setIsbn(isbn);
				library1.add(book);
				
				nameBook = "livro 4";
				codeBook = "01879";
				priceBook = 200.00;
				isbn = "1156474871";
				produto1 = fabricaProduto.createProduct(type, nameBook, codeBook, priceBook);
				book = (Book) produto1;
				book.setIsbn(isbn);
				library2.add(book);
				
				nameBook = "livro 5";
				codeBook = "02004";
				priceBook = 150.00;
				isbn = "1561547878";
				produto1 = fabricaProduto.createProduct(type, nameBook, codeBook, priceBook);
				book = (Book) produto1;
				book.setIsbn(isbn);
				library2.add(book);
				
				nameBook = "livro 6";
				codeBook = "02254";
				priceBook = 115.00;
				isbn = "111479818";
				produto1 = fabricaProduto.createProduct(type, nameBook, codeBook, priceBook);
				book = (Book) produto1;
				book.setIsbn(isbn);
				library2.add(book);
				
				if(library1 == null || library2 == null)
					System.out.println("ERROR -> Livros não criados!\n");
				else
					System.out.println("SUCCESS -> Livros criados!\n");
				break;				
			case 2:
				type = ProductTypes.DISCIPLINA;
				String nameClass = "Padroes de projeto";
				String codeClass = "000144";
				Double priceClass = 500.00;
				Integer chTotalClass = 90;
				ProductIF produto2 = fabricaProduto.createProduct(type, nameClass, codeClass, priceClass);
				Disciplina disciplina = (Disciplina) produto2;
				disciplina.setChTotal(chTotalClass);
				listClasses1.add(disciplina);
				
				nameClass = "Programacao Web";
				codeClass = "000150";
				priceClass = 300.00;
				chTotalClass = 60;
				produto2 = fabricaProduto.createProduct(type, nameClass, codeClass, priceClass);
				disciplina = (Disciplina) produto2;
				disciplina.setChTotal(chTotalClass);
				listClasses1.add(disciplina);
				
				nameClass = "Metodologia de pesquisa";
				codeClass = "000199";
				priceClass = 350.00;
				chTotalClass = 100;
				produto2 = fabricaProduto.createProduct(type, nameClass, codeClass, priceClass);
				disciplina = (Disciplina) produto2;
				disciplina.setChTotal(chTotalClass);
				listClasses2.add(disciplina);
				
				nameClass = "Programacao Orientada a Objetos";
				codeClass = "000225";
				priceClass = 450.00;
				chTotalClass = 75;
				produto2 = fabricaProduto.createProduct(type, nameClass, codeClass, priceClass);
				disciplina = (Disciplina) produto2;
				disciplina.setChTotal(chTotalClass);
				listClasses2.add(disciplina);
				
				if(listClasses1 == null || listClasses2 == null)
					System.out.println("ERROR -> Disciplinas não criadas criadas!\n");	
				else
					System.out.println("SUCCESS -> Disciplinas criadas!\n");
				break;				
			case 3:
				String nameCourse = "ADS";
				String codeCourse = "00001";
				Double priceCourse = (Double) 2000.00;				
				course1 = order(nameCourse, codeCourse, priceCourse, library1, listClasses1, new DevCourseBuilder());
				pool.setCourseCatalogo("curso 1", course1);
				
				if(pool.getCourseCatalogo("curso 1") == null)
					System.out.println("ERROR -> Curso não criado!\n");
				else
					System.out.println("SUCCESS -> Curso criado!\n");
				break;				
			case 4:
				courseAux = pool.getCourseCatalogo("curso 1");
				course2 = courseAux.prototipar(library2, listClasses2);
				pool.setCourseCatalogo("curso 2", course2);				
				break;
			case 5:
				for(Book auxBook : library1) {
					System.out.println(auxBook);
				}
				System.out.println("----------------------------\n\n\n");
				for(Book auxBook1 : library1) {
					System.out.println(auxBook1);
				}
				break;
			case 6:
				for(Disciplina auxClass : listClasses1) {
					System.out.println(auxClass);
				}
				System.out.println("----------------------------\n\n\n");
				for(Disciplina auxClass1 : listClasses2) {
					System.out.println(auxClass1);
				}
				break;
			case 7:
				System.out.println(pool.getCourseCatalogo("curso 1"));
				System.out.println("------------------");
				ementa1.setCourse(pool.getCourseCatalogo("curso 1"));
				System.out.println(ementa1);
				
				System.out.println("--------------------------------------");
				System.out.println(pool.getCourseCatalogo("curso 2"));				
				System.out.println("--------------------------------------");
				ementa2.setCourse(pool.getCourseCatalogo("curso 2"));
				break;	
			default:
				System.out.println("Informe uma opcao valida - (0 a 6).7");
				break;
			}
		}
	}
	
	public static void menu() {
		System.out.println(" -------------------------------------");
		System.out.println("| 0 - Sair                            |");
		System.out.println("| 1 - Criar Livros                    |");
		System.out.println("| 2 - Criar Disciplinas               |");
		System.out.println("| 3 - Criar Curso                     |");
		System.out.println("| 4 - Clonar Curso                    |");
		System.out.println("| 5 - Listar Livros                   |");
		System.out.println("| 6 - Listar Disciplinas              |");
		System.out.println("| 7 - Listar Cursos do catalogo       |");
		System.out.println(" -------------------------------------");
	}
}
