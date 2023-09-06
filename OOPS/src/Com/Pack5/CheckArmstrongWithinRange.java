package Com.Pack5;

import java.util.Scanner;

public class CheckArmstrongWithinRange {
	public void checkNumber(int low, int high)
	{
		int length=0,temp=0;
		for(int sum=low;sum<=high;sum++)
		{
			int num=0;
			 length=order(sum);
			temp=sum; int rem=0;
			
			while(temp!=0)
			{
			rem=temp%10;
		    num=num+(int)Math.pow(rem,length);
				temp=temp/10;
			}
			if(num==sum)
				System.out.print(num+" ");
		
		}
		
	}
	public int order(int num)
	{
		int count=0;
		while(num!=0)
		{
			
			num=num/10;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		CheckArmstrongWithinRange obj=new CheckArmstrongWithinRange();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number to check is it armstrong no ");
		int low=sc.nextInt();
		System.out.println("Enter second number ");
		int high=sc.nextInt();
		obj.checkNumber(low,high);
		sc.close();
	}

}
