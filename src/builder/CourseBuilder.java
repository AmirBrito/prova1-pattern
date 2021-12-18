package builder;

import java.util.ArrayList;
import java.util.List;

import model.Book;
import model.Course;
import model.Disciplina;

public class CourseBuilder  {
	
	protected String name;
	protected String code;
	private Double price;
	private Integer CHTotal;
	private Double PctCumprido;
	private List<Book> books = new ArrayList<>();
	private List<Disciplina> classes = new ArrayList<>();
	
	
	public static CourseBuilder reset() {
		return new CourseBuilder();
	}


	public CourseBuilder withName(String name) {
		this.name = name;
		return this;
	}


	public CourseBuilder withCode(String code) {
		this.code = code;
		return this;
	}


	public CourseBuilder withPrice(Double price) {
		this.price = price;
		return this;
		
	}


	public CourseBuilder withTotal(Integer cHTotal) {
		CHTotal = cHTotal;
		return this;
	}


	public CourseBuilder withCumprido(Double pctCumprido) {
		PctCumprido = pctCumprido;
		return this;
	}


	public CourseBuilder withBooks(List<Book> books) {
		this.books = books;
		return this;
	}


	public CourseBuilder withClasses(List<Disciplina> classes) {
		this.classes = classes;
		return this;
	}
	
	public Course thatsAll() {
		return new Course(name,code,price, CHTotal, PctCumprido, books,null );
	}
	
	
	

}
