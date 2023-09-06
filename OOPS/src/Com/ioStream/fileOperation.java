package Com.ioStream;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class fileOperation {
	
	public void meth() throws Exception {
		System.out.println("implementing data stream ");
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("E:\\javap\\check.java"));
		System.out.println("Connection created ");
		dos.writeInt(1000);
		dos.writeChar('c');
		dos.writeBoolean(true);
		dos.writeInt(2000);
		System.out.println("Data entered ");
		dos.close();
		System.out.println("================================");
		DataInputStream dis=new DataInputStream(new FileInputStream("E:\\javap\\check6.java"));
		System.out.println(dis.readInt());
		System.out.println(dis.readChar());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readInt());
		System.out.println("================================");
		System.out.println("Data reterived ");
		dis.close();
	}
	public static void main(String[] args) throws Exception {
		fileOperation obj=new fileOperation();
		obj.meth();
		
	}

}
