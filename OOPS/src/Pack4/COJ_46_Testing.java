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
	
		This method should return the volume of the cylender.
		Return -1 if height is negative.

Given a class COJ_46_Testing that contains main method. Use this class to test your code.
 */

class COJ_46_Circle {
	double radius; 
	COJ_46_Circle() 
	{
		 
	}
	COJ_46_Circle(double r)
	{
		
		this.radius=r;
	}
	double getArea()
	{
		double area=3.14*radius*radius;
		if(radius<0)
			return -1;
		else
		return area;
	}
}

class COJ_46_Cylender extends COJ_46_Circle {
	double height;
	COJ_46_Cylender() 
	{
		
	}
	COJ_46_Cylender(double r,double h)
	{
		this.radius=r;
		this.height=h;
	}
	double getVolume()
	{
		double volume=3.14*radius*radius*height;
		if(height<0)
			return -1;
		else return volume;
	}
	
}
public class COJ_46_Testing {
	public static void main(String[] args) {
		COJ_46_Cylender obj1=new COJ_46_Cylender(8.0,5);
		COJ_46_Circle obj2 =new COJ_46_Circle(10.5);
		double res1=obj2.getArea();
		System.out.println("The Area of \"Circle\" is : "+res1);
		double res2=obj1.getVolume();
		System.out.println("The Volume of \"Cylender\" is : " +res2);
	}

}
