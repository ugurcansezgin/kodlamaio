package kodlamaioLayered.business;

import java.util.ArrayList;

import kodlamaioLayered.entities.Course;

public class MainManager {
	
	private Course course;
	ArrayList<String> courses = new ArrayList<>();
	ArrayList<String> categories = new ArrayList<>();
	
	//Kurs adı sorgulama işlemi 
	public void isThereCourse(String course) throws Exception {
		
		for(int i = 0; i < courses.size(); i++) {
			
			if(courses.get(i) == course) {
				
				throw new Exception("\nBu isimde bir kurs zaten bulunmakta.!");
			}
		}
		
		courses.add(course);
	}
	
	//Kategori adı sorgulama işlemi
	public void isThereCategories(String category) throws Exception {
		
		for(int i = 0; i < categories.size(); i++) {
			
			if(categories.get(i) == category) {
				
				throw new Exception ("\nBu isimde kategori zaten bulunmakta.! ");
			}
		}
		
		categories.add(category);
	}
	
	//Kurs ücretinin kontrol edilmesi
	public void priceControl(double coursePrice) throws Exception {
		
		if(coursePrice < 0) {
			
			throw new Exception ("\nKurs ücreti 0'dan yüksek olmalı.!");
		}
	}

}
