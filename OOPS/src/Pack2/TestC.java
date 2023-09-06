package Pack2;

//class A {
//	int i=10;
//	public void printValue()
//	{
//		System.out.println("valueA");
//	}
//
//}
//class BA extends A {
//	int i=12;
//	public void printValue()
//	{
//		System.out.println( "valueB");
//	}
//}
//public class TestC
//{
//	public static void main(String[] args) {
//		A a=new BA();
//		a.printValue();
//		System.out.println(a.i);
//	}
//}

class ClassA
{
	public void method()
	{
		System.out.println("Hi i am ClassA");
	}
}
public class TestC extends ClassA {
	public void method()
	
	{
		System.out.println("Hi i am Class B");
	}
	public static void main(String[] args) {
		ClassA child=new TestC();
		child.method();
	}
}
