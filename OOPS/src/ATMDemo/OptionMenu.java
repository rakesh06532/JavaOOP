package ATMDemo;

import java.util.Scanner;
import java.util.HashMap;

public class OptionMenu extends Account {
	Scanner sc=new Scanner(System.in);
	HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
	public void getLogin()
	{
		try
		{
			data.put(787822, 2222);
			data.put(787811, 1111);
			
			System.out.println("Welcome to ATM Project");
			System.out.println("Enter your Customer Number");
			
		}
		catch (Exception e)
		{
			System.out.println("Enter correct details ");
		}
	}

}
