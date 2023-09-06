package Com.Collections;

import java.util.PriorityQueue;
import java.util.Iterator;

public class priorityQueueClass {
	public void meth()
	{
		PriorityQueue<Object> pq=new PriorityQueue<Object>();
		pq.add(10);
		pq.add(50);
		//pq.add("Rakesh");
		//pq.add(null);
		pq.add(10);
		//pq.add("Rakesh");
		pq.add(96);
		System.out.println(pq);
		Iterator<Object> i= pq.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println();
		System.out.println("============================================");
		System.out.println(pq.poll());//remove and return the first element 
		System.out.println(pq);
		System.out.println(pq.peek());//only return the first element 
		System.out.println(pq);
		System.out.println( pq.remove());//remove and return the first element 
		System.out.println(pq);
		//pq.clear();//clear all element 
		
		System.out.println(pq.remove());
		
	}
	public static void main(String[] args) {
		priorityQueueClass obj=new priorityQueueClass();
		obj.meth();
	}

}
