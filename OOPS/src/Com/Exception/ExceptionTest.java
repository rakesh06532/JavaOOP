package Com.Exception;

//import java.util.Scanner;
public class ExceptionTest {
	public void meth1()
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println(10);
		try {
			System.out.println("Enter number : ");
			System.out.println(20/sc.nextInt());
		}
			catch(Exception exc)
			{
			
				System.out.println("Please enter valid number ");
			}
			finally {
				System.out.println("finally block excuted ");
			}
			System.out.println(30);
			sc.close();
			
		
	}
	public static void main(String[] args) {
		ExceptionTest obj=new ExceptionTest();
		obj.meth1();
	}

}
