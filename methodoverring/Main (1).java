package methodOverriding;

public class Main {

	public static void main(String[] args) 
	{
		Child ch = new Child();
		ch.sayHello("Hey There!!");
		
		Parent pr = new Parent();
		pr.sayHello("Have a Good Day!!");
		
	}

}
