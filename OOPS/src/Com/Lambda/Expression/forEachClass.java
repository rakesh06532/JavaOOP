package Com.Lambda.Expression;

import java.util.ArrayList;
import java.util.Iterator;

public class forEachClass {
	void meth1()
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(1);
		al.add(20);
		al.add(23);
		al.add(15);
		al.add(52);
		System.out.println(al);
		System.out.println();
		System.out.println("-------------------------");
		Iterator<Integer> i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println();
		al.forEach(x->System.out.println(x));
	}
	public static void main(String[] args) {
		new forEachClass().meth1();
	}

}
