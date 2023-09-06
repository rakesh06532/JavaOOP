package Com.Pack6;

public class innerClassTest2 {
	public static void main(String[] args) {
		innerClass2 obj =new innerClass2()
				{
			@Override
			public void meth()
			{
				System.out.println("Override ");
			}
				};
				innerClass obj3=new innerClass();
				innerClass obj2=new innerClass()
						{
					public void meth()
					{
						System.out.println("Override 2 ");
					}
						};
				obj.meth();
				obj2.meth();
				System.out.println(obj.getClass().getName());
				System.out.println(obj2.getClass().getName());
				System.out.println(obj3.getClass().getName());
	}

}
