package session5;

import java.util.List;

import session5.model.Categories;
import session5.model.Product;
import session5.service.ProductService;
import session5.service.exception.ProductNotFoundException;

public class MainApp {

	public static void main(String[] args) {
		
        // name and category both are null
		try {
			List<Product> products = ProductService.showProduct(null, null);
			System.out.println(products);
		} catch (ProductNotFoundException e) {
			System.out.println(e);
		}
		
		System.out.println("--------------------------------------------------------------------");
		// category is null
		try {
			List<Product> products = ProductService.showProduct("jacket", null);
			System.out.println(products);
		} catch (ProductNotFoundException e) {
			System.out.println(e);
		}
		
		System.out.println("--------------------------------------------------------------------");
		// name is null
		try {
			List<Product> products = ProductService.showProduct(null, Categories.FOODANDGROCERY);
			System.out.println(products);
		} catch (ProductNotFoundException e) {
			System.out.println(e);
		}
		
		System.out.println("--------------------------------------------------------------------");
		// name is not in the list of products
		try {
			List<Product> products = ProductService.showProduct("bag", Categories.CLOTHES);
			System.out.println(products);
		} catch (ProductNotFoundException e) {
			System.out.println(e);
		}
		
		System.out.println("--------------------------------------------------------------------");
		List<Categories> category = ProductService.showAllCategories();
		System.out.println(category);

	}

}