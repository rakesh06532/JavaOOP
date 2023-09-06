package Pack1;

public class ClassH extends ClassG {

	void meth2()
	{
		System.out.println("ClassH method ");
	}
	public static void main(String[] args) {
		ClassG obj=new ClassG();
		obj.meth1();
		//obj.meth2(); C. E.
		ClassG obj2=new ClassH();
		obj2.meth1();
		//obj2.meth2(); C.E.
		ClassH bobj=new ClassH();
		bobj.meth1();
		bobj.meth2();
	}
}
