package OuterClassDemo;



public class LocalMethodClass {
	int a=10;
	static int b=20;
	final int c=30;
	public void m1()
	{
		System.out.println("Outer method call "+a+b+c);
		class Inner 
		{
			public void m2()
			{
				System.out.println("Inner method call "+a+b+c);
			}
			
		}
		new Inner().m2();
	}
	public static void main(String[] args) {
		
			LocalMethodClass l=new LocalMethodClass();
			l.m1();
		}
		
	}


