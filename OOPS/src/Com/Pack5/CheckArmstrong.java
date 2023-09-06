package Com.Pack5;

import java.util.Scanner;

public class CheckArmstrong  {
	public void meth(int num)
	{
		int length;
		length=order(num);
		if(armstrong(num,length))
		System.out.println(num+" Armstrong");
		else
			System.out.println(num+" Not armstrong");
		
	}
	public int order(int x)
	{
		int c=0;
		while(x!=0)
		{
		  x=x/10;
		  c++;
		  
		}
		return c;
	}
	public boolean armstrong(int num,int length)
	{
		int temp=num,sum=0,rem;
		while(temp!=0)
		{
			rem=temp%10;
			sum=sum+(int)Math.pow(rem,length);
			temp/=10;
		}
		return num==sum;
	}
  
	public static void main(String[] args) {
		CheckArmstrong obj=new CheckArmstrong();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no for check is it armstrong no ");
		int num=sc.nextInt();
		obj.meth(num);
		sc.close();
		
	}

}
