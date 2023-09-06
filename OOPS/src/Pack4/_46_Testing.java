package Pack4;


/*
A. Class COJ_46_Circle is given to you. Add below details to the class

	1. Instance variables:
		radius: double.
	2. Create a default constructor that assigns default values to instance variables.
	3. Create parameterized constructor that accepts radius.
	4. Create below methods,
		Method name: getArea
		Return type: double
	
		This method should return the area of the circle.
		Return -1 if radius is negative.

B. Create a sub class of COJ_46_Circle with name COJ_46_Cylender that inherits and add below details to the class

	1. Instance variables:
		height: double.
	2. Create a default constructor that assigns default values to instance variables.
	3. Create parameterized constructor that accepts radius, height.
	4. Create below methods,

		Method name: getVolume
		Return type: double
	
		This method should return the volume of the cylinder.
		Return -1 if height is negative.

Given a class COJ_46_Testing that contains main method. Use this class to test your code.
*/


public class _46_Testing {
	public static void main(String[] args) {
		_46_Cylender obj1=new _46_Cylender(7.0,6.5);
		_46_Circle obj2 =new _46_Circle(9.5);
		double res1=obj2.getArea();
		System.out.println("The Area of \"Circle\" is : "+res1);
		double res2=obj1.getVolume();
		System.out.println("The Volume of \"Cylender\" is : " +res2);
	}

}
