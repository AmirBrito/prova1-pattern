package application;

import director.cursoDirector;
import enums.ProductTypes;
import factory.IFactory;
import factory.ProductFactory;
import model.Book;
import model.Course;
import model.Disciplina;
import model.Product;
import model.ProductIF;
import builder.Curso;
import builder.PadroesCriacionaisBuilder;
import builder.cursoAbstractBuilder;

public class Client {
	
	public Client() {
	
	};
	
	public void Run() {

		System.out.println("Hello World");
	};
	
	public void q1() {
		
		/*"Forneça um esquema de criação de produtos, que permita a criação de instâncias de Livros e Disciplinas, sem   que   isto\n"
		+ "gere   impacto   na aplicação. A classe cliente precisa ser isolada do processo de criação e do conhecimento sobre os tipos\n"
		+ "concretos,   de   forma   a   não   ser impactada   pelo   oferecimento   de novos tipos de Produtos. Use um enum para definir\n"
		+ "o tipo de produto a ser criado. No método de criação, permita também, que seja fornecido o código e o nome do produto em instanciação."
		*/
		IFactory fabricaProduto = new ProductFactory();

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
		
		ProductIF produto3 = fabricaProduto.createProduct(type2, name, code, price);
		Course curso =  (Course) produto3;

	
		
		System.out.println(produto1);
		System.out.println(produto2);
		System.out.println(produto3);
	};
	

	
	public void order(String name, cursoAbstractBuilder builder) {
		
		System.out.println("Ordering " + name);	
		
		cursoDirector director = new cursoDirector(builder);
		director.constructCombo();
		System.out.println(director.getCombo());
		
		
		
	}
	
}
