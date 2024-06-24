package covarientReturnType;

public class Dog extends Animal
{
	@Override
	public Dog makeSound()
	{
		System.out.println("wooo wooo");
		return this;
	}
}
