package Pack4;

import java.util.Scanner;

/*
 A class called COJ_17_Customer is given to you. 
The task is to find the Applicable Credit card Type and create COJ_17_CardType object based on the Credit Points of a 
customer.

Define the following for the class.

Attributes : 
	customerName : String,private
	creditPoints: int,private

Constructor :
	parameterizedConstructor: for both cusotmerName & creditPoints in that order.

Methods :
	Name of the method : getCreditPoints
	Return Type : int
	Modifier   : public 
	Task : This must return creditPoints
	
	Name of the method : toString -OverRide it, 
	Return type : String 
	Task :  return only customerName from this.

Create another class called COJ_17_CardType. Define the following for the class

Attributes :
	customer : COJ_17_Customer, private
	cardType : String, private
Constructor :
	parameterizedConstructor: for customer and cardType attributes in that order

Methods :
	Name of the method : toString  Override this.  
	Return type : String
	Modifier : private
	Task :  Return the string in the following format.
		The Customer 'Rajeev' Is Eligible For 'Gold' Card.


Create One more class by name COJ_17_CardsOnOffer and define the following for the class.

Method : 
	Name Of the method : getOfferedCard 
	Return type : COJ_17_CardType
	Modifiers: public,static
	Arguments: COJ_17_Customer object
	Task : 	Create and return a COJ_17_CardType object after logically finding Grade from creditPoints as per the
	 below rules.
		Marks	 	Grade
		100  - 500   -   Silver
		501  - 1000  -   Gold
		1001 >       -   Platinum
		< 100        -   EMI
		
Code a COJ_17_Main class to test the working of the above.
 */


public class Tester2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Credit points of a customer :");
		COJ_17_Customer xx=new COJ_17_Customer("Rajeev",sc.nextInt());
		COJ_17_CardType yy=COJ_17_CardsOnOffer.getOfferedCard(xx);
		System.out.println(yy);
		sc.close();

	}

}
