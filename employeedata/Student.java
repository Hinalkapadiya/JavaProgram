package employeedata;

public class Student 
{

		 private String name;

		    // Default constructor
		    public Student() 
		    {
		        this.name = "Unknown";
		    }

		    // Parameterized constructor
		    public Student(String name) 
		    {
		        this.name = name;
		    }

		    // Getter for name
		    public String getName() 
		    {
		        return name;
		    }

		    public static void main(String[] args) 
		    {
		    	// Creating object without passing Name
		    	Student student1 = new Student();
		    	System.out.println("Student Name : "+ student1.getName());
		    	
		    	// Creating object with passing Name
		    	Student student2 = new Student("Hirva");
		    	System.out.println("Student Name : "+ student2.getName());
		    }
}

	


