package Com.Pack6;

public class Test {
	public static void main(String[] args)  {
		Tickets obj=new Tickets(); 
		TestTickets obj2=new TestTickets();
		Thread t2=new Thread(obj2);
		Thread t=new Thread(obj);
		t.start();
		t2.start();
		
	}

}
