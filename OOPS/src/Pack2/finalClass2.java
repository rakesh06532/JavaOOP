package Pack2;


public final class finalClass2 extends finalClass {
	@Override
	public void meth()
	{
		System.out.println("finalClass2 ");
	}
	@Override
	public void meth3()
	{
		System.out.println("override ");
	}
	@Override
	void meth4()
	{
		System.out.println("override ");
		this.meth6();
		
	}
	@Override
	protected void meth5()
	{
		System.out.println("override ");
	}
	
	private void meth6()
	{
		System.out.println("Override ");
	}
	public static void main(String[] args) {
		//finalClass obj=new finalClass2();
		//obj.meth();
		//obj.meth3();
		Object o =new String("Rakesh");
		System.out.println(o);
		
		
		
	}

}
