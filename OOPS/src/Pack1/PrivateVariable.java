package Pack1;

public class PrivateVariable {
	private String empName;
	private double empSal;
	private String empDept;
	private int empId;
	private int empExp;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpExp() {
		return empExp;
	}
	public void setEmpExp(int empExp) {
		this.empExp = empExp;
	}
	public double salIncreament(int empExp)
	{
		if(empExp<5) return empSal+empSal*0.05;
		else if(empExp<10)return empSal+empSal*0.15;
		return empSal+empSal*0.30;
	}
	

}
