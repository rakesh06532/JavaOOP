package Com.Pack6;

public class synch extends Thread {
	
	@Override
	public synchronized void run()
	{
		try {
			
			for(int i=1;i<=10;i++)
			{
				System.out.println("meth called "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("I got exception ");
			e.printStackTrace();
		}
		
	}
	
	public void meth()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		synch obj=new synch();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		Thread t3=new Thread(obj);
		Thread t4=new Thread(obj);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		obj.meth();
	}

}
