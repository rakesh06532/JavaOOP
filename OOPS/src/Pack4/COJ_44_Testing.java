package Pack4;


/* Create an interface COJ_44_AdvancedArithmetic 
which contains a method signature as:-
public abstract int divisorSum(int n). 

Then write a class called COJ_44_MyCalculator which implements the interface COJ_44_AdvancedArithmetic.

divisorSum function just takes an integer as input and return the sum of all its divisors. 
For example divisors of 6 are 1,2,3 and 6, so divisorSum should return 12. 

Sample Input
============
6

Sample Output
=============
12

Explanation
===========
Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12.

Note:
===== 
A class COJ_44_Testing is given to you with a main method. 
Use this class to test your solution's classes and methods.

*/
import java.util.Scanner;
 interface COJ_44_AdvancedArithmetic 
{
	public abstract int divisorSum(int n);
	
}
 class COJ_44_MyCalculator implements COJ_44_AdvancedArithmetic {
		public int divisorSum(int n) {
			int temp=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
					temp=temp+i;
			}
		
			return temp;
		}
 
 }
public class COJ_44_Testing {
	public static void main(String[] args) {
		COJ_44_MyCalculator obj=new COJ_44_MyCalculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number for check how many division of that number : ");
		int n=sc.nextInt();
		int res=obj.divisorSum(n);
		System.out.println(res);
		sc.close();
	}

}
