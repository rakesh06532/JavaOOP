package Com.Pack7;

public class MinimumAccountBalance extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	public MinimumAccountBalance(String message)
	{
		this.message=message;
	}
	public String toString()
	{
		return message;
	}
	

}
