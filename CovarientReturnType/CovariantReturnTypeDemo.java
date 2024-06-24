package covarientReturnType;

public class CovariantReturnTypeDemo 
{

	public static void main(String[] args) 
	{
		Animal al = new Animal();
		al.makeSound();
		
		Dog dg = new Dog();
		dg.makeSound();
		
		// Demonstrate polymorphism with covariant return Type
		Animal anotherAnimal = new Dog();
		anotherAnimal.makeSound(); // IT will call the Dog's makeSound method due to polymorphism
	}
}
