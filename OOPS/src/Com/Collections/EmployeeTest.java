package Com.Collections;

import java.util.stream.Stream;
import java.util.ArrayList;

public class EmployeeTest {
	public void meth()
	{
		ArrayList<Employee> al=new ArrayList<Employee>();
		Employee obj=new Employee("Rakesh", 26, 30000);
		Employee obj1=new Employee("Rahul", 25, 25000);
		Employee obj2=new Employee("Aryan", 5, 15000);
		Employee obj3=new Employee("Prince", 7, 10000);
		
		al.add(obj);
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		System.out.println(al);
		System.out.println();
		Stream<Employee> s1=al.stream();
		s1.forEach(d->System.out.println(d));
		System.out.println();
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
			
			Employee data=al.get(i);
			
			System.out.println(data.getName()+" "+data.getAge()+" "+data.getSal());
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		
		EmployeeTest obj1=new EmployeeTest();
		obj1.meth();
	}

}
