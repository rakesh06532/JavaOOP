package Pack4;

import java.util.Scanner;

class Student {
	int StudentId;
	String name;
	double ExamFee;
	String displayDetails(String s,int a,double d)
	{
		StudentId=a;
		name=s;
		ExamFee=d;
		String s1=String.valueOf(StudentId);
		String s2=String.valueOf(ExamFee);
		return s+ s1 + s2;
	}
	
}
class DayScholar extends Student {
	double transportFee;
	DayScholar()
	{
		
	}
	DayScholar(double d2)
	{
		transportFee=d2;
	}
	
	double payFee(double d2,double d3)
	{
		transportFee=d2-d3;
		return transportFee;
	}
	
}
class Hosteller extends Student {
	double hostelFee;
	Hosteller()
	{
		
	}
	Hosteller(double d2)
	{
		hostelFee = d2;
	}
	double payFee(double d4,double d5)
	{
		hostelFee=d4-d5;
		return hostelFee;
	}
	
}
public class Tester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter student name : ");
		String s=sc.nextLine();
		System.out.print("Enter student Id : ");
		int a=sc.nextInt();
		System.out.print("Enter exam Fee : ");
		double d=sc.nextDouble();
		System.out.println();
		Student sobj=new Student();
		sobj.displayDetails(s, a, d);
		System.out.println("Student name : "+s);
		System.out.println("Student Id : "+a);
		System.out.println("Student Exam Fee : "+d);
		System.out.println("==========================================");
		
		System.out.print("Enter Transport Fee : ");
		double d2=sc.nextDouble();
		System.out.print("Enter filled transport Fee : ");
		double d3=sc.nextDouble();
		DayScholar dobj1=new DayScholar();
		double res=dobj1.payFee(d2,d3);
		System.out.println("Transport Fee remaining : "+res);
		System.out.println("==========================================");
		
		System.out.print("Enter Hostel Fee : ");
		double d4=sc.nextDouble();
		System.out.print("Enter filled hostel Fee : ");
		double d5=sc.nextDouble();
		Hosteller hobj=new Hosteller();
		double res2=hobj.payFee(d4, d5);
		System.out.println("Hostel Fee remaining : "+res2);
		sc.close();
	}

}
