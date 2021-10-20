package model;

import java.util.ArrayList;
import java.util.List;

public class Course extends Product {
	
	private Integer CHTotal;
	private Double PctCumprido;
	private	ArrayList<Book> books;
	private ArrayList<Disciplina> classes;
	
	public void addBook(ArrayList<Book> books) {
		books.addAll(books);
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
		CHTotal = chTotal;
	}

	public Double getPctCumprido() {
		return PctCumprido;
	}

	public void setPctCumprido(Double pctCumprido) {
		PctCumprido = pctCumprido;
	}

	@Override
	public String toString() {
		return "Course [CHTotal=" + getCHTotal() + ", PctCumprido=" + getPctCumprido() + ", books=" + getBooks() + ", classes="
				+ getClasses() + "]";
	}
	
	
	
	
}
