package Com.Pack7;

//import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileOperation2 {
	void meth1() throws Exception {
//		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("E:\\Javap\\check1.java"));
//		System.out.println("Connection created ");
//		int x;
//		while((x=bis.read())!=-1)
//		{
//			System.out.print((char)x);			
//		}
//		System.out.println();
//		System.out.println("Data retrieved ");
//		bis.close();
	}
	void meth2() throws Exception {
		FileOutputStream fos=new FileOutputStream("E:\\javap\\check6.java",true);
		System.out.println("Enter sentance ");
		Scanner sc=new Scanner(System.in);
		String data=sc.nextLine();
		fos.write(data.getBytes());
		sc.close();fos.close();
	}
	void meth3() throws Exception {
		BufferedOutputStream bis=new BufferedOutputStream(new FileOutputStream("E:\\javap\\check6.java"));
		bis.close();
	}
	public static void main(String[] args) throws Exception {
		FileOperation2 obj=new FileOperation2();
		try
		{
			obj.meth1();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		obj.meth2();
	}

}
