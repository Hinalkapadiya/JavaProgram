package multicatchEx;

public class MultiCatchEx 
{

	public static void main(String[] args) 
	{
		try 
		{
			int[] a = new int[5];
			a[5] = 30 / 5 ; // will cause ArrayIndexOutOfBoundException
			System.out.println("Array element at index 5: " + a[5]);
		} 
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException caught: " + e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
		}

		// Another ArithmeticException
		try
		{
			int re = 30/0; // Arithmetic EXception
			System.out.println("Result: " + re );
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException caught: " + e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
		}
	}
}


