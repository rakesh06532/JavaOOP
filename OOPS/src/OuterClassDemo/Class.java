package OuterClassDemo;

public class Class {
	int a=100;
	static int b=200;
	class InnerClass {
		public void m1()
		{
			System.out.println("Inner class method call "+a+" "+b);
			//m2();
			//m3();
		}
		private void m3()
		{
			System.out.println("inner class private method called");
		}
	}
	public void m2()
	{
		System.out.println("Outer class method call "+a+" "+b);
		InnerClass i=new InnerClass();
		i.m3();
		i.m1();
	}
	
	public static void main(String[] args) {
		Class.InnerClass ic=new Class().new InnerClass();
		ic.m1();
		Class c=new Class();
		c.m2();
		
	}

}
