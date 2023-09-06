package Com.Pack5;

class Parent {
	public void meth1()
	{
		System.out.println("Parent ");
	}
	public void meth2()
	{
		System.out.println("meth2 called ");
	}
	
}
class Subparent extends Parent {
	public void meth1()
	{
		System.out.println("Subparent ");
	}
	public void meth3()
	{
		System.out.println("meth3 called ");
	}
	
}
class Sub extends Subparent {
	public void meth1()
	{
		System.out.println("Sub ");
	}
	public void meth4()
	{
		System.out.println("meth4 called ");
		meth6();
	}
	static void meth6()
	{
		System.out.println("static meth");
	}
	
}
public class Tester extends Sub {
	public void meth1()
	{
		System.out.println("Tester ");
	}
	public void meth5()
	{
		System.out.println("meth5 called ");
	}
	
	public static void main(String[] args) {
		Parent obj=new Sub();
		
		obj.meth1();
		
    	((Subparent)obj).meth1();
		((Sub)(Subparent)obj).meth1();
		//((Tester)(Sub)(Subparent)obj).meth1();
		//((Tester)(Sub)(Subparent)obj).meth5();
	//	((Tester)(Sub)(Subparent)obj).meth4();
	//	((Tester)(Sub)(Subparent)obj).meth3();
	//	((Tester)(Sub)(Subparent)obj).meth2();
        ((Sub)(obj)).meth2();
		obj.meth2();
		
		
		Tester obj2=new Tester();
		obj2.meth3();
		meth6();
		((Subparent)(obj2)).meth3();
		String s=new String("Rakesh");
		Object o= (Object)s;
		System.out.println(s==o);
		@SuppressWarnings("removal")
		Integer i=new Integer(10);
		Number n= (Number)i;
		Object ob=(Object)n;
		System.out.println(ob==n);
		System.out.println(i==ob);
		System.out.println(i==n);
		//@SuppressWarnings("removal")
		//Integer in=new Integer(10);
		//int I=in;
		//Integer x=10;
	}

}
