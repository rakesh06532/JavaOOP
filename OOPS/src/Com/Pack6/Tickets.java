package Com.Pack6;

public class Tickets implements Runnable {
	int tickets=100;
	public synchronized void run()
	{
		int i=1;
		
		 if(tickets>0)
		 {
			 while(true)
				{
					System.out.println("Booking tickets for Passenger "+i++);
					try {
						Thread.sleep(10);
					}
					catch(Exception e)
					{
						System.out.println( "I got exception ");
					}
					tickets--;
					System.out.println("Ticket booked for Passenger : "+(i-1));
					System.out.println("Currently tickets Available = "+tickets);
					System.out.println("============================================================");	
					
					if(tickets<=0) {
						System.out.println("Tickets not booked for : passengers "+i);
						break;
					}
	           }
		}	
	}
}
