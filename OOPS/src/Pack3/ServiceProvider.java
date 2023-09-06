package Pack3;

public class ServiceProvider implements Service {
	@Override
	public void meth()
	{
		System.out.println("meth called ");
	}
	@Override
	public void meth2()
	{
		System.out.println("meth2 called ");
	}
	public static void main(String[] args) {
		Service obj=new ServiceProvider();
		obj.meth();
		obj.meth2();
	}

}
