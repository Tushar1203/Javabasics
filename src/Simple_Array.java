package test_package;

import java.util.Scanner;

public class Simple_Array {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 5 numbers");
		
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("<---------- OUTPUT ---------->");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
