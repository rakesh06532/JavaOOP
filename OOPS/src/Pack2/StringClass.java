package Pack2;

public class StringClass {
	public void meth()
	{
		String st=null;
		String str="  ";
		System.out.println(st);
		//System.out.println(st.isBlank());
		System.out.println(str.isBlank());
		System.out.println(str.isEmpty());
	}
	public static void main(String[] args) {
		StringClass obj=new StringClass();
		obj.meth();
	}

}
