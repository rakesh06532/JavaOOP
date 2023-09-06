package Com.Collection;


public class EmployeeDetails {
	int empSal;
	String empName;
	String empDept;
	public EmployeeDetails(int empSal,String empName,String empDept)
	{
		this.empSal=empSal;
		this.empDept=empDept;
		this.empName=empName;
		
	}
	@Override
	public String toString()
	{
	return empName+" "+empSal+" "+empDept;
	}
	

}
