package builder;

import java.util.ArrayList;
import java.util.List;

import model.Book;
import model.Course;
import model.Disciplina;
import model.Ementa;

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
	public abstract void buildChTotal(Integer ChTotal);
	public abstract void buildBooks(ArrayList<Book> books);
	public abstract void buildClasses(ArrayList<Disciplina> disciplinas);
	
}
