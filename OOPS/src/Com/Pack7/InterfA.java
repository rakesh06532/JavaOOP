package Com.Pack7;

public interface InterfA {
	public void meth();
	public abstract void Animal();
	static int a=10;
	
	default void m() {
		for(int i=a;i<15;i++) {
			System.out.println(a);
		}
	}
	public default void Dog()
	{
		System.out.println("Dog is animal ");
		this.Cat();
		Rabbit();
	}
	private void Cat()
	{
		System.out.println("Cat is also animal ");
	}
	 static void Rabbit()
	{
		System.out.println("Rabbit ");
	}
	 void Goat();

}
