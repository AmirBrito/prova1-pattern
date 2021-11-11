package model;

import java.util.ArrayList;
import java.util.List;

import builder.CourseDirector;
import builder.DevCourseBuilder;
import interfaces.CoursePrototipagemIF;

public class Course extends Product implements CoursePrototipagemIF{

	private Integer CHTotal = 0;
	private Double PctCumprido = 0.00;
	private List<Book> books = new ArrayList<>();
	private List<Disciplina> classes = new ArrayList<>();

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

	public void setPctCumprido(Double pctCumprido) {
		PctCumprido += pctCumprido;
	}

	@Override
	public String toString() {

		return "Course: " + this.getName() + "\n" + "Code: " + this.getCode() + "\n" + "CHTotal: " + this.getCHTotal()
				+ "\n" + "PCtCumprido: " + this.PctCumprido + "\n" + "Books: " + this.getBooks() + "\n" + "Classes: "
				+ this.getClasses() + "\n";
	}
	
	public Course prototipar(String name, String code, Double price, List<Book> books, List<Disciplina> disciplinas) {
		
		CourseDirector director = new CourseDirector(new DevCourseBuilder());
		Course course = new Course();
		director.constructCourse(name, code, price, books, disciplinas);
		course = director.getCourse();
		return course;		
	}
}
