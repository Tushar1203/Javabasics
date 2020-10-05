package test_package;

import java.util.Scanner;

public class Second_Smallest_Number_Negative {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 5 numbers");
		
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		for (int i = 0; i < arr.length; i++) 
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
		System.out.print("Sorted ARRAY : {");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("}");
		System.out.println("Second Smallest : "+arr[(arr.length-2)]);
		sc.close();


	}

}
