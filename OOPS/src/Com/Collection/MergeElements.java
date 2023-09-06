package Com.Collection;

import java.util.ArrayList;
import java.util.Collections;

/*
 
 Create a method which accepts two Arraylist containing characters. Merge both arrays lists, sort the elements in the 
resulting list and return the resulting array.
Method Name 	        mergeData 
Method Description 	Merge two arraylist , sort it and return the result as an integer array. 
Argument 	        List, List 
Return Type 	        char[] 

Logic:	  
Merge both arrays lists, sort the elements in the resulting list and return it as a char array. 
 */
public class MergeElements {
	public void mergeData(ArrayList<Integer>al1 , ArrayList<Integer>al2)
	{
		al1.addAll(al2);
		System.out.println("Added all elements "+al1);
		Collections.sort(al1);
		System.out.println("Sorted all elements "+al1);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> al1=new ArrayList<>();
		al1.add(10);
		al1.add(12);
		al1.add(58);
		al1.add(45);
		al1.add(36);
		ArrayList<Integer> al2=new ArrayList<>();
		al2.add(87);
		al2.add(21);
		al2.add(35);
		al2.add(55);
		al2.add(25);
		System.out.println(al1);
		
		MergeElements obj=new MergeElements();
		obj.mergeData(al1, al2);
		
	}

}
