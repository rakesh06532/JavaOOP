package Com.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListClass {
	public void meth()
	{
		Queue <Object> l=new LinkedList<Object>();
		l.add(10);
		l.add(12);
		l.add("Rakesh");
		l.add(20);
		System.out.println(l);
		LinkedList<Object> ll=new LinkedList<Object>();
		ll.offer(52);//list interface and collection interface
		ll.offer("Aryan");//Queue interface 
		System.out.println(ll);
		
	}
	public static void main(String[] args) {
		QueueLinkedListClass obj=new QueueLinkedListClass();
		obj.meth();
	}

}
