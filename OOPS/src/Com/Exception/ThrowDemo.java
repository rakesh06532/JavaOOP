package Com.Exception;

public class ThrowDemo {
	public static void main(String[] args) {
		try
		{
			System.out.println(30/0);
		}
		catch (ArithmeticException e)
		{
			throw new NullPointerException();
			//e.printStackTrace();
		}
		
	}

}
