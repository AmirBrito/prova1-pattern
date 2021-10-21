package model;

import java.util.ArrayList;
import java.util.List;

public class Course extends Product {
	
	private Integer CHTotal = 0;
	private Double PctCumprido = 0.00;
	private	ArrayList<Book> books = new ArrayList<>();
	private ArrayList<Disciplina> classes = new ArrayList<>();
	
	public void addBook(ArrayList<Book> books) {
		this.books.addAll(books);
	}
	
	public void addClass(ArrayList<Disciplina> disciplinas) {
		classes.addAll(disciplinas);
	}
	
	public List<Book> getBooks() {
		return books;
	}
	
	public List<Disciplina> getClasses(){
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
		return "Course [CHTotal=" + getCHTotal() + ", PctCumprido=" + getPctCumprido() + ", books=" + getBooks() + ", classes="
				+ getClasses() + "]";
	}
	
	
	
	
}
