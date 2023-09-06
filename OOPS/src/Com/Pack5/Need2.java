package Com.Pack5;

public interface Need2 {
	public void meth7();
	public void meth8();
	default void meth9()
	{
		System.out.println("meth9() ");
		this.meth10();
	}
	private int meth10()
	{
		System.out.println("meth10() ");
		return 0;
	}
	
	static int meth12()
	{
		System.out.println("meth12() ");
		
		return 0;
	}
	

}
