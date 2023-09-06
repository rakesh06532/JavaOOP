package Pack3;

 abstract class Check {
	public abstract void Fruits();
	public abstract void Juice();
	public abstract void Dinner();

}

 abstract class Test1 extends Check {
	public void Fruits()
	{
		System.out.println("Sweets ");
	}
}
abstract class Test2 extends Test1 {
	public void Dinner()
	{
		System.out.println("Dinner ");
	}
	
}
public class Test extends Test2 {
	public void Juice()
	{
		System.out.println("Nice ");
	}
	public static void main(String[] args) {
		Test obj=new Test();
		obj.Dinner();
		obj.Fruits();
		obj.Juice();
	}
	
}