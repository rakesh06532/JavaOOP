package Pack3;

public abstract class abstractKeyword {
	
	abstract void meth1();
	
	void meth2()
	{
		System.out.println("meth2() called");
	}
	static void meth3()
	{
		System.out.println("static meth3() called");
		//this.meth3();
	}
	static
	{
		System.out.println("static block");
	}
	abstractKeyword()
	{
		System.out.println("constructor called");
	}
	
}
