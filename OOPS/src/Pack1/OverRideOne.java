package Pack1;

public class OverRideOne {
	void meth1()
	{
		System.out.println("OverRideOne meth1() ");
	}
	void meth2(int a,byte b)
	{
		System.out.println("OverRideOne meth2() ");
	}
	protected String meth3(String s)
	{
		System.out.println("OverRideOne meth3() ");
		return s;
	}
	static void meth4()
	{
		System.out.println("OverRideOne meth4() "); 
	}
	OverRideOne meth5()
	{
		System.out.println("OverRideOne meth5() ");
		return new OverRideOne();
	}

}

