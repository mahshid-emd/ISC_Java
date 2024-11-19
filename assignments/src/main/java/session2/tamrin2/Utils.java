package session2.tamrin2;

public class Utils {
	
	public static<T extends Shape> double sumOfArea(T[] shapes) {
		double total_area = 0;
		for(T shape : shapes) {
			total_area += shape.area();
		}
		return total_area;
	}
	
	public static<T extends Shape> double sumOfCircumference(T[] shapes) {
		double total_circumference = 0;
		for(T shape : shapes) {
			total_circumference += shape.circumference();
		}
		return total_circumference;
	}

}
