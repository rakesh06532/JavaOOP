package Com.Pack6;

public class DeamonDemo extends Thread {
	public void run()
	{
		int i=0;
		while(true)
		{
			i=i+1;
			System.out.println("Deamon : "+i);
		}
	}
	public static void main(String[] args) {
		DeamonDemo obj=new DeamonDemo();
		obj.setDaemon(true);
		obj.start();
		for(int i=1;i<=20;i++)
		{
			System.out.println("main : "+i);
			
		}
		System.out.println("End of main ");
	}

}
