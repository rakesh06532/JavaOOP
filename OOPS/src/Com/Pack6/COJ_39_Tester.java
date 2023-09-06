package Com.Pack6;

/*
 A typical example of simultaneous threads is that of an online reservation system. Multiple users are trying to book seats/products at the same time. In this problem, we are writing a Ticker Dispenser in a railway reservation system. 

* A COJ_38_TicketDispenser class is given to you. This class can give out a maximum of 100 tickets.
* In this class the maximum seats is already declared and assigned to the value of 100. Do not allot seats greater than this.
* Declare an integer variable called allotedSeats. This variable holds the current seat that is alloted.
* Declare a method allotSeatNumber():
* This method should return the alloted seat number to the caller.
* This method should start allotting seat numbers from 1 and allot seats in the increasing order.
* If all 100 seats have been allotted, return -1.
* If Multiple threads are trying to use this class for seat allotment, this class should be able to handle the multiple threads such that there is no thread interference or error.

* Use the class COJ_39_Tester.java to test the TicketDispenser class and its methods. Make sure you test the class for single and multi threaded operations.


 */
public class COJ_39_Tester {
	public static void main(String[] args) {
		COJ_38_TicketDispenser obj=new COJ_38_TicketDispenser();
		Thread t1=new Thread(obj);
		
		t1.start();
	
	}

}
