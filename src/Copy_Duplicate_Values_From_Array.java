package test_package;

import java.util.Scanner;

public class Copy_Duplicate_Values_From_Array {

	public static void main(String[] args) {


		int[] arr = new int[5];int count=0;
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
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;i<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count+=2;
				}
			}
		}
		
		
		
		sc.close();

	}

}
