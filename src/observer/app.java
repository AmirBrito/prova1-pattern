package observer;

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
		System.out.println(disciplina.getPctCumprido());
		
		
		curso.avancar(disciplina, 0.25);
		checks.push(curso.getSnapshot());
		System.out.println(disciplina.getPctCumprido());
		curso.avancar(disciplina, 0.20);
		checks.push(curso.getSnapshot());
		System.out.println(disciplina.getPctCumprido()+"\n");

		//ainda possui um erro no calculo carga horaria ao restaurar disciplina
		curso.restore(checks.pop());
		System.out.println(disciplina.getPctCumprido());


		

			
		
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
	
	
	public void q3() {
		

	}
	
	public static void main(String[] args) {

		//new app().q1();
		
		//new app().q2();
		
		new app().q3();
		
		
	}		
}
