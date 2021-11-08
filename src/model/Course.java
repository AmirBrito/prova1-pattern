package model;

import java.util.ArrayList;
import java.util.List;

public class Course extends Product implements Cloneable {

	private Integer CHTotal = 0;
	private Double PctCumprido = 0.00;
	private ArrayList<Book> books = new ArrayList<>();
	private ArrayList<Disciplina> classes = new ArrayList<>();

	public void addBook(Book book) {
		this.books.add(book);
	}

	public void addClass(Disciplina disciplina) {
		classes.add(disciplina);
	}

	public void addBooks(ArrayList<Book> books) {
		this.books.addAll(books);
	}

	public void addClasses(ArrayList<Disciplina> disciplinas) {
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

	@Override
	public Course clone() throws CloneNotSupportedException {

		Course CloneCourse = (Course) super.clone();
		return CloneCourse;
	}

	public Builder cloneBuilder() {

		return new Builder(name, CHTotal, PctCumprido, books, classes);
	}

	public static class Builder {

		private String name;
		private Integer CHTotal;
		private Double PctCumprido;
		private ArrayList<Book> books;
		private ArrayList<Disciplina> classes;

		private Builder(String name, Integer CHTotal, Double PctCumprido, List<Book> books2,
						List<Disciplina> classes2) {

			this.name = name;
			this.CHTotal = CHTotal;
			this.PctCumprido = PctCumprido;
			this.books = (ArrayList<Book>) books2;
			this.classes = (ArrayList<Disciplina>) classes2;
		}

		public Builder withClasses(ArrayList<Disciplina> disciplinas) {
			this.classes.removeAll(this.classes);
			this.classes = disciplinas;
			return this;
		}

		public Builder withClass(Disciplina disciplina2) {
			this.classes.removeAll(this.classes);
			this.classes.add(disciplina2);
			return this;
		}

		public Course now() throws CloneNotSupportedException {

			Course course = new Course();
			course.setName(name);
			course.setCHTotal(CHTotal);
			course.setPctCumprido(PctCumprido);
			course.books = books;
			course.classes = classes;
			return course;
		}
	}
}
