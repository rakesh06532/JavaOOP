package Com.Pack6;

public class TestTickets implements Runnable {
	int tickets=100;
	public synchronized void run()
	{
		int i=1;
		if(tickets>0)
		{
			while(true)
			{
				System.out.println("Booking no "+i++);
				try {
					Thread.sleep(10);
				}
				catch(Exception e)
				{
					System.out.println("I got Exception ");
				}
				tickets--;
				System.out.println("Passenger tickets no "+(i-1));
				System.out.println("Available tickets are "+tickets);
				System.out.println("============================================");
				if(tickets<=0)
				{
					System.out.println("Tickets are not booked ");
					break;
				}
			}
		}
	}

}
