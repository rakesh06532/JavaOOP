package Pack4;

class X
{
	public static void m1()
	{
		System.out.println("Hi");
		X2.m2();
	}
}
class X2
{
	public static void m2()
	{
		System.out.println("Hello");
		X.m1();
	}
}


public class NestedMethod {
	
	
	public static void main(String[] args) {
		
			System.out.println("Hello main");
			X.m1();
		
		
	}

}
