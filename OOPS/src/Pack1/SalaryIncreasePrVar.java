package Pack1;

import java.util.Scanner;
/* empName, empSal, empDept, empId, empExp
  if the employee is having less than 5 years of exp : increase salary by 5% , 5 to below 10 years
 of experience increase salary by 15% , 10 to above years of experience increase salary by 30%.
 */
public class SalaryIncreasePrVar {
	void display()
	{
		Scanner sc=new Scanner(System.in);
		PrivateVariable obj=new PrivateVariable();
		System.out.println("Enter emp Id : ");
		obj.setEmpId(sc.nextInt());
		System.out.println("Enter emp Name : ");
		obj.setEmpName(sc.next());
		System.out.println("Enter emp Dept : ");
		obj.setEmpDept(sc.next());
		System.out.println("Enter emp Experience : ");
		obj.setEmpExp(sc.nextInt());
		System.out.println("Enter emp Salary : ");
		obj.setEmpSal(sc.nextDouble());
		sc.close();
		
		System.out.println("Employee id is : "+obj.getEmpId());
		System.out.println("Employee name : "+obj.getEmpName());
		System.out.println("Employee Department : "+obj.getEmpDept());
		System.out.println("Employee Experience : "+obj.getEmpExp());
		System.out.println("Employee Salary : "+obj.getEmpSal());
		System.out.println("After Increament salary : "+obj.salIncreament(obj.getEmpExp()));
	}
	public static void main(String[] args) {
		new SalaryIncreasePrVar().display();
		
		
	}

}
