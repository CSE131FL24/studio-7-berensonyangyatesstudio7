package studio7;

public class Die {

	private int Sides;

	public Die(int Sides) {
		this.Sides = Sides;
	}

	public int roll() {
		int roll = (int)(Math.random() * Sides) + 1;
		return roll;
	}
	
	public static void main(String[] args) {
		Die hello = new Die(6);
		System.out.println(hello.roll());

	}

}
