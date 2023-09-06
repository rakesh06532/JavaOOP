package Com.Thread;

public class MyThread extends Thread {
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
		System.out.println("Hi "+i);
		}
	}
	public static void main(String[] args) {
		MyThread obj=new MyThread();
		MyThread obj1=new MyThread();
		MyThread obj2=new MyThread();
		obj.start();
		obj1.start();
		obj2.start();
		//obj.run();
	}

}
