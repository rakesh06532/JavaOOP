package AnonymousInnerClass;

import java.util.*;
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Enter 1 for addition");
		System.out.println("Enter 2 for substraction");
		System.out.println("Enter 3 for divide");
		System.out.println("Enter 4 for multiplication");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1: 
			//Anonymous inner class
			IArithematic ad=new IArithematic()
			{
			public void calculation(int a,int b)
			{
				System.out.println(a+b);
			}
			};
			ad.calculation(a, b);
			break;
		case 2:
			//Anonymous inner class
			IArithematic sb=new IArithematic()
			{
				public void calculation(int a,int b)
				{
				System.out.println(a-b);	
				}
			};
			sb.calculation(a, b);
			
			break;
		case 3:
			//Anonymous inner class
			IArithematic div=new IArithematic()
			{
				public void calculation(int a,int b)
				{
				System.out.println(a/b);	
				}
			};
			div.calculation(a, b);
			break;
		case 4:
			//Anonymous inner class
			IArithematic mul=new IArithematic()
			{
				public void calculation(int a,int b)
				{
				System.out.println(a*b);	
				}
			};
			mul.calculation(a, b);
			break;
		}
		sc.close();
	}

}
