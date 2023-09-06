package Pack3;

public class Required implements AryanNeed {
	
	public void Milk()
	{
		System.out.println("Milk ");
	}
	public void Food()
	{
		System.out.println("Food ");
	}
	public void Education()
	{
		System.out.println("Education ");
	}
	public static void main(String[] args) {
		AryanNeed obj=new Required();
		Required obj2=new Required()
				{
			public void Food()
			{
				System.out.println("Anonymous inner class");
			}
				};
		obj.Members();
		obj.Milk();
		obj.Education();
		obj.Food();
		obj2.Education();
		AryanNeed.meth5();
		obj2.Food();
	}

}
