package Com.Pack5;

class A
{
	public void meth5()
	{
		System.out.println("meth5 ");
	}
}

public class TestMe extends A implements Need ,Need2 ,Need3 {
	@Override
	public void meth1()
	{
		System.out.println("meth1 called ");
	}
	@Override
	public void meth2()
	{
		System.out.println("meth2 called ");
	}
	@Override
	public void meth5()
	{
		System.out.println("Override meth5() ");
	}
	@Override
	public void meth8()
	{
		System.out.println("meth8() ");
	}
	@Override
	public void meth7()
	{
		System.out.println("meth7() ");
	}
	@Override
	public void meth12()
	{
		System.out.println("meth14() ");
	}
	@Override
	public void meth13()
	{
		System.out.println("meth13() ");
	}
	public final void meth14()
	{
		System.out.println("meth14() ");
	}
	public static void main(String[] args) {
		Need.meth4();
		TestMe obj=new TestMe();
		A obj2=new TestMe();
		obj.meth3();
		obj.meth1();
		obj.meth2();
		obj.meth9();
		obj.meth8();
		obj2.meth5();
		obj.meth7();
		obj.meth12();
		
	}

}
