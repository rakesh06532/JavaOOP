package Com.Pack6;

public class innerClassTest  {
	
	
	public static void main(String[] args) {
		innerClass obj=new innerClass()
				{
			@Override
			public void meth()
			{
				System.out.println("innerClassTest override ");
			}
				};
				obj.meth();
	}

}
