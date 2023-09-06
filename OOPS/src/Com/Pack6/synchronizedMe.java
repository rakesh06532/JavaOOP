package Com.Pack6;

public class synchronizedMe extends Thread {
	public void run()
	{
		System.out.println("implementing synchronized block ");
		synchronized(this)
		{
			String name=Thread.currentThread().getName();
			int priority=Thread.currentThread().getPriority();
			System.out.println(name+" critical ");
			for(int i=1;i<=5;i++)
			{
				System.out.println(name+" "+priority+" count "+i);
			}
			System.out.println(name+" Excution completed ");
		}
	}
	public static void main(String[] args) {
		synchronizedMe obj=new synchronizedMe();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		Thread t3=new Thread(obj);
		Thread t4=new Thread(obj);
		Thread t5=new Thread(obj);
		Thread t6=new Thread(obj);
		Thread t7=new Thread(obj);
		Thread t8=new Thread(obj);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
	}

}
