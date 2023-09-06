package Com.Collection;

import java.util.Scanner;


public class RotateArray {
	public void element(int arr[],int x,int k)
	{
		//if k greater than size 
		k=k%x;
		for(int i=0;i<x;i++)
		{
		  if(i<k)
		    {
			  System.out.println(arr[x+i-k]);
		    }
		 else
		    {
			
			  System.out.println(arr[i-k]);
			  
		    }
		}
		
	}
	public static void main(String[] args) {
		RotateArray obj=new RotateArray();
		try {
		System.out.println("Enter how many elements you want to store ");
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		if(n==0)
		{
			System.out.println("Array size zero we can't do any operation ");
		}
		else {
		    int arr[]=new int [n];
		    System.out.println("Enter "+n+" Elements ");
	       	for(int i=0;i<n;i++)
		      {
			    arr[i]=sc.nextInt();
		      }
	       	int x=arr.length;
	       	
	       	System.out.println("Enter rotation number ");
	       	int k=sc.nextInt();
		
		       obj.element(arr,x,k);
		       sc.close();
	       	
		     }
		}
		catch(NumberFormatException e)
		{
			System.out.println("Don't enter special character ");
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Don't enter negative size ");
		}
		
	}

}
