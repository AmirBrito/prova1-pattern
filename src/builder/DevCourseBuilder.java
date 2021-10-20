package builder;

import java.util.ArrayList;

import model.Book;
import model.Disciplina;

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
	public void buildChTotal(Integer ChTotal) {
		course.setCHTotal(ChTotal);
		
	}

	@Override
	public void buildBooks(ArrayList<Book> books) {
		course.addBook(books);
		
	}

	@Override
	public void buildClasses(ArrayList<Disciplina> disciplinas) {
		course.addClass(disciplinas);
		
	}
}
