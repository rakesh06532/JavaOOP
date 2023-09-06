package Com.Thread;

public class ClassA extends Thread {
	
	@Override 
	
	public void run()
	{
		String name=Thread.currentThread().getName();
		for(int i=1;i<=5;i++)
		{
			
			
		System.out.println(name+" run method excuted "+i);
		
		}
	}
	public void run(int i)
	{
		System.out.println("Parametrize method "+i);
	}
	public void start()
	{
		super.start();
		System.out.println("Override start method ");
	}
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		ClassA obj1=new ClassA();
		ClassA obj2=new ClassA();
		ClassA obj3=new ClassA();
		ClassA obj4=new ClassA();
		
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		obj2.stop();
		obj1.run(MAX_PRIORITY);
		
	}

}
