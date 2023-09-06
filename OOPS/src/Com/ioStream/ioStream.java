package Com.ioStream;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class ioStream {

	public void meth1() throws Exception 
	{
		FileInputStream fis=new FileInputStream("E:\\Javap\\check.java");
		//FileOutputStream fos=new FileOutputStream("E:\\Javap\\check.java");
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		fis.close();
		
	}
	public void meth2() throws Exception 
	{
		FileInputStream fis=new FileInputStream("E:\\Javap\\check.java");
		FileOutputStream fos=new FileOutputStream("E:\\Javap\\check2.java",true);
		int i;
		while((i=fis.read())!=-1)
		{
			fos.write((char)i);
		}
		fis.close();fos.close();
	}
	public void meth3() throws Exception 
	{
		FileOutputStream fos=new FileOutputStream("E:\\Javap\\check3.java",true);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sentance ");
		String word=sc.nextLine();
		byte arr[]=word.getBytes();

		fos.write(arr);
		System.out.println("Data entered ");
		fos.close();sc.close();
	
	}
	public static void main(String[] args) throws Exception {
		ioStream obj=new ioStream();
		obj.meth1();
		//obj.meth2();
		//obj.meth3();
	}
}
