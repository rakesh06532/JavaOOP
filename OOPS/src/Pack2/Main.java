package Pack2;

class Main1 {
	public void meth1()
	{
		System.out.println("Hello");
	}
	
}
class Main2 extends Main1 {
	public void meth()
	{
		System.out.println("hi");
	}
	
}
public class Main extends Main2 {
	public void meth3()
	{
		System.out.println("I am fine");
	}
	public static void main(String[] args) {
		Main obj=new Main();
		obj.meth();
		obj.meth1();
		obj.meth3();
		
	}

}
