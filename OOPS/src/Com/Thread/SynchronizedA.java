package Com.Thread;

public class SynchronizedA {
	public static void main(String[] args) {
		final String A="java ";
		final String B="Python ";
		Thread t1=new Thread()
		{
			@Override
			public void run()
			{
				synchronized (A) //Thread 1 is holding Java
				{
					System.out.println("Thread 1 locked on A ");
					try {
						Thread.sleep(2);
					}
					catch(Exception e) {
						e.printStackTrace();
					}
					synchronized (B) //Thread will be waiting for B(Python)
					{
						System.out.println("Thread 1 locked on B ");
					}
					System.out.println("No dead locke ");
				}
			}
		};
		Thread t2=new Thread()
				{
			public void run()
			{
				synchronized (B) //Thread 2 is holding Python
				{
					System.out.println("Thread 2 locked on B ");
					try {
						Thread.sleep(2);
					}
					catch(Exception e) {
						e.printStackTrace();
					}
					synchronized (A)//Thread will be waiting for A (Java)
					{
						System.out.println("Thread 2 locked on A ");
					}
				}
				System.out.println("No dead lock ");
			}
		};
		t1.start();
		t2.start();
	}

}
