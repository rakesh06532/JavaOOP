package Com.Thread;

public class Thread1 extends Thread {
	@Override
	public void run()
	{
		for(int i=6;i<=10;i++)
		{
			System.out.println("Child Class : "+i);
		}
	}
//	public void start()
//	{
//		for(int i=1;i<=5;i++)
//		{
//			System.out.println("Hi "+i);
//		}
//	}

}
