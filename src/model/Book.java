package model;

public class Book extends Product {

	private static String isbn;

	public Book(String name, String code, Double price, String isbn) {
		super(name, code, price);
		this.isbn = isbn;
	}

	public static String getIsbn() {
		return isbn;
	}

	@Override
	public String toString() {
		return "Book [name=" + getName() + ", code=" + getCode() + ", price=" + getPrice() + ", isbn=" + getIsbn()
				+ "]";
	}
}
