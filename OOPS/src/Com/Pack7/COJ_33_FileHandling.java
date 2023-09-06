package Com.Pack7;

import java.util.Scanner;
import java.io.FileInputStream;
public class COJ_33_FileHandling {
	public String  searchFile(String s) throws Exception
	{
		@SuppressWarnings("resource")
		FileInputStream fis=new FileInputStream("E:\\Javap\\check1.java");
		if(s==""||s==null)
			return "Enter valid file name";
		if(fis.equals(s)) 
			return "file ("+s+") exist ";
		
		else return s+" File is not found";
	}
	public static void main(String[] args) throws Exception {
		COJ_33_FileHandling obj=new COJ_33_FileHandling();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file name ");
		String data=sc.nextLine();
		System.out.println( obj.searchFile(data));
		sc.close();
		
	}

}
