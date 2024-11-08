package session2.tamrin2;

public class Rectangle implements Shape{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
    @Override
	public double area() {
		return length*width;
	}
    
    @Override
	public double circumference() {
		return (length+width)*2;
	}
}
