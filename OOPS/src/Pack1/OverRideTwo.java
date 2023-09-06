package Pack1;

public class OverRideTwo extends OverRideOne {
	
	@Override
	void meth1()   //over ridding
	{
		System.out.println("OverRideTwo meth1() ");
	}
	@Override
	void meth2(int x,byte b)
	{
		System.out.println("OverRideTwo meth2() "+x);
	}
	@Override
	public String meth3(String s)
	{
		System.out.println("OverRideTwo meth3() "+s);
		return s;
	}
	
	static void meth4()
	{
		System.out.println("OverRideTwo meth4() ");
	}
	OverRideTwo meth5()
	{
		System.out.println("OverRideTwo meth5() ");
		return new OverRideTwo();
	}
	public static void main(String[] args) {
		OverRideOne obj1=new OverRideTwo();
		obj1.meth1();
		obj1.meth2(100, (byte)50);
		obj1.meth3("Java");
		meth4();
		
		
		obj1.meth5();
		System.out.println("------------------------------");
		OverRideOne obj2=new OverRideOne();
		obj2.meth1();
		obj2.meth2(10, (byte)20);
		obj2.meth3("Java is awesome ");
		obj2.meth5();
		
	}

}
