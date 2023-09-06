package Com.Collection;

import java.util.TreeSet;

import java.util.Iterator;
import java.util.ArrayList;

/*
 
 Create a method which accepts an integer array and removes all the duplicates in the array. Return the resulting array
in descending order
Method Name 	        modifyArray 
Method Description 	Remove duplicates 
Argument 	        int [] 
Return Type 	        int [] 

Logic
---------- 	
Remove the duplicate elements in the array and sort it in descending order 
Hint: 
1. Use Collection API (TreeSet) to remove duplicates and sort the result in ascending order 
2. Create a new array, iterate through elements in TreeSet and add it in the reverse order 

 */

public class RemoveDuplicateElement {
	
	public void modifyArray(ArrayList<Integer> al)
	{
		System.out.println("Original Data \n"+al+"\n");
		TreeSet<Integer> ts=new TreeSet<Integer>(al);

		System.out.println("After removing duplicate Data \n"+ts);
		System.out.println();
		Iterator<Integer> i=ts.descendingIterator();
		System.out.println("After sorting the Data ");
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		
	}
	public static void main(String[] args) {
		RemoveDuplicateElement obj =new RemoveDuplicateElement();

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(100);
		al.add(18);
		al.add(15);
		al.add(18);
		al.add(52);
		obj.modifyArray(al);
	}

}
