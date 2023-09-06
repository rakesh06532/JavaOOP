package Com.Lambda.Expression;

public class Lambda2 {
	InterfaceA  x=()-> System.out.println("How are you ");
	public static void main(String[] args) {
		Lambda2 obj=new Lambda2();
		obj.x.meth1();
		
	}

}
