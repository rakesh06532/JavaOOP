package Com.Thread;

public class ThreadJoin extends Thread {
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread : "+i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadJoin obj=new ThreadJoin();
		obj.start();
		obj.join();
		for(int i=1;i<=5;i++)
		{
			System.out.println("main "+i);
		}
	}

}


