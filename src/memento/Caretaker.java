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
	
	


	
	

}
