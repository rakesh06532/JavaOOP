package Com.Pack7;

public class ThrowsException {
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("I am going to sleep ");
		Thread.interrupted();
		Thread.sleep(5000);
		
		System.out.println("I slept hapily ");
	}

}
