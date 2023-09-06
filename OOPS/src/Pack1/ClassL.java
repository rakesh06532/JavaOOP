package Pack1;

public class ClassL {
	void meth1()
	{
		System.out.println("Class L method");
	}
		ClassL()
		{
			System.out.println("Class L default method");
		}
		ClassL (String s)
		{
			this();
			this.meth1();
			System.out.println(s);
		}
	}

