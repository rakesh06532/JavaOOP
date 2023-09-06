package Com.Pack7;

public class ThrowsException2 {
	int amount=10000;
	public void meth(int amount)
	{
		if(this.amount<amount)
		{
			 throw new NullPointerException("Insufficient Balance "+this.amount);
		}
		else
		{
			System.out.println("Take your money "+this.amount);
		}
	}
	public static void main(String[] args) {
		
		ThrowsException2 obj=new ThrowsException2();
		obj.meth(1000);
	}

}
