package Pack4;

public class COJ_17_Customer {
	private String CustomerName;
	private int CreditPoint;
	public COJ_17_Customer(String Name, int Point)
	{
		this.CustomerName=Name;
		this.CreditPoint=Point;
	}
	public int getCreditPoint()
	{
		return CreditPoint;
	}
	
	public String toString()
	{
		return "CustomerName = "+CustomerName;
	}

}
