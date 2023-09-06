package Pack1;

public class ClassM extends ClassL {
	void meth2()
	{
		super.meth1();
		System.out.println("ClassM method");
	}
	ClassM()
	{
		super("Hi");
		this.meth2();
		System.out.println("ClassM default constructor");
	}
	public static void main(String[] args) {
		ClassM obj=new ClassM();
		obj.meth2();
	}

}

/*
 Class L default method
 Class L method
 Hi
 Class L method
 ClassM method
 ClassM default constructor
 Class L method
 ClassM method
 
*/