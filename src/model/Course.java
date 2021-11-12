package model;

import java.util.ArrayList;
import java.util.List;

import builder.AntigoCourseDirector;
import builder.AntigoDevCourseBuilder;
import interfaces.CoursePrototipagemIF;

public class Course extends Product {

	private Integer CHTotal = 0;
	private Double PctCumprido = 0.00;
	private List<Book> books = new ArrayList<>();
	private List<Disciplina> classes = new ArrayList<>();
	
	

	public Course(String name, String code, Double price, Integer CHTotal, Double pctCumprido, List<Book> books, List<Disciplina> classes) {
		super();
		this.name = name;
		this.code = code;
		this.price = price;
		CHTotal = CHTotal;
		PctCumprido = pctCumprido;
		this.books = books;
		this.classes = classes;
	}

	public void addBook(Book book) {
		this.books.add(book);
	}

	public void addClass(Disciplina disciplina) {
		classes.add(disciplina);
	}

	public void addBooks(List<Book> books) {
		this.books.addAll(books);
	}

	public void addClasses(List<Disciplina> disciplinas) {
		classes.addAll(disciplinas);
	}

	public List<Book> getBooks() {
		return books;
	}

	public List<Disciplina> getClasses() {
		return classes;
	}

	public Integer getCHTotal() {
		return CHTotal;
	}

	public void setCHTotal(Integer chTotal) {
		CHTotal += chTotal;
	}

	public Double getPctCumprido() {
		return PctCumprido;
	}

	public void setPctCumprido() {
		double aux = classes.size();
		double aux2 = 0.00;
		for(Disciplina disciplina : classes) {
			if(disciplina.getConcluida() == true)
				aux2++;
		}
		this.PctCumprido = (aux2 / aux * 100);
	}

	@Override
	public String toString() {

		return "Course: " + this.getName() + "\n" + "Code: " + this.getCode() + "\n" + "CHTotal: " + this.getCHTotal()
				+ "\n" + "PCtCumprido: " + this.PctCumprido + "\n" + "Books: " + this.getBooks() + "\n" + "Classes: "
				+ this.getClasses() + "\n";
	}
	
	public Course prototipar() {
		
		Course curso = new Course(this.name, this.code, this.price, this.CHTotal, this.PctCumprido, this.books, this.classes);
		return curso;		
	}
}
