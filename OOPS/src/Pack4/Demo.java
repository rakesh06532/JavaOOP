package Pack4;

 class A {
		 void input() {
		System.out.print("Enter ur name : ");
		 }
		 A()
		 {
			 System.out.println("Super constructor "); 
		 }
	}
	class B extends A {
		void Show() {
		System.out.println("My name is Rakesh ");
		}
		B()
		{
			System.out.println("B constructor ");
		}
	}
	class C extends A {
		void Display() {
		System.out.println("My name is Aryan");
		}
		C()
		{
			System.out.println("C constructor ");
		}
	}
public class Demo {
		public static void main(String[] args) {
			B r=new B();
			C r2=new C();
			r.input();
			r.Show();
			r2.input();
			r2.Display();
		}
	}

