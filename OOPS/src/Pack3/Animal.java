package Pack3;

public abstract class Animal {
	public abstract void eat();
	public abstract void Sleep();
	
	
		public static void main(String[] args) {
			Animal obj=new Dog();
			Animal obj2=new Cat();
			obj.eat();
			obj.eat();
			obj2.Sleep();
			obj2.eat();
			
		}
	
}
