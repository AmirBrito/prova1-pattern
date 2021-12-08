package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import interfaces.ObserverIF;




public class Course extends Product {

	private Integer CHTotal = 0;
	private Double PctCumprido = 0.00;
	private List<Book> books = new ArrayList<>();
	private List<Disciplina> classes = new ArrayList<>();
	
	private List<ObserverIF> observers;
	
	

	public Course(String name, String code, Double price, int CHTotal, Double pctCumprido, List<Book> books, List<Disciplina> classes) {
		super();
		this.name = name;
		this.code = code;
		this.price = price;
		this.CHTotal = CHTotal;
		PctCumprido = pctCumprido;
		this.books = books;
		this.classes = classes;
		this.observers = new LinkedList<ObserverIF>();
	}

	public void addBook(Book book) {
		this.books.add(book);
	}

	public void addClass(Disciplina disciplina) {
		classes.add(disciplina);
	}

	public void addBooks(List<Book> books) {
		this.books.addAll(books);
	}

	public void addClasses(List<Disciplina> disciplinas) {
		classes.addAll(disciplinas);
	}

	public List<Book> getBooks() {
		return books;
	}

	public List<Disciplina> getClasses() {
		return classes;
	}

	public Integer getCHTotal() {
		return CHTotal;
	}
	
	
	public void setCHTotal(Integer cHTotal) {
		CHTotal = cHTotal;
	}

	public void addCHTotal(Integer chTotal) {
		CHTotal += chTotal;
	}

	public Double getPctCumprido() {
		return PctCumprido;
	}

	public void setPctCumprido(){
		double aux = classes.size();
		double aux2 = 0.00;
		for(Disciplina disciplina : classes) {
			if(disciplina.getConcluida() == true)
				aux2++;
		}
		this.PctCumprido = (aux2 / aux * 100);
	}

	@Override
	public String toString() {

		return "Course: " + this.getName() + "\n" + "Code: " + this.getCode() + "\n" + "CHTotal: " + this.getCHTotal()
				+ "\n" + "PCtCumprido: " + this.PctCumprido + "\n" + "Books: " + this.getBooks() + "\n" + "Classes: "
				+ this.getClasses() + "\n";
	}
	
	public Course prototipar() {
		
		Course curso = new Course(this.name, this.code, this.price, this.CHTotal, this.PctCumprido, this.books, this.classes);
		return curso;		
	}
	
	
	
	//**********************************************************Prova 2****************************************************************************//
	
	public void avancar (Disciplina disciplina, Double PctCumprido) {
		
		disciplina.addPctCumprido(PctCumprido);
	}
	
	
	
	//q1
	public Snapshot getSnapshot() {
		
		this.notifyObserver("Get SnapShot");
		return new Snapshot(this, this.name, this.code, this.price, this.CHTotal, this.PctCumprido, this.books, this.classes);
							
	}
	
	public void restore(Snapshot snapshot) {
		snapshot.restore();
		this.notifyObserver("Get restore");
	}
	
	
	public static class Snapshot {
		
		private Course course;
		
		private String name; 
		private String code; 
		private Double price; 
		private int CHTotal; 
		private Double pctCumprido; 
		private List<Book> books; 
		private  List<Disciplina> classes;
		


		private Snapshot (Course course, String name, String code, Double price, int CHTotal, Double pctCumprido, List<Book> books, List<Disciplina> classes) {
			this.course = course;
			this.name = name;
			this.code = code;
			this.price = price;
			this.CHTotal = CHTotal;
			this.pctCumprido = pctCumprido;
			this.books = books;
			this.classes = classes;
			
			
			
		}

		private void restore() {
			this.course.setName(name); 
			this.course.setCode(code);
			this.course.setPrice(price);
			this.course.setCHTotal(CHTotal);
			//this.course.setPctCumprido();
			this.course.books = new ArrayList<Book>(this.books);
			this.course.classes = new ArrayList<Disciplina>(this.classes);
			
		}
	}
	
	
	//q2
	
	public void attachStateChangedObserver(ObserverIF observer) {
		this.observers.add(observer); 
	}
	
	public void detachStateChangedObserver(ObserverIF observer) {
		this.observers.remove(observer); 
	}
	
	public void notifyObserver(String msm) {
		for(ObserverIF observer : this.observers)
			observer.update(msm);//nao passa parametro
	}
	
	


}
