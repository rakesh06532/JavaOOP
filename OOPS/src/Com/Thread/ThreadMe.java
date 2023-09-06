package Com.Thread;

public class ThreadMe extends Thread {
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hi "+i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadMe obj=new ThreadMe();
		obj.start();
		obj.join(1000);
		for(int i=11;i<=20;i++)
		{
			System.out.println("Hello "+i);
		}
	}

}
