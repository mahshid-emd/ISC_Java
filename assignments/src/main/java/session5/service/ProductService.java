package session5.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import session5.model.Categories;
import session5.model.Product;
import session5.service.exception.ProductNotFoundException;

public class ProductService {
	
	private static final Logger logger = Logger.getLogger(ProductService.class.getName());
	private static List<Product> products;
	static {
		Product apple = new Product("apple", Categories.FOODANDGROCERY, new BigDecimal(3), false);
		Product orange = new Product("orange", Categories.FOODANDGROCERY, new BigDecimal(3), false);
		Product laptop = new Product("laptop", Categories.DIGITAL, new BigDecimal(1000), true);
		Product camera = new Product("camera", Categories.DIGITAL, new BigDecimal(300), true);
		Product pots = new Product("pots", Categories.HOME, new BigDecimal(50), true);
		Product vacuum = new Product("vacuum", Categories.HOME, new BigDecimal(100), false);
		Product jacket = new Product("jacket", Categories.CLOTHES, new BigDecimal(80), true);
		Product shirt = new Product("shirt", Categories.CLOTHES, new BigDecimal(50), false);
		
		products = List.of(apple, orange, laptop, camera, pots, vacuum, jacket, shirt);
		
		logger.info("Product list initialized with " + products.size() + " products.");
	}
	
	
	public static List<Product> showProduct(String name, Categories category) throws ProductNotFoundException{
		
		logger.info("showProduct method called with name: " + name + " and category: " + category);
		
	    boolean nameExists = products.stream().anyMatch(p -> p.getName().equals(name));
        if (name != null && !nameExists) {
        	
        	logger.warning("Product with name: " + name + " not found.");
        	throw new ProductNotFoundException(name + " is not in the list of products.");
        } 
        
        	
    	if (name != null && category != null) {
			
    		return products.stream()
					       .filter(t -> t.getName().equals(name) && t.getCategory().equals(category))
					       .collect(Collectors.toList());
		}
		
		if (category != null) {
					
			return products.stream()
					       .filter(t -> t.getCategory().equals(category))
					       .collect(Collectors.toList());
		}
		
		if (name != null) {
			
			return products.stream()
					       .filter(t -> t.getName().equals(name))
					       .collect(Collectors.toList());
		} 
		
		return products;   	
	}
	
	public static List<Categories> showAllCategories(){
		
		logger.info("showAllCategories method called.");
		
		List<Categories> allCategories = products.stream()
                       .map(t -> t.getCategory())
                       .distinct()
                       .collect(Collectors.toList());
		
		logger.info("Found " + allCategories.size() + " unique categories.");
		return allCategories;
	}

}
