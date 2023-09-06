package Pack1;

//import java.io.PrintWriter;
public class ClassAB extends ClassAA {
	int a=super.a;
	void meth()
	{
		super.meth3();
		System.out.println("Hi "+super.a);
	}
	ClassAB()
	{
		this(50);
		super.meth3();
		System.out.println("ClassAB cunstructor ");
	}
	ClassAB(int a)
	{
		super.meth3();
		System.out.println("parametrize constructor");
	}
	@Override
	public void meth3()
	{
		System.out.println("meth3()");
	}
	public static void main(String[] args) {
		ClassAB obj=new ClassAB();
		obj.meth();
		obj.meth3();
	}

}
