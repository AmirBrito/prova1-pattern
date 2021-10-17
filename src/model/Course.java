package model;

import java.util.ArrayList;
import java.util.List;

public class Course extends Product {
	
	private Integer CHTotal;
	private Double PctCumprido;
	private	ArrayList<Book> books;
	private ArrayList<Disciplina> classes;
	
	public Course(String name, String code, Double price) {
		super(name, code, price);
		this.PctCumprido = 0.00;
		this.CHTotal = 0;
	}
	
	public void addBook(Book book) {
		this.books.add(book);
	}
	
	public void addClass(Disciplina disciplina) {
		this.classes.add(disciplina);
		setCHTotal(disciplina.getChTotal());
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

	private void setCHTotal(Integer cHTotal) {
		CHTotal += cHTotal;
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
