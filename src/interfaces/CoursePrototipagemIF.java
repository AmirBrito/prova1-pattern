package interfaces;

import java.util.List;

import model.Book;
import model.Disciplina;

public interface CoursePrototipagemIF{
	
	public ProductIF prototipar(List<Book> books, List<Disciplina> disciplinas);
}
