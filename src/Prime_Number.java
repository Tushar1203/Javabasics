package test_package;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 11,c=0;
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				c++;
			}
			
		}
		
		if(c>0)
		{
			System.out.println("Number "+num+" is not prime");
		}
		else
		{
			System.out.println("Number "+num+" is prime");
		}

	}

}
