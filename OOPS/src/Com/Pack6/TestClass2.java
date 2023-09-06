package Com.Pack6;

public class TestClass2 {
	public static void main(String[] args) {
		TestClass obj=new TestClass();
		obj.start();
		Thread.yield();
		for(int i=20;i<=40;i++)
		{
			System.out.println("TestClass2 "+i);
		}
	}

}
