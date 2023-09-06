package Com.Collection;

/*
 
 Create a method that searches for a particular String in a List. If found, the element should be replaced with a 
string having only half of the characters in the actual string

Method Name 	        modifyElement 
Method Description 	Search for an element in the arraylist and modifies it. 
Argument 	        List<String> arrayList , String element 
Return Type 	        List 

Logic:
Accept an arraylist and search for an element in the list and replace with a string having only first half of 
the characters in the actual string. 
For Example if a search was done for APPLE and if APPLE is found in the list, replace it with APP. 
Return the modified list 

Hint: 
Iterate through list and find the index where the String is present. 
Take the first half of the String and set it at that index in the arraylist. (Use set method) 
Accept an arraylist and search for an element in the list and replace with a string having only first half of
the characters in the actual string. 
For Example if a search was done for APPLE and if APPLE is found in the list, replace it with APP. 
Return the modified list 
Hint: 
Iterate through list and find the index where the String is present. 
Take the first half of the String and set it at that index in the arraylist. (Use set method)
 */

import java.util.List;
import java.util.ArrayList;

public class ReplaceString {
	public ArrayList<String> modifyElement(List<String> arraylist, String element)
	{
		String s=element.substring(0,element.length()/2+1);
		
		ArrayList<String > al=new ArrayList<String>(arraylist);
		
		//System.out.println(al.size());
		System.out.println();
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)==element)
           
				al.set(i, s);
				
		}
		//System.out.println(al);
		return al;
	}
	
	public static void main(String[] args) {
		ReplaceString obj =new ReplaceString();
		List<String > l=new ArrayList<String >();
		l.add("Rakesh");
		l.add("Aryan");
		l.add("Prince");
		l.add("Ravi");
		l.add("Apple");
		l.add("Sohani");
		l.add("Rahul");
		System.out.println("Original Data \n"+l);
		
		ArrayList<String > al=obj.modifyElement(l,"Apple");
		System.out.println("After modifying Data \n"+al);
		
	}

}
