package hierarch_EX;

public class Emp extends Person
{
	private String depart;

	public Emp(String name, String city,String depart) 
	{
		super(name, city);
		this.depart = depart;
		
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	@Override
	public String toString() {
		return "Emp [depart=" + depart + "]";
	}
	
}
