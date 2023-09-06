package OuterClassDemo;

public class StaticOuter {
	public void m2()
	{
		System.out.println(a);
	}
	StaticOuter()
	{
		System.out.println("Outer class constructor");
	}
	{
		System.out.println("Outer class instance block");
	}
	static
	{
		System.out.println("Outer class static block");
	}
	int a=10;
	static int b=20;
	final int c=30;
	static class InnerStatic
	{
		
		public void m1()
		{
			System.out.println("Inner class method "+b);
		}
		InnerStatic()
		{
			System.out.println("Inner class constructor"); 
		}
		{
			System.out.println("Inner class instance block");
		}
		static
		{
			System.out.println("Outer class static block ");
		}
		public static void main(String[] args) {
			new StaticOuter().m2();
		}
		
	}
	public static void main(String[] args) {
		StaticOuter.InnerStatic i=new StaticOuter.InnerStatic();
		i.m1();
	}

}
