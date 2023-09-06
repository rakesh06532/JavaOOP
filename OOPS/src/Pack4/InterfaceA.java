package Pack4;

 interface InterfaceA {
	void meth1();
	
	default void meth2()//From java 1.8v
	{
		System.out.println("Default method of interfaceA ");
		this.meth4();
	}
	static void meth3()//Java 1.8v
	{
		System.out.println("Static method of interfaceA ");
	}
	private void meth4()
	{
		System.out.println("private area ");
	}
	default void print()
	{
		System.out.println("interfaceA print ");
	}
	
	public static void main(String[] args) {
		System.out.println("main() of interfaceA ");
		InterfaceA.meth3();
	}

}


 interface InterfaceB {
	void show();
	default void print() {
		System.out.println("InterfaceB print()");
	}
}

 class ClassB {
	void display(String s) {
		System.out.println(s);
	}
}

 class ClassA extends ClassB implements InterfaceA, InterfaceB {
	
	public void meth1() {
		System.out.println("InterfaceA abstract method overriden ");
		
	}
	
	public void show() {
		System.out.println("InterfaceB abstract method overriden ");
	}
	public void print()
	{
	InterfaceA.super.print();
	InterfaceB.super.print();
	}
	public static void main(String[] args) {
		InterfaceA aobj=new ClassA();
		aobj.meth1();
		aobj.meth2();
		//aobj.meth4();
		//aobj.show(); C E
		InterfaceB bobj=new ClassA();
		bobj.show();
		ClassA obj=new ClassA();
		obj.display("Java is awesome");
		obj.print();
	}
	
}