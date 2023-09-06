package Com.Collection;


import java.util.Scanner;

import java.util.LinkedHashMap;

/*
 
 Develop a program to take multiple integer as parameter as arguments in a method(in array format) by taking input from 
 the user.Inside this method add and subtract and multiply all the passed integer value and return addition,Subtraction 
 and multiplication from calling method and display all the value from the main method.
 method name:ArrayCalculation()
 method type :int [] array 
 return type: int [] array 

Note: Also pass  0  as size at the time giving size of the array and then observe the output.
      //if any execption will be there then write the logic to solving that exception.
       
 */
public class ArrayCalculation {
	public int addition(int n1, int n2)
	{
		int sum=n1+n2;
		return sum;
	}
	public int subtraction(int n1, int n2)
	{
		int subtraction=n1-n2;
		return subtraction;
	}
	public int multiplication(int n1,int n2)
	{
		int multiplication=n1*n2;
		return multiplication;
	}
	public double divide(int n1,int n2)
	{
		double divide=n1/n2;
		return divide;
	}
	
	public static void main(String[] args) {
		
		ArrayCalculation obj=new ArrayCalculation();
		System.out.println("Please enter first element ");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		System.out.println("Enter second element ");
		int n2=sc.nextInt();
		
		int addition=obj.addition(n1,n2);
		int subtract=obj.subtraction(n1, n2);
		int multiple=obj.multiplication(n1, n2);
		double divide=obj.divide(n1, n2);
		//int arr[]= {addition,subtract,multiple,divide};
		
		LinkedHashMap<Object,Object> hm=new LinkedHashMap<Object,Object>();
		hm.put("Addition of "+n1+" and "+n2, addition);
		hm.put("Subtraction of "+n1+" and "+n2, subtract);
		hm.put("Multiplication of "+n1+" and "+n2, multiple);
		hm.put("Divide of "+n1+" and "+n2, divide);
		System.out.println(hm);
		//System.out.println(Arrays.toString(arr));
		sc.close();
		
	}

}
