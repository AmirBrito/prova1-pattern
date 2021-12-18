package model;

public class Ementa {
	
	Course course;	
	
	public Ementa(Course course) {
		super();
		this.course = course;
	}
	
	public Course getCourse() {
		return course;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}		
	
	public String toString() {
		return "Ementa: " + course.getName()+"\n"+
				"Codigo do Curso: " + course.getCode() +"\n"+
				"Livros: " + course.getBooks()+"\n"+
				"Disciplinas: " + course.getComponents(); 
	}
	
}
