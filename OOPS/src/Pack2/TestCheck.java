package Pack2;

class Super
{
	int value=0;
	Super()
	{
		System.out.println("Hi");
		addValue();
		//System.out.println("hi2");
	}
	void addValue()
	{
		//System.out.println("Hi3");
		value+=10;
	}
	int getValue()
	{
		
		return value;
	}
}
class Sub extends Super
{
	Sub()
	{
		System.out.println("helo");
		
	addValue();
}
	void addValue()
	{
		value+=20;
	}
}

public class TestCheck
{
	
 public static void main(String[] args) {
	 Super b=new Sub();
	 
	 
	 System.out.println(b.getValue());
	
}
	 
 }




