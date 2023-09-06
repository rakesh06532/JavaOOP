package Pack1;

/*
Create a abstract class COJ_18_Student with the following attributes.


studentName: protected String
studentClass: protected String
totalNoOfStudents : protected static int

Instance Methods:
abstract public : getPercentage( ) with return type int 

static Method :
public static int getTotalNoStudents( )

Constructors:
Default constructor is a MUST.
Parameter constructor must initialize name and class and it also increase totalNoOfStudents.

Create a class COJ_18_ScienceStudent that inherits from COJ_18_Student. 

Add the following attributes
Instance variables: physicsMarks: private int
chemistryMarks: private int
mathsMarks: private int

Methods:
Override, getPercentage() method to compute and return the percentage of marks(Max marks for a subject :100)

Create a class COJ_18_HistoryStudent that inherits from COJ_18_Student. 

Add the following attributes.

Instance variables: historyMarks: private int
civicsMarks: private int (Max Marks for a subject : 100)
Method:

Override getPercentage() method to computed and return the percentage of marks(Max marks for a subject :100)


Given a class COJ_18_StudentTester with main method, use this class to test your code.
Test all the three classes and the abstract method implementation with different inputs.
Instance Variables:
*/

import java.util.Scanner;

abstract class COJ_18_Student {
	
		protected String studentName;
		protected String studentClass;
		protected static int totalNoOfStudent;
		
		public abstract int getPercentage();
 	
		COJ_18_Student()
		{
			
		}
		COJ_18_Student(String studentName,String studentClass)
		{
			
		}

	}
 class COJ_18_ScienceStudent extends COJ_18_Student {
		private int physicsMarks;
		private int chemistryMarks;
		private int mathsMarks;
		
		public int getPhysicsMarks() {
			return physicsMarks;
		}

		public void setPhysicsMarks(int physicsMarks) {
			this.physicsMarks = physicsMarks;
		}

		public int getChemistryMarks() {
			return chemistryMarks;
		}

		public void setChemistryMarks(int chemistryMarks) {
			this.chemistryMarks = chemistryMarks;
		}

		public int getMathsMarks() {
			return mathsMarks;
		}

		public void setMathsMarks(int mathsMarks) {
			this.mathsMarks = mathsMarks;
		}
		
		public int getPercentage()
		{
			int total= mathsMarks+chemistryMarks+physicsMarks;
			return total/3;
		}

	}


 class COJ_18_HistoryStudent extends COJ_18_Student {
		private int historyMarks;
		private int civicsMarks;
		
		public int getHistoryMarks() {
			return historyMarks;
		}
        public void setHistoryMarks(int historyMarks) {
			this.historyMarks = historyMarks;
        }
		public int getCivicsMarks() {
			return civicsMarks;
		}
		public void setCivicsMarks(int civicsMarks) {
			this.civicsMarks = civicsMarks;
		}
		
		public int getPercentage()
		{
			int total=civicsMarks+historyMarks;
			return total/2;
		}

	}
 public class COJ_18_StudentTester {
	 
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			COJ_18_HistoryStudent hobj=new COJ_18_HistoryStudent();
			System.out.println("\t\t\"For Arts Students\" ");
			System.out.println();
			System.out.print("Enter Student name : ");
			String s=sc.nextLine();
			System.out.print("Enter Student Class : ");
			String c=sc.nextLine();
			System.out.println("==================================================");
			System.out.print("Enter history marks : ");
			hobj.setHistoryMarks(sc.nextInt());
			System.out.print("Enter civics Marks : ");
			hobj.setCivicsMarks(sc.nextInt());
			System.out.println("===================================================");
			System.out.println("Student name is : "+s);
			System.out.println("Student Class is : "+c);
			System.out.println("History marks is : "+hobj.getHistoryMarks());
			System.out.println("Civics marks is : "+hobj.getCivicsMarks());
			System.out.println("Total percentage of "+s+" is : "+hobj.getPercentage());
			System.out.println("===================================================");
			System.out.println("\t\t\"For Science Student\" ");
			System.out.println();
			
			COJ_18_ScienceStudent sobj=new COJ_18_ScienceStudent();
			System.out.print("Enter Student name : ");
			String s1=sc.next();
			System.out.print("Enter Student Class : ");
			String c1=sc.next();
			System.out.println("===================================================");
			System.out.print("Enter Physics marks : ");
			sobj.setPhysicsMarks(sc.nextInt());
			System.out.print("Enter Chemistry marks : ");
			sobj.setChemistryMarks(sc.nextInt());
			System.out.print("Enter Maths marks : ");
			sobj.setMathsMarks(sc.nextInt());
			System.out.println("=====================================================");
			System.out.println("Student Name is : "+s1);
			System.out.println("Student Class is : "+c1);
			System.out.println("Physics marks is : "+sobj.getPhysicsMarks());
			System.out.println("Chemistry Marks is : "+sobj.getChemistryMarks());
			System.out.println("Maths marks is : "+sobj.getMathsMarks());
			System.out.println("Total percentage of "+s1+" is : "+sobj.getPercentage());
			System.out.println("====================================================");
			sc.close();
			
		}
		
	}

	
