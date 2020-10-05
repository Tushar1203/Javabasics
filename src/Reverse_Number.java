package test_package;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any three digit number : ");
		int n=sc.nextInt();
		Reverse_Number rn=new Reverse_Number();
		rn.reverse_func(n);
		sc.close();
	}
	
	void reverse_func(int num)
	{
		int rem,quo,rev;
		rem=num%10;
		quo=num/10;
		rev=rem*100;
		rem=quo%10;
		quo=quo/10;
		rev=rev+(rem*10);
		rem=quo%10;
		rev=rev+(rem*1);
		System.out.println("Reverse Number : "+rev);
	}


}
