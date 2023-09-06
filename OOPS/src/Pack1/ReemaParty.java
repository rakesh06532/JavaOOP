package Pack1;

public class ReemaParty {
	public void display()
	{
		ReemaParty2 obj=new ReemaParty2();
		obj.setBatchName("9th Batch ");
		obj.setTrainees(100);
		obj.setBatchTechnologies("Java");
		obj.setBatchStatus("Running");
		System.out.println("Batch name : "+obj.getBatchName());
		System.out.println("Batch Trainees are : "+obj.getTrainees());
		System.out.println("Batch Technologies : "+obj.getBatchTechnologies());
		System.out.println("Batch Status is : "+obj.getBatchStatus());
	}
	public static void main(String[] args) {
		ReemaParty rp=new ReemaParty();
		rp.display();
		
	}

}
