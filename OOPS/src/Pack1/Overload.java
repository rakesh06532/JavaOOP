package Pack1;

public class Overload {
	private static void meth1()
	{
		System.out.println(10); 
	}
	final int meth1(int a)
	{
		System.out.println(20);
		return a;
	}
	static final protected void meth1(int a,String s)
	{
		System.out.println(30);
	}
	String meth1(String s,int a)
	{
		System.out.println(40);
		return s;
	}
	public int meth1(byte a)
	{
		System.out.println(50);
		return 10;
	}
	void meth1(String s)
	{
		System.out.println(60);
	}
	private StringBuffer meth1(StringBuffer sb)
	{
		System.out.println(70);
		return sb;
	}
	public static void main(String[] args) {
		
		Overload obj=new Overload();
		meth1();
		obj.meth1(200);
		meth1(100,"Java is awesome");
		obj.meth1("Hi",200);
		obj.meth1((byte)50);
		obj.meth1("Hello");
		obj.meth1(new StringBuffer("Hello World"));
		Overload.main();
		//obj.main(new int [] {10,20});
	}
	public static void main() {
		System.out.println("1st main");
	}
//	public static void main(int [] args) {
//		System.out.println("2nd main()"+Array.toString(args));
//	}
	Overload()
	{
		this(5000);
		System.out.println("Default Constructor ");
	}
	Overload(int a)
	{
		System.out.println("Parametrize constructor "+a);
	}
	static
	{
		System.out.println("Anything");
	}

}
