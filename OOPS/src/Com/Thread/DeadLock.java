package Com.Thread;

class A
{
	public synchronized void foo(B b)
	{
		System.out.println("Thread1 start executions of foo() method ");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {}
		System.out.println("Thread1 trying to call b.last() method ");
		b.last();
	}
	public synchronized void last()
	{
		System.out.println("inside A this is last() method ");
	}
}
class B
{
	public synchronized void bar(A a)
	{
		System.out.println("Thread2 start execution bar() method ");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("Thread2 trying to call a.last() method ");
		a.last();
	}
	public synchronized void last()
	{
		System.out.println("inside B this is last method ");
	}
}
public class DeadLock implements Runnable {
	
	A a=new A();
	B b=new B();
	DeadLock()
	{
		Thread t=new Thread(this);
		t.start();
		a.foo(b);
		
	}
	
	@Override
	public void run()
	{
		b.bar(a);
	}
	public static void main(String[] args) {
		new DeadLock();
	}


}
