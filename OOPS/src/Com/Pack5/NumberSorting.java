package Com.Pack5;

public class NumberSorting {
	public void getNumber(String st)
	{
		char arr[]=st.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=48 && arr[i]<=57)
				System.out.print(arr[i]);
		}
		System.out.println();
	}
	public void multiplication(int num1,int num2)
	{
		int result=0;
		for(int i=1;i<=num2;i++)
		{
			
			 result=result+num1;
			 
		}
		System.out.println(result);
		System.out.println();
	}
	public void reverseNumber(int num)
	{
		if(num<10)
		{
			System.out.print(num);
			
		}
		else
		{
			System.out.print(num%10);
			reverseNumber(num/10);
		}
		
		
	}
	public void changeNumber(int num)
	{
		int rem;
		int sum=0;
		System.out.println();
		while(num!=0)
		{
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		
		while(sum!=0)
		{
			rem=sum%10;
			
			switch(rem)
			{
			case 0: System.out.print("Zero ");
		        	break;
			case 1: System.out.print("One ");
			        break;
			case 2: System.out.print("Two ");
			        break;
			case 3: System.out.print("Three ");
			        break;
			case 4: System.out.print("Four ");
			        break;
			case 5: System.out.print("Five ");
			        break;
			case 6: System.out.print("Six ");
			        break;
			case 7: System.out.print("Seven ");
			        break;
			case 8: System.out.print("Eight ");
			        break;
			case 9: System.out.print("Nine ");
			
			}
		
			sum=sum/10;
		}
		
	}
	
//	public void fibonacci(int num)
//	{
//		for(int i=0;i<=num;i++)
//		{
//		int f1=0,f2=1,f3;
//		System.out.println(f1+" "+f2);
//		f1=f2;
//		
//		}
//	}
	public static void main(String[] args) {
		NumberSorting obj=new NumberSorting();
		String st="ram1ra45rak3";
		obj.getNumber(st);
		obj.multiplication(9, 6);
		obj.reverseNumber(158745);
		obj.changeNumber(14047693);
		//obj.fibonacci(10);
	}

}
