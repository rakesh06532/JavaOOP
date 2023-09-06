package Com.Collection;

/*
  A company used to keep the record of the employees in two different branches separately. There are some 
employees
who work in both the location. The company needs to keep track of the employee working in both the branches.
Write a method to accept the two lists containing the names of the employees working in the two branches. 
The method should find out the names of employees present in both the list and return the names as a sorted array

Method Name 	        getEmployees 
Method Description 	Get the names of employees working two different branches 
Argument 	        List branch1, List branch2 
Return Type 	        String [] 
Logic 	                Find the common names of the employees in both the lists
 */

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeSameName {
	public String[] getEmployees(ArrayList<String> branch1,ArrayList<String> branch2)
	{
		System.out.println("First Branch employees Name ");
		System.out.println(branch1);
		System.out.println("Second Branch employees Name ");
		System.out.println(branch2);
		branch1.retainAll(branch2);
		//System.out.println(branch1);
		String []s=new String[branch1.size()];;
		
		for(int i=0;i<branch1.size();i++)
		{
			 s[i]=(String) branch1.get(i);
		}
		return s;
	}
	
	public static void main(String[] args) {
		
		EmployeeSameName obj=new EmployeeSameName();
		ArrayList<String> branch1=new ArrayList<String>();
		ArrayList<String> branch2=new ArrayList<String>();
		
		branch1.add("Rakesh");
		branch1.add("Ramesh");
		branch1.add("Suhani");
		branch1.add("Prince");
		branch1.add("Ravi");
		branch1.add("Chandan");
		branch1.add("Aryan");
		branch1.add("Mohit");
		branch2.add("Aryan");
		branch2.add("Rakesh");
		branch2.add("Mohit");
		branch2.add("Sohani");
		branch2.add("Shiv");
		branch2.add("Prince");
		branch2.add("Arpit");
		branch2.add("Rahul");
		
		String[] result=obj.getEmployees(branch1,branch2);
		System.out.println("Common employees Name ");
		System.out.println(Arrays.toString(result));
		
		
	}

}
