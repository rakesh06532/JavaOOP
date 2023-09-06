package Com.Thread;

public class ThreadNotify {
	int amount=10000;
	
 synchronized void with_draw(int amount) throws InterruptedException {
	 
	if(this.amount<amount)
	{
		System.out.println("Insufficient balance ");
		wait(10000,500);
		System.out.println("Amount credited ");
		this.amount-=amount;
		System.out.println("withdraw successfull \n Balance is "+this.amount);
	}
	else {
		this.amount=amount;
		System.out.println( "withdraw successfull \n Balance is "+this.amount);
	     }
	

}

synchronized void diposite(int amount )
{
	this.amount+=amount;
	System.out.println("deposite successfull \n Balance is "+this.amount);
}
}
