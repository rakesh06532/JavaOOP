package Com.Pack6;

public class DeadLock {
	public static void main(String[] args) {
		final String A="Java";
		final String B="Python";
		Thread t1=new Thread()
				{
			public void run()
			{
				synchronized(A)//Thread 1 is Holding Java
				{
					System.out.println("Thread 1 locked on A ");
					try
					{
						Thread.sleep(100);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					synchronized(B)//Thread will be waiting for B(Python)
					{
						System.out.println("Thread 1 locked on B ");
					}
					System.out.println("no dead lock ");
				}
			}
				};
				Thread t2=new Thread()
						{
					public void run()
					{
						synchronized(B)//Thread 2 is holding python
						{
							System.out.println("Thead 2 locked on B ");
							try {
								Thread.sleep(100);
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
							synchronized(A)//Thread will be waiting for A(Java)
							{
								System.out.println("Thread 2 locked on A ");
							}
						}
					}
						};
						t1.start();
						t2.start();
	}

}
