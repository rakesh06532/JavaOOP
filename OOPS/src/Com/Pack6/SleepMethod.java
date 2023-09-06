package Com.Pack6;

public class SleepMethod extends Thread {
	public void run()
	{
		System.out.println("I am ready for interview ");
		for(int i=1;i<=10;i++)
		{
			System.out.println("This is my "+i+" interview ");
		}
		System.out.println("I got placed now i can relax ");
		try {
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("my sleep got disturb ");
		}
		System.out.println("Time to go to office ");
	}
	public void rightAngleTraingle()
	{
		int num1=5,num2=5;
		for(int i=1;i<=num1;i++)
		{
			for(int j=1;j<=num2;j++)
			{
				if(i==num1 || i==j || j==1 )
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		SleepMethod obj=new SleepMethod();
		Thread t1=new Thread(obj);
		t1.start();
		//t1.interrupt();
		obj.rightAngleTraingle();
	}

}
