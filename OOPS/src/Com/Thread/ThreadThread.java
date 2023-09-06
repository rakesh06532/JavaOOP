package Com.Thread;

public class ThreadThread {
	public static void main(String[] args) {
		Yield obj=new Yield();
		obj.start();
		
		for(int i=10;i<=20;i++)
		{
			System.out.println("Class B "+i);
			Thread.yield();
		}
	}

}
