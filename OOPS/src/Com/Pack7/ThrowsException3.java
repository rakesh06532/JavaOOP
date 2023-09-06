package Com.Pack7;

import java.util.Scanner;
public class ThrowsException3 {
	static int balance=1000;
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter amount to widthdraw ");
		int n=sc.nextInt();
		try
		{
			if(balance<n)
			{
		extracted();
			}
			else
			{
				System.out.println("please take money "+n);
			}
		}
		catch(MinimumAccountBalance mab)
		{
			mab.printStackTrace();
		}
		sc.close();
		
	}
	private static void extracted() throws MinimumAccountBalance {
		throw new MinimumAccountBalance("Insufficient balance "+balance);
	}

}
