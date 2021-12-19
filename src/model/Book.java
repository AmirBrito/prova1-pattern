package model;

import decorator.BookDecoratorIF;

public class Book extends Product implements BookDecoratorIF{

	private static String isbn = "";

	public void setIsbn(String isbn) {
		Book.isbn = isbn;
	}

	public Book(String name, String code, Double price) {
		super(name, code, price);
		
	}

	public static String getIsbn() {
		return isbn;
	}

	@Override
	public String toString() {
		return "Book [name=" + getName() + ", code=" + getCode() + ", price=" + getPrice() + ", isbn=" + getIsbn()+"]"+"\n";
	}
}
