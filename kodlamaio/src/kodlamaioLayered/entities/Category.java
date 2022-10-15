package kodlamaioLayered.entities;

public class Category {
	
	public Category(String categoryName, int desk) {
		
		this.categoryName = categoryName;
	}
	
	private String categoryName;
	
	public String getCategoryName() {
		
		return categoryName;
	}
	
	public void setcategoryName(String categoryName) {
		
		this.categoryName = categoryName;
	}

}
