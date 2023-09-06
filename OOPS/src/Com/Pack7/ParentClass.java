package Com.Pack7;

public class ParentClass extends GrandParent {
	public void ParentClassmeth()
	{
		
		System.out.println("ParentClass Executed ");
	}
    public ParentClass()
    {
    	this("hi");
    	System.out.println("Constructor");
    }
    ParentClass(String st)
    {
    	//this();
    	System.out.println(st);
    }
}
