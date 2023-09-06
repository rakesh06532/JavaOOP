package Com.Lambda.Expression;

public class LambdaClass {
		public void meth1()
		{
			InterfaceA x=()-> System.out.println("Hello World");
			x.meth1();
		
			InterfaceB y=(int m,int n)-> System.out.println("Addition "+(m+n));
			y.meth2(99,1);
			
			InterfaceC z=(int p,int q)->
			{
			if(p>q)
			{
				System.out.println("If block executed ");
				return p+100;
			}
			else
			{
				System.out.println("Else block executed ");
				return q+10;
			}
			};
			System.out.println("====>"+z.meth3(5, 10));
		}
	public static void main(String[] args) {
		LambdaClass obj=new LambdaClass();
		obj.meth1();
		
	}

}
