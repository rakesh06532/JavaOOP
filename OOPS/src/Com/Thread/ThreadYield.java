package Com.Thread;

public class ThreadYield extends Thread {
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			Thread.yield();
			System.out.println("run "+i);
		}
	}
	public void checkTry()
	{
		try
		{
			System.out.println(10/1);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception ");
		}
		System.out.println("After exception ");
	}
	public static int m1()
	{
		
		try
		{
			System.out.println(10/1);
			return 999;
		}
		catch(Exception e)
		{
			System.out.println("Exception ");
			return 888;
		}
		finally
		{
			System.out.println("Finally");
			System.out.println("Hi");
		}
	}
	public static void main(String[] args) {
		ThreadYield obj=new ThreadYield();
		obj.start();
		//obj.checkTry();
		System.out.println(m1());
		for(int i=1;i<=10;i++)
		{
			System.out.println("main "+i);
		}
	}

}
