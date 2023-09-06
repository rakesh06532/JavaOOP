package Com.Thread;

public class ThreadNotify2 {
	public static void main(String[] args) {
		ThreadNotify obj=new ThreadNotify();
		new Thread()
		{
			//Annonymos inner class start here
			public void run()
			{
				try {
					obj.with_draw(15000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
		//Annonymous inner class ends here
		.start();
		new Thread()
		{
			//Annonymos inner class start here 
			public void run()
			{
				obj.diposite(10000);
			}
		}
		//Annonymous inner class ends here 
		.start();
	}

}
