package Pack1;

public class ClassO {
	void meth1()
	{
		System.out.println(10);
		System.out.println(this.meth2()+56);
	}
	int meth2()
	{
		System.out.println(72);
		System.out.println(96);
		return this.meth3();
	}
	int meth3()
	{
		System.out.println(74);
		System.out.println(92);
		return 74-92;
	}
	void meth4(int i)
	{
		System.out.println(56+i);
	}
	ClassO()
	{
		this(5200);
		this.meth1();
		System.out.println(85);
	}
	ClassO(int a)
	{
		System.out.println(a+7);
	}

}
