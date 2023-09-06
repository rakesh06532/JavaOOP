package Com.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("serial")
public class DemoException1 extends Exception {
	
	public DemoException1(String msg)
	{
		super(msg);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter employee bSal ");
			int bSal=sc.nextInt();//Exception for non-Integer value
			if(bSal<12000)//Exception
			{
				DemoException1 ob=new DemoException1("Invalid bSal...");
			throw ob;//Throwing object onto catch block.
			}
			
			if(bSal>=12000)
			{
				float totSal=bSal+(bSal*0.78F)+(bSal*0.85F);
				System.out.println("Basic Salary "+bSal); 
				System.out.println("Total Salary "+totSal);
			}//end if condition.
			
		}//end try block.
		catch(InputMismatchException e)
		{
			System.out.println("Please enter only Integer");
		}
		catch(DemoException1 ob)
		{
			System.out.println(ob.getMessage());
		}
		finally
		{
		sc.close();
		}
	}

}
