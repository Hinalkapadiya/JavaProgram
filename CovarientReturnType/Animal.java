package covarientReturnType;

public class Animal 
{
	public Animal makeSound()
	{
		System.out.println("Animal sound: ");
		return this;
	}
}
