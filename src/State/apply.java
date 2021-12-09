package State;



import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import builder.CourseBuilder;
import memento.Caretaker;
import State.Course;
import State.Course.Snapshot;
import model.Book;
import model.Disciplina;

public class apply {
	

	
	public void q3() {
		
		Stack<Snapshot> checks = new Stack<Snapshot>();
		List<Disciplina> disciplinas = new ArrayList<>();
		List<Book> books = new ArrayList<>();
		Course curso = new Course("Filosofia", "333", 500.00, 60, 0.2, books,disciplinas);
		

		checks.push(curso.getSnapshot());
		System.out.println(curso.getRelatorio());
		
		curso.continuar();
		curso.setCHTotal(10);		
		curso.setPrice(10.00);
		
		curso.getSnapshotState();
		System.out.println(curso.getRelatorio());
		



	
		curso.continuar();
		
		//teste 1 
		//nao executando snapshot apos concluido ok
		//nao executando restore apos concluido fail
		curso.concluir();
		//curso.getSnapshotState();
		//curso.restoreState(checks.get(0));
		//System.out.println(curso.getRelatorio());
		
		//teste 2 ok curso nao sai do estado concluido para andamento
		curso.continuar();//nao vai executar 
	}
	
	public static void main(String[] args) {

		
		new apply().q3();
		
		
	}		
}