package Com.Thread;

public class ThreadInterrupt extends Thread {
	public void run()
	{
		System.out.println("I am ready ");
		for(int i=1;i<=5;i++)
		{
			System.out.println("This is my first time "+i);
			Thread.yield();
		}
		System.out.println("Now i can relax ");
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("I am disturbing ");
		}
		System.out.println("You need to ready ");
	}
	public static void main(String[] args) {
		ThreadInterrupt obj=new ThreadInterrupt();
		Thread t=new Thread(obj);
		t.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("main "+i);
		}
		t.interrupt();
	}

}
