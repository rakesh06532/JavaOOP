package Com.Pack5;

//import java.util.ArrayList;
public class Student {
	String name;
	int roll;
	Student(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}
	public String toString()
	{
		return name+" "+roll;
	}
	public static void main(String[] args) {
		Student s1=new Student("Rakesh",12);
		Student s2=new Student("Aryan",120);
		System.out.println(s1);
		//System.out.println(s2.toString());
		System.out.println(s2);
//		ArrayList al=new ArrayList();
//		al.add("a");
//		al.add(5);
//		System.out.println(al);
		
	}

}
