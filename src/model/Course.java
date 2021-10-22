package model;

import java.util.ArrayList;
import java.util.List;

import builder.CourseDirector;
import builder.DevCourseBuilder;

public class Course extends Product implements Cloneable{
	




	private Integer CHTotal = 0;
	private Double PctCumprido = 0.00;
	private	ArrayList<Book> books = new ArrayList<>();
	private ArrayList<Disciplina> classes = new ArrayList<>();
	

	


	public void addBook(ArrayList<Book> books) {
		this.books.addAll(books);
	}
	
	public void addClass(ArrayList<Disciplina> disciplinas) {
		classes.addAll(disciplinas);
	}
	
	public List<Book> getBooks() {
		return books;
	}
	
	public List<Disciplina> getClasses(){
		return classes;
	}

	public Integer getCHTotal() {
		return CHTotal;
	}

	public void setCHTotal(Integer chTotal) {
		CHTotal += chTotal;
	}

	public Double getPctCumprido() {
		return PctCumprido;
	}

	public void setPctCumprido(Double pctCumprido) {
		PctCumprido += pctCumprido;
	}

	@Override
	public String toString() {
		return "Course [CHTotal=" + getCHTotal() + ", PctCumprido=" + getPctCumprido() + ", books=" + getBooks() + ", classes="
				+ getClasses() + "]";
	}
	
	
	@Override
	public Course clone() throws CloneNotSupportedException {
		
		Course CloneCourse = (Course) super.clone();
		return CloneCourse;
		
	}
	
	public Builder cloneBuilder() {
		
		return new Builder(name, CHTotal, PctCumprido, books, classes);
	}
	

	public static class Builder {
		
	
	

		private String name;
		private Integer CHTotal;
		private Double PctCumprido;
		private ArrayList<Book> books;
		private ArrayList<Disciplina> classes;

		private Builder(String name,Integer CHTotal, Double PctCumprido, ArrayList<Book> books, ArrayList<Disciplina> classes ) {
			
			this.name =name;
			this.CHTotal = CHTotal;
			this.PctCumprido = PctCumprido;
			this.books = books;
			this.classes = classes;
		}
		
		
		public Builder withClasses(ArrayList<Disciplina> disciplinas) {
			this.classes = disciplinas;
			return this;
		}	
		
	
		
		public Course now() throws CloneNotSupportedException {
			
		/*	CourseDirector devDirector = new CourseDirector(builder);
			devDirector.constructCourse(name, code, price, ChTotal, listaLivros, listaDisciplinas);
			new DevCourseBuilder()*/
			Course course = new Course();
			course.setName(name);
			course.setCHTotal(CHTotal);
			course.setPctCumprido(PctCumprido);
			course.books = books;
			course.classes = classes;
			
			return course;
		}
		
		@Override
		public String toString() {
			return "Builder [name=" + name + ", CHTotal=" + CHTotal + ", PctCumprido=" + PctCumprido + ", books="
					+ books + ", classes=" + classes + "]";
		}
		
		
	}


	
}



