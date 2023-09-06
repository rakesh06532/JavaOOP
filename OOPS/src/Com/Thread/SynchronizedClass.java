package Com.Thread;

public class SynchronizedClass extends Thread {
	@Override
	public void run()
	{
		CriticalResource();    }
		
			synchronized void CriticalResource()
			{
				String name=Thread.currentThread().getName();
				int Priority=Thread.currentThread().getPriority();
				System.out.println(name+"has entered criticalResource ");
				for(int i=1;i<=5;i++)
				{
					System.out.println(name+"("+Priority+")"+"count"+i);
				}
				System.out.println(name+"excution");
			}
			public static void main(String[] args) {
				SynchronizedClass obj=new SynchronizedClass();
				Thread t1=new Thread(obj);
				Thread t2=new Thread(obj);
				t1.setName("Tom_Thread ");
				t2.setName("Jerry ");
				t1.start();
				t2.start();
				
			}
			
}