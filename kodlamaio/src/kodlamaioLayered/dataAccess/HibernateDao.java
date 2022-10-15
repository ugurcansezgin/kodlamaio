package kodlamaioLayered.dataAccess;

import kodlamaioLayered.entities.Category;
import kodlamaioLayered.entities.Course;
import kodlamaioLayered.entities.Instructor;

public class HibernateDao implements CategoryDao, CourseDao, InstructorDao {

	@Override
	public void add(Category category) {
		
		System.out.println("Hibernate ile eklendi : Kategori");
	}
	
	@Override
	public void add(Course course) {
		
		System.out.println("Hibernate ile eklendi : Kurs");
	}
	
	@Override
	public void add(Instructor instructor) {
		
		System.out.println("Hibernate ile eklendi : Eğitmen");
	}
}
