package Com.Thread;

public class ClassB implements Runnable {
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("run method "+i);
		}
	}
	public static void main(String[] args) {
		ClassB obj=new ClassB();
		Thread t1=new Thread(obj);
		t1.start();
		Thread t2=new Thread();
		t2.start();
		t2.run();
	}

}
