package interfaces;

import java.util.List;

import model.Book;
import model.Disciplina;

public interface CoursePrototipagemIF{
	
	public ProductIF prototipar(String name, String code, Double price, List<Book> books, List<Disciplina> disciplinas);
}
