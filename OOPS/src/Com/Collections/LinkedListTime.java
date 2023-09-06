package Com.Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTime {
	public static Object arr[];
			static
			{
		arr=new Object[10000];
		for(int i=0;i<arr.length;i++) {
			arr[i]=new Object();
		}
		
			}
			void ArrayListTime()
			{
				long start;
				long end;
			
			ArrayList<Object> al=new ArrayList<Object>();
			start=System.currentTimeMillis();
			for(Object obj1:arr)
			{
				al.add(obj1);
			}
			end=System.currentTimeMillis();
			System.out.println("ArrayList construction time "+(end-start));
			}
			LinkedListTime()
			{
				long start,end;
				LinkedList<Object>ll=new LinkedList<Object>();
				start=System.currentTimeMillis();
				for(Object obj2:arr)
				{
					ll.add(obj2);
				}
				end=System.currentTimeMillis();
				System.out.println("LinkedList constraction Time "+(end-start)); 
			}
			void meth1()
			{
				for(Object o:arr)
					System.out.println(o);
			}
			public static void main(String[] args) {
				LinkedListTime lt=new LinkedListTime();
				lt.ArrayListTime();
				//lt.LinkedListTime();
				lt.meth1();
			}
		
}
