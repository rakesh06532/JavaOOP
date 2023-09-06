package Com.Pack7;

public class ClassA implements InterfA {
	@Override
	public void meth()
	{
		System.out.println("Override ");
	}
	@Override
	public void Animal()
	{
		System.out.println("Animal ");
	}
	@Override
	public void Goat()
	{
		System.out.println("Goat ");
	}
	public static void main(String[] args) {
		ClassA obj=new ClassA();
		obj.meth();
		new ClassA()
		{
			@Override
			public void meth()
			{
				System.out.println("meth is override ");
			}
		}
		.meth();
	}

}
