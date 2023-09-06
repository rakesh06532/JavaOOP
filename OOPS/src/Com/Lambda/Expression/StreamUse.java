package Com.Lambda.Expression;

import java.util.ArrayList;
import java.util.Scanner;
//import java.util.stream.Stream;

public class StreamUse {
	public void meth1()
	{
		ArrayList<String > al=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 name ");
		for(int i=0;i<5;i++)
		{
			al.add(sc.next());
		}
		System.out.println(al);
		sc.close();
	/*	Stream<String> s1=al.stream();
		Stream<String> s2=s1.filter(data->data.length()<=5);
		long count=s2.count();
		
		System.out.println(count);  */
		System.out.println(al.stream().filter(data->data.length()<=5).count());
		
	}
	public static void main(String[] args) {
		new StreamUse().meth1();
	}

}
