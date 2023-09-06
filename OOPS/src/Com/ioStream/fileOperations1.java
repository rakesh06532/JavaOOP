package Com.ioStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class fileOperations1 {
	void meth1() throws Exception {
		System.out.println("Implementing byte stream ");
		FileInputStream fis=new FileInputStream("E:\\Javap\\Test.java");
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println();
			System.out.println("Data entered ");
			fis.close();
		}
		
		void meth2() throws Exception {
			System.out.println("Writing data into a file ");
			FileOutputStream fos =new FileOutputStream("E:\\Javap\\file1.java",true);
			Scanner sc=new Scanner(System.in);
			System.out.println("Please eneter your wish ");
			String wish=sc.nextLine();
			byte arr[]=wish.getBytes();
			fos.write(arr);
			System.out.println("Data entered ");
			sc.close();
			fos.close();
		}
		void meth3() throws Exception {
			System.out.println("Copy the data from one file to another file ");
			FileInputStream fis=new FileInputStream("E:\\Javap\\file1.java");
			FileOutputStream fos=new FileOutputStream("E:\\Javap\\Test.java");
			int i;
			while((i=fis.read())!=-1)
			{
				fos.write((char)i);
			}
			System.out.println("Data copied ");
			fis.close();fos.close();
		}
		void meth4() throws Exception {
			System.out.println("Copying the video  ");
			FileInputStream fis=new FileInputStream("E:\\Folder\\mix\\p5.mp4");
			FileOutputStream fos=new FileOutputStream("E:\\Folder\\wonderla\\p3.mp4");
			int i;
			while((i=fis.read())!=-1)
			{
				fos.write((char)i);
			}
			System.out.println("Image copied ");
			fis.close();fos.close();
		}
	public static void main(String[] args) throws Exception {
		fileOperations1 obj=new fileOperations1();
		obj.meth1();
		//obj.meth2();
		//obj.meth3();
		//obj.meth4();
	}
	}


