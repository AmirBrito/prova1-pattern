package singleton;

import java.util.ArrayList;
import java.util.List;

import model.Course;

public class CoursePool {
	
	private static final CoursePool singleton = new CoursePool();

	private List<Course> catalogo;
	

	public static CoursePool getInstance() {
		return singleton;
	}


	private CoursePool() {
		super();
		System.out.println("Creating Course POOL");
		this.catalogo = new ArrayList<Course>();
		
		
	}


	public void setCourseCatalogo(Course course) {
		this.catalogo.add(course);
	
	}
	
	public Course getCourseCatalogo(String course) {
		Course curso = null;
		
		for(Course temp : this.catalogo) {
			if(temp.getName() == course) {
				curso = temp;
			}
		
		}
			return curso;
	}
	
	
}
