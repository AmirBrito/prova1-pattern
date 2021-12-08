package memento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import builder.CourseBuilder;
import model.Book;
import model.Course;
import model.Disciplina;




public class Caretaker {
	
	
	
	List<Course.Snapshot > snapshots = new ArrayList<Course.Snapshot>();
	

	
	public List<Course.Snapshot> getHistoryList() {
	      return Collections.unmodifiableList(snapshots);
	}
	
	public void add(Course curso) {
		snapshots.add(curso.getSnapshot());
	}
	
	public Course.Snapshot get(int index) {
		return snapshots.get(index);
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Caretaker caretaker = new Caretaker();
		Course curso = CourseBuilder.reset().withName("ADS").withCode("123").withCumprido(5.0).withPrice(5.0).withTotal(0).thatsAll();
		caretaker.add(curso);
		System.out.println(curso);
		
		curso.addCHTotal(200);
		caretaker.add(curso);
		curso.addCHTotal(200);
		caretaker.add(curso);
	
		
		System.out.println(curso);
		
		
		
		curso.restore( caretaker.get(1));
		System.out.println(curso);
		

	}

	
	

}
