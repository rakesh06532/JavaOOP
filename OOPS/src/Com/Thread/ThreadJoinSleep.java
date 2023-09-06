package Com.Thread;

public class ThreadJoinSleep extends Thread {
	
	public void run()
	{
		
		for(int i=1;i<=10;i++)
		{
		
			System.out.println("Hi "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadJoinSleep obj=new ThreadJoinSleep();
		obj.start();
		obj.join(10000);
		for(int i=10;i<=20;i++)
		{
			System.out.println("main "+i);
		}
	}

}
