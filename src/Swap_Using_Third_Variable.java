package test_package;

import java.util.Scanner;

public class Swap_Using_Third_Variable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter value of first number : ");
		int fv=sc.nextInt();
		System.out.println("Please enter value of second number : ");
		int sv=sc.nextInt();
		System.out.println("-----------------------------------------");
		Swap_Using_Third_Variable sw=new Swap_Using_Third_Variable();
		System.out.println("Value of First Number before swapping : "+fv);
		System.out.println("Value of Second Number before swapping : "+sv);
		System.out.println("-----------------------------------------");
		sw.swap_Numbers(fv, sv);
		sc.close();
	}
	
	void swap_Numbers(int a, int b)
	{
		int temp;
		temp=a+b;
		a=temp-a;
		b=temp-a;
		System.out.println("Value of First Number after swapping : "+a);
		System.out.println("Value of Second Number after swapping : "+b);
	}

}
