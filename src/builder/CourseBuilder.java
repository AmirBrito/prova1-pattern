package builder;

import java.util.ArrayList;

import model.Book;
import model.Course;
import model.Disciplina;

public abstract class CourseBuilder {
	
	protected Course course;	
	
	public CourseBuilder() {
		
		course = new Course();
		
	}
	
	public Course getCourse() {
		return course;
	}
	
	public abstract void buildName(String name);
	public abstract void buildCode(String code);
	public abstract void buildPrice(Double price);
	public abstract void buildChTotal(ArrayList<Disciplina> disciplinas);
	public abstract void buildBooks(ArrayList<Book> books);
	public abstract void buildClasses(ArrayList<Disciplina> disciplinas);
	
}