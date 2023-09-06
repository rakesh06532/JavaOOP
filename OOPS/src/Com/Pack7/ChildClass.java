package Com.Pack7;


public class ChildClass extends ParentClass {
	public void ChildClassMeth()
	{
		System.out.println("Child Class exceuted ");
	}
	ChildClass()
	{
		this("Hi");
		System.out.println("Constructor");
	}
	ChildClass(String st)
	{
		
		System.out.println(st);
	}
	public static void main(String[] args) {
		GrandParent obj=new GrandParent();
		obj.GrandParentClass();
		
		
	}

}
