package Pack3;

public abstract class Human {
	 abstract void Men();
	 abstract void Eat();
	
	
	public static void main(String[] args) {
		Human obj1=new Aryan();
		Human obj2=new Prince();
		
		obj1.Men();
		obj2.Men();
		obj1.Eat();
		obj2.Eat();
		
	}

}
