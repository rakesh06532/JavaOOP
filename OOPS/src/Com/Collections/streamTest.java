package Com.Collections;

public class streamTest {
	public void sortElements()
	{
		streamDemo x=() -> System.out.println("Hello world");
		x.sortElements();
	}
	public static void main(String[] args) {
		new streamTest().sortElements();
	}

}
