package Com.Collection;

import java.util.TreeSet;
import java.util.Arrays;
import java.util.Iterator;

public class MaxElements {
	public void meth(Integer[]arr,int n,int k)
	{
		
		TreeSet<Integer> ts=new TreeSet<Integer>(Arrays.asList(arr));
		Iterator<Integer> it=ts.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		
		}
	}
	public static void main(String[] args) {
		MaxElements obj=new MaxElements();
		Integer arr[]= {1,2,3,4,5,6,7,8,9};
		int n=arr.length;
		int k=3;
		//ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(arr));
		obj.meth(arr,n,k);
	}

}
