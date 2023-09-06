package Pack1;

public class ReemapParty {
	String BatchName;
	int Trainees;
	String BatchTechnologies;
	String BatchStatus;
	public void Batch(String BatchName,int Trainees,String BatchTechnologies,String BatchStatus) {
		System.out.println("Batch name is : "+BatchName);
		System.out.println("Trainees is : "+Trainees);
		System.out.println("Batch Technologies "+BatchTechnologies);
		System.out.println("Batch status : "+BatchStatus);
	}
	public static void main(String[] args) {
		ReemapParty obj=new ReemapParty();
		obj.Batch("9th",100,"java","Running");
	}

}
