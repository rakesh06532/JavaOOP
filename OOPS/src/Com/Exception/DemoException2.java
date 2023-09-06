package Com.Exception;

import java.util.Scanner;

@SuppressWarnings("serial")
public class DemoException2 extends Exception {
	
	public DemoException2(String msg)
	{
		super(msg);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter roll Number");
		int rollNumber=sc.nextInt();
		if(rollNumber<1000)
		{
			DemoException2 ob=new DemoException2("Enter roll number greater than 1000");sc.close();
			throw ob;
		}
		else
		
			System.out.println("Roll Number is : "+rollNumber);
		
		}
		catch(DemoException2 ob)
		{
			System.out.println(ob.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Enter string only");
		}
		sc.close();
	}

}
