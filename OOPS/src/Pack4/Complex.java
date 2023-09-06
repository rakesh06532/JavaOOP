package Pack4;

/*
 Complex numbers have the form: realPart + imaginaryPart
  

Let us create a class called COJ_03_Complex for performing arithmetic with complex numbers. 
 The Class COJ_03_Complex is given to you. Implement the following things in the class:

  
 1. Add two float variables called 'real' and 'imaginary' to represent the private data of the class.

 2. A default constructor is given to you.

 3. Add a constructor that takes two float parameters and initialize it to the fields real and imaginary.

 4. Implement the static method add(COJ_03_Complex c1, COJ_03_Complex c2): this method takes two complex numbers as parameters, adds them and returns the result as a new COJ_03_Complex object.

 5. Implement the static method subtract(COJ_03_Complex c1, COJ_03_Complex c2): this method takes two complex numbers as parameters, subtracts C2 from C1 and returns the result as a new COJ_03_Complex object.

 6. Implement the method printComplex(): This method prints the values of the class in the format "(real,imaginary)" 

	For example, if real is 4.5 and imaginary is 6.0 in a COJ_03_Complex object C1, then C1.printComplex() should return (4.5,6.0) as a String.

 */
public class Complex
{
	private float real;
	private float imaginary;
	
	Complex()
	{
		
	}
	Complex(float real,float imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	static Complex add(Complex c1,Complex c2)
	{
		Complex obj3=new Complex();
		obj3.real=c1.real+c2.real;
		obj3.imaginary=c1.imaginary+c2.imaginary;
		return obj3;
	}
	static Complex sub(Complex c1,Complex c2)
	{
		Complex obj3=new Complex();
		obj3.real=c1.real-c2.real;
		obj3.imaginary=c1.imaginary-c2.imaginary;
		return obj3;
	}
	String printComplex()
	{
		return ("("+real+","+imaginary+")");
	}
	public static void main(String[] args) {
		Complex obj1=new Complex(10.5f,9.2f);
		Complex obj2=new Complex(2.5f,3.6f);
		
		Complex obj3=new Complex();
		obj3=Complex.add(obj1,obj2);
		System.out.println(obj3.printComplex());
		Complex obj4=new Complex();
		obj4=Complex.sub(obj1, obj2);
		System.out.println(obj4.printComplex());
			
	}

}
