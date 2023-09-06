package Pack3;

public class Boy {
	public void character()//Overridden
	{
		System.out.println("Boy is always good ");
	}
	void Knowledge()
	{
		System.out.println("Good Knowledge ");
	}
	int Area()
	{
		System.out.println("Within range ");
		return 0;
	}
	protected void Class()
	{
		System.out.println("Going school ");
	}
	//static method cann't be override
	static void Goodboy()
	{
		System.out.println( "static");
	}

}
