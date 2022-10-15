package kodlamaioLayered.business;

import kodlamaioLayered.core.logging.Logger;
import kodlamaioLayered.dataAccess.CategoryDao;
import kodlamaioLayered.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private MainManager manager = new MainManager();
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers1) {
		
		this.categoryDao = categoryDao;
		this.loggers = loggers1;
	}
	
	public void add(Category category) throws Exception {
		
		manager.isThereCategories(category.getCategoryName());
		categoryDao.add(category);
		
		for(Logger logger: loggers) {
			logger.log("\nKategori adı : " + category.getCategoryName());
		}
	}

}
