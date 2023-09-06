package Pack2;

public abstract class AbstractMe {
	abstract void meth1();
	abstract void meth1(int a);
	void meth2()
	{
		System.out.println("meth2 called ");
	}
	static void meth3()
	{
		System.out.println("meth3 called ");
	}
	AbstractMe(String s)
	{
		System.out.println("Constructor called ");
		System.out.println(s);
	}
	public AbstractMe()
	{
		
	}
	public static void main(String[] args) {
		System.out.println("Class AbstractMe main meth ");
		meth3();
		
		
	}

}
