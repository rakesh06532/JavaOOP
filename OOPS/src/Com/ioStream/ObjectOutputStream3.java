package Com.ioStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectOutputStream3 {
	
	void display() throws Exception {
		
		ObjectOutputStream1 aobj1=new ObjectOutputStream1();
		ObjectOutputStream2 bobj1=new ObjectOutputStream2();
		System.out.println("Performing serializable ");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\javap\\check.ser"));
		System.out.println("Connection created ");
		
	oos.writeObject(aobj1);
	oos.writeObject(bobj1);
	System.out.println("Serialization process complete ");
	ObjectInputStream ois=new ObjectInputStream(new FileInputStream("E:\\javap\\check.ser"));
	
	ObjectOutputStream1 aobj2=(ObjectOutputStream1)ois.readObject();
	ObjectOutputStream2 bobj2=(ObjectOutputStream2)ois.readObject();
	
	System.out.println(aobj2.a+" "+aobj2.b);
	System.out.println(bobj2.x+" "+bobj2.y);
	ois.close();
	oos.close();
	}
	public static void main(String[] args)throws Exception {
		new ObjectOutputStream3().display();
	}

}
