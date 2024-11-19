package session2.tamrin2;

public class Circle implements Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
    @Override
	public double area() {
		return radius*radius*3.14;
	}
    
    @Override
	public double circumference() {
		return radius*2*3.14;
	}

}
