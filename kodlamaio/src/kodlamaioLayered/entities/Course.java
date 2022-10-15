package kodlamaioLayered.entities;

public class Course {
	
	public Course(String courseName, String instructorName, double coursePrice) {
		
		this.courseName = courseName;
		this.instructorName = instructorName;
		this.coursePrice = coursePrice;
	}
	
	private String courseName;
	private String instructorName;
	private double coursePrice;
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public double getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	

}
