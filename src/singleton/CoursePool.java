package singleton;

import java.util.HashMap;

import model.Course;

public class CoursePool {
	
	private static final CoursePool singleton = new CoursePool();

	HashMap<String, Course> catalogo = new HashMap<>();

	public static CoursePool getInstance() {
		return singleton;
	}

	private CoursePool() {
		System.out.println("Creating Course POOL");
		this.catalogo = new HashMap<String, Course>();
		
	}
	
	public void setCourseCatalogo(String name, Course course) {
		this.catalogo.put(name, course);
	
	}
	
	public Course getCourseCatalogo(String course) {
		
		return catalogo.get(course);
	}

	@Override
	public String toString() {
		return "CoursePool [catalogo=" + catalogo + "]";
	}	
	
}
