package Pack1;
import java.util.Scanner;

public class IncreaseSalary {

	
	public double calculation()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp Id : ");
		int empId=sc.nextInt();
		System.out.println("Enter emp name : ");
		String empName=sc.next();
		System.out.println("Enter emp Department : ");
		String empDept=sc.next();
		System.out.println("Enter emp Salary : ");
		double empSal=sc.nextDouble();
		System.out.println("Enter emp Experience : ");
		int empExp=sc.nextInt();
		System.out.println("ID : "+empId);
		System.out.println("Name : "+empName);
		System.out.println("Department : "+empDept);
		System.out.println("Salary : "+empSal);
		sc.close();
		
		
		if(empExp<5) return empSal+empSal*0.05;
		else if(empExp<10) return empSal+empSal*0.15;
		 return empSal+empSal*0.30;
	}

}
