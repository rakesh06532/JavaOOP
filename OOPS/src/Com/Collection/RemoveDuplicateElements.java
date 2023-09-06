package Com.Collection;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.List;

/* Remove duplicate elements from an array. */

public class RemoveDuplicateElements {
	public TreeSet<Integer> removeElement(List<Integer>arr)
	{
		TreeSet<Integer> ts=new TreeSet<Integer>(arr);
		ts.addAll(arr);
		System.out.println("After removing duplicate elements ");
		
		return ts;
	}
	public static void main(String[] args) {
		RemoveDuplicateElements obj=new RemoveDuplicateElements();
		try {
			
			System.out.println("Enter how much elements you want to store ");
			Scanner sc=new Scanner(System.in);
			
			int n=Integer.parseInt(sc.nextLine());
			if(n==0)
			{
				System.out.println("Array size is zero we cant do any operation ");
			}
			else 
			{
			    Integer []arr=new Integer [n];
			
			    System.out.println("Enter "+n+" elements ");
			    for(int i=0;i<n;i++)
			    {
				    arr[i]=sc.nextInt();
			    }
			    List<Integer> al=new ArrayList<Integer>(Arrays.asList(arr));
			    
			   TreeSet<Integer> result= obj.removeElement(al);
			    System.out.println(result);
			    sc.close();
			}
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Don't enter negative size of array ");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Don't enter special character ");
		}
		
		
	}

}
