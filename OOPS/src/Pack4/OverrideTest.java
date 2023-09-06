package Pack4;

  class Base
{
	 void display() {
		 System.out.println("h");
	 }
}
public class OverrideTest extends Base {
	@Override
	 void display()
	{
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		Base obj=new OverrideTest();
		obj.display();
	}
}
