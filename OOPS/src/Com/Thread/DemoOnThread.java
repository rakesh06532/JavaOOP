package Com.Thread;

public class DemoOnThread {
	public static void main(String[] args) {
		Thread1 obj=new Thread1();
		obj.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("main Thread : "+i);
		}
		
	}

}
