package Pack1;

public class ClassP extends ClassO {
	void display()
	{
		System.out.println("Hi");
		super.meth4(1);
	}
	static int show(int a)
	{
		System.out.println(a+a);
		return a+a++;
	}
	static int meth()
	{
		System.out.println("Hello");
		return 10;
	}
	static
	{
		
		System.out.println("Java");
	}
	
	ClassP()
	{
		this(show(50));
		for(int i=1;;i++)
		{
			super.meth4(i);
			if(i==2)
				break;
		}
		System.out.println("Hi");
		System.out.println(show(50));
	}
	ClassP(int a)
	{
		
		System.out.println("==>"+(a+++ show(50)));
	}
	public static void main(String[] args) {
		new ClassP().display();
	}

}
