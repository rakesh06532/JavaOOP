package Com.Pack5;

public interface Need {
	public void meth1();
	void meth2();
	default void meth3()
	{
		System.out.println("meth3 called ");
		this.meth6();
	}
	static void meth4()
	{
		System.out.println("Meth4 called ");
	}
	private void meth6()
	{
		System.out.println("meth6() ");
	}


}
