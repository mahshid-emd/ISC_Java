package session2.tamrin2;

public class Square implements Shape {
	private double length_square;

	public Square(double length_square) {
		this.length_square = length_square;
	}
	
    @Override
	public double area() {
		return length_square*length_square ;
	}
    
    @Override
	public double circumference() {
		return length_square*4;
	}

}
