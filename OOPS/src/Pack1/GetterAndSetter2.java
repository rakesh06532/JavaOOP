package Pack1;

public class GetterAndSetter2 {
	private int studentRollNumber;
	private String studentName;
	
	public int getStudentRollNumber() {
		System.out.println("Step 3");
		return studentRollNumber;
	}
	public void setStudentRollNumber(int studentRollNumber) {
		System.out.println("Step 1");
		this.studentRollNumber = studentRollNumber;
	}
	public String getStudentName() {
		System.out.println("Step 4");
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Step 2");
		this.studentName = studentName;
	}
	

}
