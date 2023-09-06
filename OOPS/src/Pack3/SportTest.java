package Pack3;

class Hockey{
	void game() {
		System.out.println("Hockey game class Method");
	}
	
}
class Football{
	void game() {
		System.out.println("Football game class Method");
	}
}

public class SportTest {
	
	public static void main(String[] args) {
		Hockey hobj = new Hockey();
		hobj.game();
		Football fobj = new Football();
		fobj.game();
	}

}
