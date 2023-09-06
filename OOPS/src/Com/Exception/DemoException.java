package Com.Exception;

import java.util.Scanner;

@SuppressWarnings("serial")
public class DemoException extends Exception {
	

	public DemoException(String msg)
	{
		super(msg);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		
		System.out.println("Enter student name");
		String studentName=sc.nextLine();
		System.out.println("Enter student branch");
		String studentBranch=sc.nextLine().toUpperCase();
		
		if(!(studentBranch.equals("CSE")||studentBranch.equals("ECE")||studentBranch.equals("EEE")))
		{
			DemoException ob=new DemoException("Enter valid branch");
		throw ob;
		}
		System.out.println("Enter student rollNumber");
		int rollNumber=sc.nextInt();
		
		System.out.println("Student Name "+studentName);
		System.out.println("Student Branch "+studentBranch);
		System.out.println("Student Roll Number "+rollNumber);
		}
		catch(DemoException ob)
		{
			System.out.println(ob.getMessage());
			
		}
		
		catch(Exception e)
		{
			System.out.println("Input valid details ");
		}
		finally
		{
			sc.close();
		}
		
	}

}
