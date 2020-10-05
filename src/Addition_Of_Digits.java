package test_package;

public class Addition_Of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=123,num1;
		int rem,quo,sum=0;
		
		num1=num;
		
		rem=num%10;
		quo=num/10;
		
		num=quo;
		sum+=rem;
		
		rem=num%10;
		quo=num/10;
		
		num=quo;
		sum+=rem;
		
		rem=num%10;
		quo=num/10;
		
		num=quo;
		sum+=rem;
		
		System.out.println("Sum of the digits of number "+num1+" is "+sum);
		
		
		
		

	}

}
