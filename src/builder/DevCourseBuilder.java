package builder;

import java.util.ArrayList;

import model.Book;
import model.Course;
import model.Disciplina;
import model.Course.Builder;

public class DevCourseBuilder extends CourseBuilder{

	@Override
	public void buildName(String name) {
		course.setName(name);		
	}

	@Override
	public void buildCode(String code) {
		course.setCode(code);		
	}

	@Override
	public void buildPrice(Double price) {
		course.setPrice(price);		
	}

	@Override
	public void buildChTotal(ArrayList<Disciplina> disciplinas) {
		for(Disciplina disciplina : disciplinas) {
			course.setCHTotal(disciplina.getChTotal());
		}		
	}

	@Override
	public void buildBooks(ArrayList<Book> books) {
		course.addBooks(books);		
	}

	@Override
	public void buildClasses(ArrayList<Disciplina> disciplinas) {
		course.addClasses(disciplinas);		
	}
}