package Com.Pack6;

public class ThreadClass extends Thread {
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Child class ");
		}
	}
	public static void main(String[] args) {
		Thread obj=new Thread()
				{
			public synchronized void run()
			{
				for(int i=1;i<=10;i++)
				{
					System.out.println("override ");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
				};
		obj.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("parent class ");
			//System.out.println(obj.getClass().getName());
		}
		
	}

}
