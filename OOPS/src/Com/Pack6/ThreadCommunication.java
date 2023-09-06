package Com.Pack6;

public class ThreadCommunication {
	int amount=10000;
	synchronized void withdraw(int amount) throws InterruptedException {
		if(this.amount<amount)
		{
			System.out.println("Insufficient balance ");
			System.out.println("You are trying to withdraw "+amount+"Rs but in your account "+this.amount+ "Rs is there");
			System.out.println("Please wait util your account is credite ");
			wait(5000);
			//System.out.println("Amount credited ");
			this.amount-=amount;
			System.out.println("withdraw successfull \n Remaining Balance is "+this.amount);
		}
		else
		{
			this.amount-=amount;
			System.out.println("withdraw successfull \n Balance is "+this.amount);
		}
		
	}
	synchronized void diposit(int amount ) throws InterruptedException
	{
		this.amount+=amount;
		wait(5000);
		System.out.println("Deposite successfull now you can withdraw your amount \n Available Balance is "+this.amount);
		notify();
		//notifyAll();
	}

}
