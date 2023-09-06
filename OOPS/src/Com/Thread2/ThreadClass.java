package Com.Thread2;

public class ThreadClass extends Thread {
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread class "+i);
			if(i==5)
				try {
				sleep(2000);
				} catch (InterruptedException e) 
			{
					e.printStackTrace();
				}
			
		}
	}
	public static void main(String[] args) {
		ThreadClass obj=new ThreadClass();
		obj.start();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		t1.start();
		t2.start();
	}

}
