package Pack2;

class P {
	public void property()
	{
		System.out.println("Gold");
	}
	public void merry()
	{
		System.out.println("Sundri");
	}
}
class C extends P {
	public void merry()
	{
		System.out.println("Sony");
	}
}
public class OverR {
	public static void main(String[] args) {
		
		P obj3=new C();
		obj3.property();
		obj3.merry();
		
	}

}
