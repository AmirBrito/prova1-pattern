package builder;

import java.util.ArrayList;

import model.Book;
import model.Course;
import model.Disciplina;

public class CourseDirector {
	
	private CourseBuilder builder;
	
	public CourseDirector(CourseBuilder builder) {
		this.builder = builder;
	}
	
	public void constructCourse(String name, String code, Double price, Integer ChTotal, ArrayList<Book> books, ArrayList<Disciplina> disciplinas) {
		builder.buildName(name);
		builder.buildCode(code);
		builder.buildPrice(price);
		builder.buildChTotal(disciplinas);
		builder.buildBooks(books);
		builder.buildClasses(disciplinas);
	}
	
	public Course getCourse() {
		return builder.getCourse();
	}
}
