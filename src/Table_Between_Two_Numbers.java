package test_package;

import java.util.Scanner;

public class Table_Between_Two_Numbers {
	
	
	void table_of_num(int a, int b)
	{
		for(int j=a;j<=b;j++)
		{
			System.out.println("Table of : "+j);
			for(int i=1;i<=10;i++)
			{			
				System.out.println(j*i);
			}
			System.out.println("==============");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter value of first number : ");
		int fv=sc.nextInt();
		System.out.println("Please enter value of second number : ");
		int sv=sc.nextInt();
		System.out.println("-----------------------------------------");
		Table_Between_Two_Numbers tbtn = new Table_Between_Two_Numbers();
		tbtn.table_of_num(fv, sv);
		sc.close();
	}

}
