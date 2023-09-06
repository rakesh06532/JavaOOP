package Pack3;

public interface AryanNeed {
	public void Milk();
	public void Food();
	public void Education();
	default public void Members()
	{
		System.out.println("All are need Constitutional articles ");
		this.meth3();
	}
	private void meth3()
	{
		System.out.println("This is private ");
	}
	static void meth5()
	{
		System.out.println("Static block ");
		
	}

}
