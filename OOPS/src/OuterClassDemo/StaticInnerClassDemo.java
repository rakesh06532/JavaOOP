package OuterClassDemo;

public class StaticInnerClassDemo {
	int a=100;
	static int b=200;
	static class InnerClass
	{
		static int c=200;
		void meth()
		{
			
			System.out.println("Outer class instance variable "+new StaticInnerClassDemo().a);
			System.out.println("Outer class static variable "+b);
		}
		InnerClass()
		{
			System.out.println("InnerClass constructor ");
		}
		static
		{
			System.out.println("Inner class static block");
		}
		{
			System.out.println("Inner class instance block");
		}
		public static void main(String[] args) {
			new InnerClass().meth();
		}
	}
	StaticInnerClassDemo()
	{
		
		System.out.println("Outer class constructor ");
	}
	{
		System.out.println("Outer class instance block");
	}
	static 
	{
		System.out.println("Outer class static block");
	}
	public static void main(String[] args) {
		System.out.println("Java is awesome");
		StaticInnerClassDemo.InnerClass obj=new StaticInnerClassDemo. InnerClass();
		obj.meth();
		
	}

}
