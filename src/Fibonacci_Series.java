package test_package;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=1,n2=1,n3,i;
		System.out.print(n1+" "+n2);
		
		for(i=2;i<10;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
		}
		

	}

}
