package Pack3;

public class GoodBoy extends Boy {
	@Override
	public void character()
	{
		System.out.println("GoodBoy character ");
	}
	@Override
	public void Knowledge()
	{
		System.out.println("Good ");
	}
	@Override
	public int Area()
	{
		System.out.println("Area");
		return 0;
	}
	@Override
	protected void Class()
	{
		System.out.println("School");
	}
	//static method cann't be override
	//@Override
	static void Goodboy()
	{
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		Boy obj=new GoodBoy();
		obj.character();
		obj.Area();
		obj.Knowledge();
		obj.Class();
	}

}
