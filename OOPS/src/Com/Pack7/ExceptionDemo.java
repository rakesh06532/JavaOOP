package Com.Pack7;

import java.util.Scanner;
public class ExceptionDemo {
	public void meth()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(10);
		try {
			System.out.println("try block executed ");
			System.out.println("Please enter no ");
			System.out.println("===> "+20/sc.nextInt());
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch block executed ");
			e.printStackTrace();
			//e.getMessage();
			//e.toString();
		}
		finally
		{
			System.out.println("finally block executed ");
			sc.close();
		}
	}
	public static void main(String[] args) {
		new ExceptionDemo().meth();
	}

}
