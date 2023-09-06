package Com.Pack7;


class A {
	void show()
	{
		System.out.println("Welcome ");
	}
}
 public class B {
	 A a=new A();
	 public static void main(String[] args) {
		System.out.println("class B");
		B b=new B();
		b.a.show();
	}

}
