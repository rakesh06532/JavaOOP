package Pack2;
import Pack1.ClassJ;
public class ClassK extends ClassJ {
	void meth3()
	{
		System.out.println("Java ");
	}
	public static void main(String[] args) {
		ClassK obj=new ClassK();
		obj.meth1();//Grand parent class method
		obj.meth2();//parent class method
		obj.meth3();
	}

}
