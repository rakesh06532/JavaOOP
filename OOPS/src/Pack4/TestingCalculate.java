package Pack4;

/*
[4:21 pm, 25/10/2022] +91 98665 31626: Create an interface COJ_44_AdvancedArithmetic 
which contains a method signature as:-
public abstract int divisorSum(int n). 

Then write a class called COJ_44_MyCalculator which implements the interface COJ_44_AdvancedArithmetic.

divisorSum function just takes an integer as input and return the sum of all its divisors. 
For example divisors of 6 are 1,2,3 and 6, so divisorSum should return 12. 

Sample Input
============
6

Sample Output
=============
12

Explanation
===========
Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12.

Note:
===== 
A class COJ_44_Testing is given to you with a main method. 
Use this class to test your solution's classes and methods.
[4:21 pm, 25/10/2022] +91 98665 31626: This exercise is to understand how to implement abstract class.

Now your task is to define the classes with respective specifications as given below.

Define an abstract class 'Shape' with following specifications

Methods:
	1. Name: getArea
	   ReturnType: double
	   Modifier: abstract

	2. Name: printDetails
	   ReturnType: double
	   Modifier: abstract

Define sub-classes of Shape as Rectangle, Circle, Triangle that overrides the methods of shape

1. class name: Rectangle

Fields:
	1. length - double
	2. breath - double

Constructors:
	A parametrized constructor the accepts and initializes length and breath.


2. class name: Circle

Fields:
	1. radius - double
	
Constructors:
	A parametrized constructor the accepts and initializes radius.

3. class name: Triangle

Fields:
	1. base - double
	2. height - double

Constructors:
	A parametrized constructor the accepts and initializes base and height.



All the sub-classes of Shape should override the methods of the shape.
getArea() should return the area of the respective shape.
printDetails() should print the shape details as below

	input:  Rectangle(30.3, 45.4)

	output:
		Type = Rectangle
		Length = 30.3
		Breadth = 45.4
		Area = 1375.62


	input: Circle(23.2)

	output:
		Type = Circle
		Radius = 23.2
		Area = 1690.0736

	input: Triangle(146.2, 40.0);

	output:
		Type = Triangle
		Base = 146.2
		Height = 40.0
		Area = 2924.0


Given a class Testing with main method to test your code.

*/
 abstract class Shape {
	 abstract double getArea();
	 abstract double printDetails();
	 
 }
 class Rectangle extends Shape {
	 double length;
	 double breadth;
	 
	 Rectangle(double l, double b)
	 {
		 this.length=l;
		 this.breadth=b;
	 }
	 
	 public double getArea()
	 {
		 double area=length*breadth;
		 return area;
	 }
	 public double printDetails()
	 {
		 System.out.println("Type = Rectangle ");
		 System.out.println("Length = "+length);
		 System.out.println("Breadth = "+breadth);
		 System.out.println("Area = "+this.getArea());
		 return 0;
	 }
 }
 class Circle extends Shape {
	 double radius;
	 
	 Circle(double r)
	 {
		 this.radius=r;
	 }
	 public double getArea()
	 {
		 double area=3.14*radius*radius;
		 return area;
	 }
	 public double printDetails()
	 {
		 System.out.println("Type = Circle");
		 System.out.println("Radius = "+radius);
		 System.out.println("Area = "+this.getArea());
		 return 0;
	 }
	 
 }
 class Traingle extends Shape {
	 double base;
	 double height;
	 
	 Traingle(double b,double h)
	 {
		 this.base=b;
		 this.height=h;
	 }
	 public double getArea()
	 {
		 double area=0.5*(base*height);
		 return area;
	 }
	 public double printDetails()
	 {
		 System.out.println("Type = Traingle");
		 System.out.println("Base = "+base);
		 System.out.println("Height = "+height);
		 System.out.println("Area = "+this.getArea());
		 return 0;
	 }
 }
public class TestingCalculate {
	public static void main(String[] args) {
		Shape obj1=new Rectangle(30.0,45);
		Shape obj2=new Circle(12.0);
		Shape obj3=new Traingle(12.0,15.0);
		
		obj1.printDetails();
		System.out.println("===================================");
		System.out.println();
		obj2.printDetails();
		System.out.println("====================================");
		System.out.println();
		obj3.printDetails();
		
	}

}
