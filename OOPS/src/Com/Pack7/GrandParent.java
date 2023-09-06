package Com.Pack7;

public class GrandParent {
	public void GrandParentClass()
	{
		System.out.println("Grand parent class executed ");
	}
	GrandParent()
	{
		this("hi");
		System.out.println("const"); 
	}
	GrandParent(String st)
	{
		System.out.println(st);
	}
}
