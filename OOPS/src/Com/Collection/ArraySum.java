package Com.Collection;

import java.util.Scanner;

public class ArraySum {
	public void elements(int arr[],int n,int sum)
	{
		
	   for(int i=0;i<n;i++)
	   {
		   int currentSum=arr[i];
		   if(currentSum==sum)
		   {
			   System.out.println("Sum found in "+i+" index");
			   return;
		   }
		   else
		   {
			   for(int j=i+1;j<n;j++)
			   {
				   currentSum+=arr[j];
				   if(currentSum==sum)
				   {
					   System.out.println("Sum found between index "+i+" and "+j);
					   return;
				   }
			   }
		   }
		   
	   }
	   System.out.println("Not found subarray");
	   
	}
	public static void main(String[] args) {
		ArraySum obj=new ArraySum();
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements ");
		
		int arr[]=new int[Integer.parseInt(sc.nextLine())];
		int n=arr.length;
		if(n==0)
		{
			System.out.println("Array size 0 we can't do any operation ");
		}
		else
		{
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Search sum of elements ");
		int sum=sc.nextInt();
		obj.elements(arr, n, sum);
		sc.close();
		}
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Don't enter -ve size in array ");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Don't enter special character ");
		}
	}
	
	

}
