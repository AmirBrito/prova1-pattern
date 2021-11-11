package builder;

import java.util.List;

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
	public void buildChTotal(List<Disciplina> disciplinas) {
		for(Disciplina disciplina : disciplinas) {
			course.setCHTotal(disciplina.getChTotal());
		}		
	}

	@Override
	public void buildBooks(List<Book> books) {
		course.addBooks(books);		
	}

	@Override
	public void buildClasses(List<Disciplina> disciplinas) {
		course.addClasses(disciplinas);		
	}
}