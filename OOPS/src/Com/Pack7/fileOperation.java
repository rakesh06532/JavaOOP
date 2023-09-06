package Com.Pack7;

import java.io.FileReader;
import java.io.FileWriter;
public class fileOperation {
	public void meth() throws Exception 
	{
		//Reading data
		FileReader fr=new FileReader("E:\\Javap\\check1.java");
		int x;
		while((x=fr.read())!=-1)
		{
			System.out.print((char)x);
		}
		System.out.println();
		fr.close();
	}
	public void meth2() throws Exception 
	{
		//Writing data
		FileWriter fw=new FileWriter("E:\\Javap\\check4.java");
		String data="Java is awesome";
		fw.write(data);
		fw.close();
		System.out.println("Data reterived ");
		
	}
	public void meth3() throws Exception {
		//coping data
		FileWriter fw=new FileWriter("E:\\Javap\\check4.java");
		FileReader fr=new FileReader("E:\\Javap\\Rakesh.java");
		int x;
		while((x=fr.read())!=-1)
		{
			fw.write(x);
		}
		System.out.println("data copied ");
		fr.close();fw.close();
		
	}
	public static void main(String[] args) throws Exception {
		fileOperation obj =new fileOperation();
		//obj.meth();
		//obj.meth2();
		obj.meth3();
	}

}
