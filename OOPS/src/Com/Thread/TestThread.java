package Com.Thread;

public class TestThread extends Thread {
	@Override
	public void run() 
	{
		try
		{
		for(int i=0;i<10;i++)
		{
			Thread.sleep(500);
		System.out.println("Override "+i);
		}
		}
		catch (Exception e)
		{
			
		}
	}
//	@Override
//	public void run()
//	{
//		for(int i=10;i<20;i++)
//		{
//			System.out.println(i);
//		}
//	}
//	@Override
//	public void run()
//	{
//		for(int i=20;i<30;i++)
//		{
//			System.out.println(i);
//		}
//	}
	public static void main(String[] args) throws Exception {
		TestThread t=new TestThread();
		TestThread t2=new TestThread();
		TestThread t3=new TestThread();
		t.start();
		t2.start();
		t2.join();
		t3.start();
	}

}
