package OuterClassDemo;

public class OuterClass {
	static int a;
	public void meth()
	{
		System.out.println("Outer class meth ");
	}
	static
	{
		System.out.println("Outer class static block");
	}
	{
		System.out.println("Outer class instance block");
	}
	OuterClass()
	{
		System.out.println("Outer class construcor ");
	}
	 class InnerClass {
		 
		static int x=100;
		public void meth2()
		{
			System.out.println("Inner class meth");
		}
		public void meth()
		{
			System.out.println(a);
			System.out.println("Innter class ");
			
		}
		static
		{
			System.out.println("Inner class static block");
		}
		{
			System.out.println("Inner lass instance block");
		}
		InnerClass()
		{
			System.out.println("Inner class constructor ");
		}
		
	}
	
	public static void main(String[] args) {
		OuterClass.InnerClass obj=new OuterClass().new InnerClass();
		obj.meth();
		OuterClass obj2=new OuterClass();
		obj2.meth();
		obj.meth2();
		
	}

}
