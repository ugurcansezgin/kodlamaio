package kodlamaioLayered.business;


import kodlamaioLayered.core.logging.Logger;
import kodlamaioLayered.dataAccess.InstructorDao;
import kodlamaioLayered.entities.Instructor;

public class InstructorManager {
	
	InstructorDao instructorDao;
	Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		
		instructorDao.add(instructor);
		
		for(Logger logger : loggers) {
			
			logger.log(instructor.getInstructorName());
		}
	}

}
