package model;

import java.util.ArrayList;
import java.util.List;

import composite.componentCursavelIF;



public class Course extends Product implements componentCursavelIF{

	private Integer CHTotal = 0;
	private Double PctCumprido = 0.00;
	private List<Book> books = new ArrayList<>();
	private List<componentCursavelIF> componentes = new ArrayList<>();
		

	public Course(String name, String code, Double price, int CHTotal, Double pctCumprido, List<Book> books, List<componentCursavelIF> componentes) {
		super();
		this.name = name;
		this.code = code;
		this.price = price;
		this.CHTotal = CHTotal;
		this.PctCumprido = pctCumprido;
		this.books = books;
		this.componentes = componentes;	
	}
	
	public void addComponent(componentCursavelIF item) {
		this.componentes.add(item);
	}
	
	public void removeComponent(componentCursavelIF item) {
		this.componentes.remove(item);
	}
	
	public List<componentCursavelIF> getComponents(){
		return this.componentes;
	}

	public void addBook(Book book) {
		this.books.add(book);
	}


	public void addBooks(List<Book> books) {
		this.books.addAll(books);
	}

	public List<Book> getBooks() {
		return books;
	}

	public void addCHTotal(Integer chTotal) {
		CHTotal += chTotal;
	}
	
	public Integer getCHTotal() {
		return CHTotal;
	}
	
	
	public void setCHTotal(Integer cHTotal) {
		CHTotal = cHTotal;
	}

	public double getPctCumprido() {
		double pct = 0.0;
		
		for(componentCursavelIF item : componentes) {
				pct += item.getPctCumprido();
		}
		return pct;
	}

	public void setPctCumprido(double pctCumprido){
		this.PctCumprido = pctCumprido;
	}

	@Override
	public String toString() {

		return "Course: " + this.getName() + "\n" + "Code: " + this.getCode() + "\n" + "CHTotal: " //+ this.getCHTotal()
				+ "\n" + "PCtCumprido: " + this.PctCumprido + "\n" + "Books: " + this.getBooks() + "\n" + "Classes: "
				+ "\n";
	}
	
	public Course prototipar() {
		
		Course curso = new Course(this.name, this.code, this.price, this.CHTotal, this.PctCumprido, this.books, this.componentes);
		return curso;		
	}

	@Override
	public double getPreco() {
		
		double precoComponents = 0.0;
		double precoLivros = 0.0;
		double total = 0.0;
		
		//recursividade nos componentes;
		for(componentCursavelIF item : componentes) {
			precoComponents += item.getPreco();
		}
		
		for(Book item : this.books) {
			precoLivros += item.getPrice();
		}
		
		// descontos
		precoComponents -= precoComponents * 0.2;
		precoLivros -= precoLivros * 0.1;
		total = precoComponents + precoLivros;
		
		return total;
	}

	@Override
	public double getChTotal() {
		double cargaHoraria = 0.0;
		
		for(componentCursavelIF item : componentes) {
			cargaHoraria += item.getChTotal();
		}
		return cargaHoraria;
	}	
}
