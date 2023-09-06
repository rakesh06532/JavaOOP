package Com.Exception;

import java.util.Scanner;

@SuppressWarnings("serial")
public class UserDefineException extends RuntimeException {
	public UserDefineException(String msg)
	{
		super(msg);
	}
	static double currentBalance=100;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to widthdrow ");
		int n=sc.nextInt();
		try {
		if(currentBalance<n)
		{
			UserDefineException ob= new UserDefineException("Insufficient Balance "+currentBalance);
			throw ob;
		}
		else
		
			System.out.println("Please take money "+n);
		
		}
		catch (UserDefineException ob)
		{
			System.out.println(ob.getMessage());
		}
		catch (Exception e)
		{
           System.out.println("Please enter valid amount");
		}
		finally
		{
		sc.close();
		}
	}

}
