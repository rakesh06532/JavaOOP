package Pack4;

class D
{
	public void meth1()
	{
		System.out.println("Class A ");
	}
	public static void meth3()
	{
		System.out.println("Hi");
	}
	 D()
	{
		System.out.println("Constructor ");
		return;
	}
}
class M extends D
{
	public void meth2()
	{
		System.out.println("Class B");
	}
	public void meth1()
	{
		System.out.println("Class B ");
	}
	public void meth1(int a)
	{
		System.out.println(a);
	}
	public static void meth3()
	{
		System.out.println("meth3");
	}
}
 class DemoInheritance {
	 
	 
	public static void main(String[] args) {
		D obj= new D();
		obj.meth1();
		D obj2=new M();
		obj2.meth1();
		M obj3=new M();
		obj3.meth1();
		obj3.meth2();
		obj3.meth1(10);
		D.meth3();
	}

}
