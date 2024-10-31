package studio7;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle(double length, double width) { //constructor
		this.length = length;
		this.width = width;
		
	}
	
	public double area() {
		return this.length * this.width; 
	}
	
	public double perimeter() {
		return (this.length * 2) + (this.width * 2); 
	}
	
	
	public static void main(String[] args) {
		Rectangle fart = new Rectangle(4, 6);
		System.out.println(fart.area());
		System.out.print(fart.perimeter());

	}

}
