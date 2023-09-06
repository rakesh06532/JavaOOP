package Pack2;


class Mammal 
{
	void eat(Mammal m)
	{
		System.out.println("Mammal eats food");
	}
}
class Cattle extends Mammal
{
	void eat(Cattle c) 
	{
		System.out.println("Cattel eats hay");
	}
}
class Horse extends Cattle 
{
	void eat (Horse h) 
	{
		System.out.println("horse eats hay");
	}
}

public class TestA 
{
public static void main(String[] args) {
	Mammal h=new Horse();
	Cattle c=new Horse();
	c.eat(h);
}
	
}