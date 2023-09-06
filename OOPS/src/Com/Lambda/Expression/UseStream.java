package Com.Lambda.Expression;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class UseStream {
	public void meth1()
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(25);
		al.add(1);
		al.add(23);
		al.add(56);
		al.add(85);
		al.add(69);
		Stream<Integer> s1=al.stream();
		Stream<Integer> s2=s1.map(data->data*2);
		ArrayList<Integer>al2=(ArrayList<Integer>)s2.collect(Collectors.toList());
		System.out.println(al2);
		List<Integer> li=al.stream().map(data->data*2).collect(Collectors.toList());
		System.out.println(li);
		List<Integer> li2=al.stream().collect(Collectors.toList());
		System.out.println(li2);
	}
	public static void main(String[] args) {
		new UseStream().meth1();
	}

}
