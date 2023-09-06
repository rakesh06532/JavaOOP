package Pack3;

public class abstractKeyword2 extends abstractKeyword {
	void meth1()
	{
		System.out.println("abstract method overriding ");
	}
	static {
		System.out.println("Child class static block");
	}
	abstractKeyword2()
	{
		System.out.println("Child Constructor called ");
	}
	
	public static void main(String[] args) {
		
		abstractKeyword aobj=new abstractKeyword2();
		aobj.meth1();
		aobj.meth2();
	}

}
