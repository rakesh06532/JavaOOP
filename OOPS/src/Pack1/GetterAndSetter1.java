package Pack1;
import java.util.Scanner;

public class GetterAndSetter1 {
	void display()
	{
		Scanner sc=new Scanner(System.in);
		GetterAndSetter2 obj=new GetterAndSetter2();
		System.out.println("Enter student roll no : ");
		//obj.studentRollNumber=sc.nextInt();
		obj.setStudentRollNumber(sc.nextInt());
		
		System.out.println("Enter student name : ");
		//obj.studentName=sc.next();
		obj.setStudentName(sc.next());
		
		//System.out.println("Student roll no : "+obj.studentRollNumber);
		System.out.println("Student roll no : "+obj.getStudentRollNumber());
		
		//System.out.println("Student name : "+obj.studentName);
		System.out.println("Student name : "+obj.getStudentName());
		sc.close();
	}
	public static void main(String[] args) {
		new GetterAndSetter1().display();
	}

}
