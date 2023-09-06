package Com.Thread;

 public class Yield extends Thread {
	 
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Class A "+i);
		}
	}

}


