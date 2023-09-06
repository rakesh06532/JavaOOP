package Pack4;

class VarArg2 
{
	public void meth(int... a)
	{
		System.out.println("Parent class ");
	}
}
public class VarArg extends VarArg2 {
	@Override
	public void meth(int...a)
	{
		System.out.println("Vararg method "+a[1]+a.length);
	}
	public static void main(String[] args) {
		VarArg2 obj=new VarArg();
		obj.meth(10,20,30,40,60);
	}

}
