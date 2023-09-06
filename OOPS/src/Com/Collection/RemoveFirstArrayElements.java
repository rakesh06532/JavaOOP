package Com.Collection;

import java.util.ArrayList;

/*
 
 Create a method which can remove all the elements from a list other than the list of elements specified.
Method Name 	        removeElements 
Method Description 	Remove all the elements from a list other than the list of elements specified. 
Argument 	        List<String> list1, List<String> list2; 
Return Type 	        List- ArrayList contains the resulting List after the removal process. 
Logic 	                Accept two List objects list1 and list2 and remove all the elements from list 1 other than the 
                        elements contained in list2.This should be done in single step process without using loop. 

Hint: Use the List API method which can retain the elements available in the second list only

 */

public class RemoveFirstArrayElements {
	public void elements(ArrayList<Integer> list1,ArrayList<Integer> list2)
	{
		list1.addAll(list2);
		System.out.println(list1);
		list1.removeAll(list2);
		System.out.println(list1);
	}
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		RemoveFirstArrayElements obj=new RemoveFirstArrayElements();
		list1.add(10);
		list1.add(25);
		list1.add(23);
		list1.add(85);
		list2.add(59);
		list2.add(89);
		list2.add(55);
		list2.add(10);
		list2.add(10);
		obj.elements(list1,list2);
		
	}

}
