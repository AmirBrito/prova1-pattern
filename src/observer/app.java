package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import builder.CourseBuilder;
import memento.Caretaker;
import model.Course;
import model.Course.Snapshot;
import model.Disciplina;

public class app {
	
	public void q1() {
		
		System.out.println("******Questao 1******");
		
		Stack<Snapshot> checks = new Stack<Snapshot>();
		Disciplina disciplina = new Disciplina("Mat", "MAT01", 1000.00);
		Course curso = CourseBuilder.reset().withName("ADS").withCode("123").withCumprido(5.0).withPrice(5.0).withTotal(0).thatsAll();
		curso.addClass(disciplina);
		
		checks.push(curso.getSnapshot());
		
		curso.avancar(disciplina, 25);
		curso.setPrice(100.00);
		checks.push(curso.getSnapshot());
		System.out.println(disciplina.getChTotal());
		curso.avancar(disciplina, 20);
		checks.push(curso.getSnapshot());
		System.out.println(disciplina.getChTotal()+"\n");
		

		curso.restore(checks.get(1));
		System.out.println(curso.getRelatorio());	
		


		

			
		
	}
	
	public void q2() {
		
		System.out.println("\n\n\n\n******Questao 2******\n");
		
		Observer observer = new Observer();
		Course curso = CourseBuilder.reset().withName("ADS").withCode("123").withCumprido(5.0).withPrice(5.0).withTotal(0).thatsAll();
		curso.attachStateChangedObserver(observer);
		
		Caretaker caretaker = new Caretaker();

		curso.addCHTotal(200);
		caretaker.add(curso);
		
		System.out.println(curso.getCHTotal()+ "hs\n");	
		curso.addCHTotal(200);
		caretaker.add(curso);
		
		System.out.println(curso.getCHTotal() + "hs\n");
		curso.restore( caretaker.get(0));
		System.out.println(curso.getCHTotal()+ "hs\n");
		
		
	}
	
	

	
	public static void main(String[] args) {

		//new app().q1();
		
		new app().q2();
		
		
	}		
}
