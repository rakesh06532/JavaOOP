package Pack4;

class P {
	String s="Java is awesome";
	void m2()
	{
		System.out.println("Parent class");
	}
}
class C1 extends P {
	String s="Java is";
	void m1()
	{
		String s="Java";
		System.out.println(s);
		System.out.println(super.s);
		System.out.println(this.s);
		System.out.println(this.s.equals(super.s));
		
	}
	public void m3()
	{
		System.out.println("Static");
		this.m2();
	}
}
public class P1 {
	public static void main(String[] args) {
		C1 a=new C1();
		a.m1();
		a.m2();
		a.m3();
		
	}
		

}
 
