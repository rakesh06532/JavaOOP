package Com.Thread;

public class MyRunnable implements Runnable {
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) throws Exception {
		MyRunnable obj=new MyRunnable();
		Thread t=new Thread(obj);
		
		for(int i=10;i<20;i++)
		{
			System.out.println("Main "+i);
		}
		t.start();
		t.join();
	}

}
