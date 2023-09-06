package Com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Emp {
		public void meth1()
		{
			ArrayList<EmployeeDetails> al=new ArrayList<EmployeeDetails>(); 
			EmployeeDetails obj1=new EmployeeDetails(50000,"Rakesh","java");
			EmployeeDetails obj2=new EmployeeDetails(40000,"Aryan","java");
			EmployeeDetails obj3=new EmployeeDetails(45000,"Prince","java");
			
			al.add(obj1);
			al.add(obj2);
			al.add(obj3);
			Iterator<EmployeeDetails> i=al.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			
		}
		public static void main(String[] args) {
			
			new Emp().meth1();
		}
	

}
