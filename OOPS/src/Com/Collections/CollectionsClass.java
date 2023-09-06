package Com.Collections;
/*
Create a method which can perform the following operations on two String objects S1 and S2. The output of each operation 
should be added to an arraylist and the arraylist should be returned.(Assume S2 is of smaller size) 
Examples for below statements are shown in the Logic part 
1. Character in each alternate index of S1 should be replaced with S2 
2. If S2 appears more than once in S1, replace the last occurrence of S2 in S1 with the reverse of S2, else return S1+S2 
3. If S2 appears more than once in S1, delete the first occurrence of S2 in S1, else return S1 
4. Divide S2 into two halves and add the first half to the beginning of the S1 and second half to the end of S1. 

Note: If there are odd number of letters in S2, then add (n/2)+1 letters to the beginning and the remaining letters
to the end. (n is the number of letters in S2) 
5. If S1 contains characters that is in S2 change all such characters to * 

Method Name 	        modifyStrings 
Method Description 	Perform the above mentioned actions on a String 
Argument 	        String,String 
Return Type 	        Arraylist
 
Logic :Do the above mentioned actions on the entered String. 
For Example 
S1=”JAVAJAVA” 
S2=”VA’ 
1. VAAVAAVAAVAA (J replaced with VA, V replaced with VA etc.) 
2. JAVAJAAV 
3. JAJAVA 
4. VJAVAJAVAA 

*/

import java.util.LinkedList;

public class CollectionsClass {
	
	public LinkedList<String> modifyStrings(String s1,String s2)
	{
		LinkedList<String > ll=new LinkedList<String>();
		//s1=s1.replaceAll("J", s2);
		s1=s1.replaceAll("V", s2);
		ll.add(s1);
		//System.out.println(ll);
		return ll;
		
	}
	public LinkedList<String> modifyString(String s1, String s2)
	{
		LinkedList<String > ll=new LinkedList<String>();
		String s3="";
		for(int i=s2.length()-1;i>=0;i--)
		{
			s3=s3+s2.charAt(i)+"";
		}
		
		String s=s3+s1;
		System.out.println(s);
		s=s.replace("VAAV", s3);
		ll.add(s);
		
		return ll;
		
	}
	
	public static void main(String[] args) {
		CollectionsClass obj=new CollectionsClass();
		
		String s1="JAVAJAVA";
		String s2="J";
		LinkedList<String> l1=obj.modifyStrings(s1, s2);
		System.out.println(l1);
		LinkedList<String >l2=obj.modifyString(s1, s2);
		System.out.println(l2);
		
	}

}
