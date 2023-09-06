package Com.Pack6;

public class COJ_38_TicketDispenser implements Runnable {
	int ticketsAvailable=100;
	@Override
	public synchronized void run()
	{
		System.out.println("Waiting to book ticket ");
		//synchronized (this) {
			int i=1;
			if(ticketsAvailable>0) {
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
					ticketsAvailable--;
					System.out.println("Ticket booked for Passenger : "+(i-1));
					System.out.println("Currently tickets Available = "+ticketsAvailable);
					System.out.println("============================================================");
//					if(ticketsAvailable>0) {
//						
//					}
					if(ticketsAvailable<=0) {
						System.out.println("Tickets not booked for : passengers "+i);
						break;
					
					//}
				}
			}
			
		}//End synchronization block
	}
	

}
