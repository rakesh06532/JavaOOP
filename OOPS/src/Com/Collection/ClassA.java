package Com.Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ClassA {
	void meth1()
	{
		Integer arr[]= {5,9,7,2,6,1};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr ,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		System.out.println("-----------------");
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(96);
		al.add(1);
		al.add(15);
		al.add(55);
		System.out.println(" al "+al);
		Collections.sort(al);//sorting data ascending order
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		System.out.println("--------------------");
		al.add(null);
		al.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
		//al.sort(Comparator.nullsFirst(Comparator.reverseOrder()));
		//al.sort(Comparator.nullsLast(Comparator.naturalOrder()));
		System.out.println(al);
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(100);
		set.add(200);
		set.add(400);
		set.add(600);
		set.add(900);
		set.add(10);
		System.out.println(set);
		ArrayList<Integer> al2=new ArrayList<Integer>(set);
		Collections.sort(al2);
		System.out.println(al2);
		Collections.sort(al2,Collections.reverseOrder());
		System.out.println(al2);
		ArrayList<UseCompare> al3=new ArrayList<UseCompare>();
		UseCompare obj1=new UseCompare("Rakesh",50000,"Java");
		UseCompare obj2=new UseCompare("Aryan",40000,"Python");
		UseCompare obj3=new UseCompare("Prince",47000,"SQL");
		al3.add(obj3);
		al3.add(obj1);
		al3.add(obj2);
		System.out.println(al3);
		System.out.println("---------------------------");
		Iterator<UseCompare> il=al3.iterator();
		while(il.hasNext())
		{
			System.out.println(il.next());
		}
		System.out.println("=============================");
		Collections.sort(al3);
		System.out.println(al3);
		Iterator<UseCompare> i2=al3.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		
	}
	public static void main(String[] args) {
		new  ClassA().meth1();
	}

}
