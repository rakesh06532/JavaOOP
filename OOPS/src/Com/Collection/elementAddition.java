package Com.Collection;

/*
 
  WAJP for 1D array inside that array take few elements for eg.(1,2,3,4,5)
  create a method name elementAddition() having 1 parameter 
  as int Array which will return the sum of all the element
 */

import java.util.ArrayList;

public class elementAddition {
	public int elements(ArrayList<Integer> al)
	{
		int sum=0;
		for(int i=0;i<al.size();i++)
		{
			sum=sum+al.get(i);
		}
		//System.out.println(sum);
		return sum;
	}
	
	public static void main(String[] args) {
		elementAddition obj=new elementAddition();
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(12);
		al.add(25);
		al.add(10);
		al.add(58);
		al.add(20);
		
		int result=obj.elements( al);
		System.out.println("The sum of elements is : "+result);
		
	}

}
