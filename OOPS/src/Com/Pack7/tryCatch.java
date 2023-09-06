package Com.Pack7;

import java.util.Scanner;
import Pack1.*;

public class tryCatch extends ClassG {
	public void meth()
	{
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("tryCatch class entered ");
			System.out.println("Enter number ");
			System.out.println(10/sc.nextInt());
		}
		catch(Exception e)
		{
			System.out.println("I got exception ");
			//e.printStackTrace();
			sc.close();
		}
		
		
	}
	public static void main(String[] args) {
		tryCatch obj=new tryCatch();
		obj.meth();
	}

}
