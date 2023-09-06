package Com.Exception;

import java.util.Scanner;

@SuppressWarnings("serial")
class OldAgeException extends RuntimeException {
	public OldAgeException(String msg)
	{
		super(msg);
	}
	
}
@SuppressWarnings("serial")
class SmallAgeException extends RuntimeException {
	public SmallAgeException(String msg)
	{
		super(msg);
	}
	
}
public class CheckAgeException  {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person age : ");
		
		try {
			int age=sc.nextInt();
		if(age<18)
		{
			SmallAgeException sae=new SmallAgeException("You need to wait some years ");
			throw sae;
		}
		else if(age>60)
		{
			OldAgeException oae=new OldAgeException("Sorry You don't have enough time ");
			throw oae;
		}
		else
			System.out.println("Congratulations you will get Beautiful Girl ");
		}
		catch(SmallAgeException sae)
		{
			System.out.println(sae.getMessage());
		}
		catch(OldAgeException oae)
		{
			System.out.println(oae.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Please enter valid age... ");
		}
		finally {
			sc.close();
		}
	}

}
