package session2.tamrin2;

public class MainForShape {

	public static void main(String[] args) {
		
		Circle[] circles = {new Circle(2),
			                new Circle(4),
		    	            new Circle(8)};
		
		Square[] squares = {new Square(4),
	                        new Square(4),
		                    new Square(4)};
		
		Rectangle[] rectangles = {new Rectangle(4, 8),
                                  new Rectangle(2, 7),
                                  new Rectangle(5, 4)};

		// total of areas for circle, rectangle and square
		double total_area_circles = Utils.sumOfArea(circles);
		System.out.println("total area of circles:" + total_area_circles);
		
		double total_area_rectangles = Utils.sumOfArea(rectangles);
		System.out.println("total area of rectangles:" + total_area_rectangles);
		
		double total_area_squares = Utils.sumOfArea(squares);
		System.out.println("total area of squares:" + total_area_squares);
		
		
		// total of circumference for circle, rectangle and square
		double total_circumference_circles = Utils.sumOfCircumference(circles);
		System.out.println("total circumference of circles:" + total_circumference_circles);
		
		double total_circumference_rectangles = Utils.sumOfCircumference(rectangles);
		System.out.println("total circumference of rectangles:" + total_circumference_rectangles);
		
		double total_circumference_squares = Utils.sumOfCircumference(squares);
		System.out.println("total circumference of squares:" + total_circumference_squares);
	}

}
