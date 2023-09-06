package Com.Collections;

public class Employee implements Comparable <Employee> {
	String empName;
	int empSal;
	int empAge;
	
	public Employee(String empName, int empAge, int empSal)
	{
		this.empAge=empAge;
		this.empName=empName;
		this.empSal=empSal;
	}
	@Override
	public String toString()
	{
		return empName+" "+empAge+" "+empSal;
	}

	public int getSal()
	{
		if(empAge>=25)
			return (empSal/100*10+empSal);
		return empSal;
	}
	public String getName()
	{
		return empName;
	}
	public int getAge()
	{
		return empAge;
	}
	@Override
	public int compareTo(Employee o)
	{
		return this.empSal-o.empSal;
	}
}
