package Com.Collection;

public class UseCompare implements Comparable<UseCompare> {
	String empName;
	int empSal;
	String empDept;
	
	public UseCompare (String empName, int empSal, String empDept)
	{
		this.empName=empName;
		this.empSal=empSal;
		this.empDept=empDept;
	}
	@Override
	public String toString()
	{
		return empName+" "+empSal+" "+empDept;
	}
	@Override
	public int compareTo(UseCompare o)
	{
		return this.empSal-o.empSal;
		//sort data using an empSal;
		//return this.empName.compareTo(o.empName);
		//sort data using empName;
		//return this.empDept.compareTo(o.empDept);
		//sort data using empDept;
	}

}
