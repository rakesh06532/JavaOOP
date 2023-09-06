package Com.Thread2;

public class ThreadDemo extends Thread {
	private String FirstName;
	private String SecondName;
	private long aWhile;
	
	ThreadDemo(String fName,String sName,long a)
	{
		this.FirstName=fName;
		this.SecondName=sName;
		this.aWhile=a;
		setDaemon(true);
	}
	public void run()
	{
		try {
			while(true) {
				System.out.println(FirstName);
				sleep(aWhile);
				System.out.println(SecondName+"\n");
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(FirstName+SecondName+e);
		}
		
	}
	
}
