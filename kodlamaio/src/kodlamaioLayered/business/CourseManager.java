package kodlamaioLayered.business;



import kodlamaioLayered.core.logging.Logger;
import kodlamaioLayered.dataAccess.CourseDao;
import kodlamaioLayered.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger[] loggers;
	private MainManager manager = new MainManager();
	
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		
		manager.isThereCourse(course.getCourseName());
		manager.priceControl(course.getCoursePrice());
		courseDao.add(course);
		
		for(Logger logger : loggers) {
			
			logger.log("\nKurs Adı : " + course.getCourseName());
			logger.log("\nKurs Ücreti : " + course.getCoursePrice());
		}
	}

}
