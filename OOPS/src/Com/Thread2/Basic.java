package Com.Thread2;



public class Basic extends Thread {
	@Override
	public void run()
	{
		String name=Thread.currentThread().getName();
		int priority=Thread.currentThread().getPriority();
		for(int i=1;i<=5;i++)
		{
		System.out.println(name+priority + " run() excuted "+i);
		}
		
	}
public static void main(String[] args) {
	Basic obj=new Basic();
	Thread t1=new Thread(obj);
	Thread t2=new Thread(obj);
	
	t1.setName("First Thread");
	t2.setName("Second Thread");
	
	t1.setPriority(MIN_PRIORITY);
	t2.setPriority(3);
	
	t1.start();
	t2.start();
}
}
