package Inheritance;

public class InheDemo 
{
	public static void main(String[] args)
	{
		Square square = new Square();
		
		// Demonstrating the square functionality
		square.setSide(4);
		System.out.println("Square: ");
		square.printArea();
		square.printParameter();
		
		// Using the same object to demonstrate the rectangle personality
		square.setDimensions(4,5);
		System.out.println("\nRectangle: ");
		square.printArea();
		square.printParameter();
	}
}
