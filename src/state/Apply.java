package state;



import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import builder.CourseBuilder;
import memento.Caretaker;
import model.Book;
import model.Disciplina;
import observer.Observer;
import state.Course;
import state.Course.Snapshot;

public class Apply {
	

	
	public void q3() {
		
		Stack<Snapshot> checks = new Stack<Snapshot>();
		List<Disciplina> disciplinas = new ArrayList<>();
		List<Book> books = new ArrayList<>();		
		Course curso = new Course("Filosofia", "333", 500.00, 60, 0.2, books,disciplinas);

		
		

		curso.getSnapshotState(curso);
		System.out.println(curso.getRelatorio());
		
		curso.continuar();
		curso.setCHTotal(10);		
		curso.setPrice(10.00);
		
		
		//System.out.println(curso.getRelatorio());
		

		curso.getCertificado(curso);

	
		curso.continuar();
		
		
		
		curso.concluir();

		curso.getCertificado(curso);

		

		curso.continuar();
	}
	
	/*public static void main(String[] args) {

		
		new Apply().q3();
		
		
	}	*/	
}