package Com.Pack6;

public class TestClass extends Thread {
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println("TestClass "+i);
		}
	}

}
