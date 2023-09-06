package Com.Pack6;

public class ThreadCommunicationTest {
	public static void main(String[] args) {
		ThreadCommunication obj=new ThreadCommunication();
		new Thread()
		{
			//Anonymous inner class start here
			public void run()
			{
				try
				{
					obj.withdraw(15000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			
		}
		.start();
		new Thread()
		{
			public void run()
			{
				try {
					obj.diposit(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
		
	}

}
