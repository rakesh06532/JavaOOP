package Com.Collection;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;

/*
 Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting 
array in sorted order
Method Name            	getSorted 
Method Description 	Return the resulting array after reversing the numbers and sorting it 
Argument 	        int [] 
Return Type            	int 

Logic 	
---------
Accept and integer array, reverse the numbers in the array, sort it and return the resulting array. 
Hint :
1. Convert the numbers to String to reverse it 
2. Use Collection APIs to sort it 
Ex: {12,23,96,45} 
Step 1: Reverse numbers {21,32,69,54} 
Step2: Sort it {21,32,54,69} 
Hint: Use String to reverse number 
To sort it, Convert array to ArrayList and use Collections.sort 
 
 */
public class ReverseArray {
	public void getSorted(int []array )
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<array.length;i++)
		{
			int rev=0,r;
			while(array[i]!=0)
			{
				r=array[i]%10;
				rev=rev*10+r;
				array[i]=array[i]/10;
			}
			al.add(rev);
		}
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
	}
	
	public static void main(String[] args) {
		int array[]= {12,23,96,15};
		ReverseArray obj=new ReverseArray();
		//ArrayList<Integer> al=new ArrayList<Integer>(array);
		obj.getSorted(array);
		
	}

}
