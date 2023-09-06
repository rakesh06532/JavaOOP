package Com.Collections;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetClass {
	public void meth()
	{
		System.out.println("Implementing set interface ");
		//TreeSet<Object> set=new TreeSet<Object>();
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(95);
		//ts.add("Java");
		//ts.add(null);
		//ts.add(true);
		ts.add(10);
		//ts.add("Rakesh");
		ts.add(90);
		ts.add(25);
		ts.add(40);
		System.out.println(ts);
		System.out.println("Reteriving the data using iterator ");
		//Iterator<Object> it=set.iterator();
		Iterator<Integer> i=ts.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println("==================================");
		System.out.println("TailsSet() "+ts.tailSet(25));
		System.out.println("HeadSet() "+ts.headSet(25));
		System.out.println(ts);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Reteriving data using iterator on descending order ");
		Iterator<Integer> i2=ts.descendingIterator();
		while(i2.hasNext())
		{
			System.out.print(i2.next()+" ");
		}
	}
	public static void main(String[] args) {
		TreeSetClass obj =new TreeSetClass();
		obj.meth();
	}

}
