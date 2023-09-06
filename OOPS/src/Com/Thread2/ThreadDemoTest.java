package Com.Thread2;

import java.io.IOException;

public class ThreadDemoTest {
	public static void main(String[] args) {
		Thread first=new ThreadDemo("A","a",200L);
		Thread second=new ThreadDemo("B","b",300L);
		Thread third=new ThreadDemo("C","c",500L);
		System.out.println("Press Enter ");
		first.start();
		second.start();
		third.start();
		try {
			System.in.read();
			System.out.println("Enter pressed...\n");
		}
		catch(IOException e) {	
		System.out.println(e);
		}
	}

}
