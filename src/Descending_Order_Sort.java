package test_package;

import java.util.Scanner;

public class Descending_Order_Sort {

	public static void main(String[] args) {
		
		
		int[] arr = new int[5];
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 10 numbers");
		
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("<---------- OUTPUT ---------->");
		
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("-----------------------------------");
		
		for (int i = 0; i < arr.length; i++) // Main logic for sorting starts here - Bubble Sort
		{
			for (int j = i + 1; j < arr.length; j++) 
			{
				if (arr[i] < arr[j]) 
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" "); // Print sorted array
		}
		
		
		sc.close();

	}

}
