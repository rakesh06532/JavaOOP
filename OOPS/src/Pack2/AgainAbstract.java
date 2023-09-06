package Pack2;

public class AgainAbstract extends AbstractMe {
	public void meth1()
	{
		System.out.println("Abstract me class ");
	}
	public void meth1(int a)
	{
		System.out.println("we can overload me ");
	}
	AgainAbstract()
	{
		super("java is awesome ");
		System.out.println("AgainAbstract constructor excute ");
	}
	public static void main(String[] args) 
	{
		AbstractMe obj=new AgainAbstract();
		obj.meth1();
		obj.meth1(100);
		AbstractMe.meth3();
	}

}
