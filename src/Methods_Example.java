package test_package;

public class Methods_Example {
	
	int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	int mod(int a,int b)
	{
		int c=a%b;
		return c;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methods_Example me = new Methods_Example();
		System.out.println(me.add(5, 6));
		System.out.println(me.mul(4, 7));
		System.out.println(me.mod(7, 4));
		
		
		
		
		

	}

}
