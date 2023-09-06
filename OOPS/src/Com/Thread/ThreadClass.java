package Com.Thread;

public class ThreadClass extends Thread {
	public void run()
	{
		System.out.println("synchronize block ");
		
		synchronized (this) 
		{
			String name =Thread.currentThread().getName();
			int Priority=Thread.currentThread().getPriority();
			System.out.println(name+"critical ");
			for(int i=1;i<=5;i++)
			{
				System.out.println(name+Priority+" count "+i);
			}
			System.out.println(name+" excution completed ");
		}
	}
	public static void main(String[] args) {
		ThreadClass obj=new ThreadClass();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		t1.setName("First Thread ");
		t2.setName("Second Thread ");
		t1.start();
		t2.start();
	}

}
