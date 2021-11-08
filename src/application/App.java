package application;

import java.util.ArrayList;
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

	@SuppressWarnings("null")
	public static void main(String[] args) throws CloneNotSupportedException  {

		test();		
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
		
		Boolean sair = false;
		Integer opcao = 0;
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);
		ProductFactory fabricaProduto = new ProductFactory();
		ArrayList<Book> listaLivros = new ArrayList<Book>();
		ArrayList<Disciplina> listaDisciplinas = new ArrayList<Disciplina>();
		
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
				ProductTypes type = ProductTypes.BOOK;
				String name = "livro 1";
				String code = "000123";
				Double price = 100.00;
				String isbn = "0125478539";				
				ProductIF produto1 = fabricaProduto.createProduct(type, name, code, price);
				Book book = (Book) produto1;
				book.setIsbn(isbn);
				listaLivros.add(book);
				System.out.println(listaLivros);
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
				listaDisciplinas.add(disciplina);				
				System.out.println(listaDisciplinas);
				break;				
			case 3:
				String nomeCurso = "ADS";
				String codigoCurso = "00001";
				Double precoCurso = (Double) 2000.00;
				Integer cargaHorariaCurso = 300;				
				
				Course course = order(nomeCurso, codigoCurso, precoCurso, cargaHorariaCurso, listaLivros, listaDisciplinas, new DevCourseBuilder());
				course.getClasses().get(0).setPctCumprido(100.00);
				System.out.println(course);					
				Ementa ementa = new Ementa(course);
				System.out.println(ementa);	
				break;				
			case 4:				
				ProductTypes type2 =  ProductTypes.DISCIPLINA;
				String name2 = "PWEB";
				String code2 = "000144";
				Double price2 = 500.00;
				ProductIF produto3 = fabricaProduto.createProduct(type2, name2, code2, price2);
				Disciplina disciplina2 = (Disciplina) produto3;
				
				ProductTypes type3 = ProductTypes.DISCIPLINA;
				String name3 = "INGLES";
				String code3 = "000144";
				Double price3 = 500.00;
				ProductIF produto4 = fabricaProduto.createProduct(type3, name3, code3, price3);
				Disciplina disciplina3 = (Disciplina) produto4;
				
				CoursePool pool = CoursePool.getInstance();
				Course clone1 = pool.cloner("Ads").withClass(disciplina3).now();
				clone1.addClass(disciplina2);
				System.out.println("*************************************");
				System.out.println(clone1);
				System.out.println("*************************************");
				pool.setCourseCatalogo("curso 2", clone1);
				break;
			case 5:
				listaLivros.removeAll(listaLivros);
				listaDisciplinas.removeAll(listaDisciplinas);
				break;
			default:
				System.out.println("Informe uma opcao valida.");
			}
		}
	}
	
	public static void menu() {
		System.out.println(" -------------------------------------");
		System.out.println("| 0 - Sair                            |");
		System.out.println("| 1 - Criar livro                     |");
		System.out.println("| 2 - Criar disciplina                |");
		System.out.println("| 3 - Criar curso                     |");
		System.out.println("| 4 - Clonar um curso                 |");
		System.out.println("| 5 - Limpar listas                   |");
		System.out.println(" -------------------------------------");
	}
}
