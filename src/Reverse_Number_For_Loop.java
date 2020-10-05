package test_package;

import java.util.Scanner;

public class Reverse_Number_For_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number : ");
		int n=sc.nextInt();
		Reverse_Number_For_Loop rnf=new Reverse_Number_For_Loop();
		rnf.reverse_fun(n);
		sc.close();

	}
	
	void reverse_fun(int num)
	{
		int rev=0;
		for(int numb=num;numb!=0;numb/=10)
		{
			int n=numb%10;
			rev=rev*10+n;
		}
		System.out.println("Reverse Number : "+rev);
	}

}
