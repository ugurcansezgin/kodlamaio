package kodlamaioLayered;

import kodlamaioLayered.business.CategoryManager;
import kodlamaioLayered.business.CourseManager;
import kodlamaioLayered.core.logging.DatabaseLogger;
import kodlamaioLayered.core.logging.Logger;
import kodlamaioLayered.dataAccess.HibernateDao;
import kodlamaioLayered.dataAccess.JdbcDao;
import kodlamaioLayered.entities.Category;
import kodlamaioLayered.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Category category = new Category("Programlama", 1);
		Course course = new Course("Python", "Uğurcan Sezgin", 555);
		
		Logger[] loggers = { 
				new DatabaseLogger() };
		
		CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggers);
		CourseManager courseManager = new CourseManager(new JdbcDao(), loggers);
		
		categoryManager.add(category);
		courseManager.add(course);

	}

}
