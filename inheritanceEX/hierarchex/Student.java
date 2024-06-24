package hierarch_EX;

public class Student extends Person 
{
	private String div;
	
	// Default Constructor
	public Student()
	{
		super(); // will call parent class default constructor
		System.out.println("I am Student");
	}
	
	// Parameterized Constructor
	public Student(String name,String city,String div) 
	{
		super(name,city);
		this.div = div;
	}
	
	public String getDiv() 
	{
		return div;
	}

	public void setDiv(String div) 
	{
		this.div = div;
	}

	@Override
	public String toString() {
		return "Student [div=" + div + "]";
	}	
}
