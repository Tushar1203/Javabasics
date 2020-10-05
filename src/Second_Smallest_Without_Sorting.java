package test_package;

import java.util.Scanner;

public class Second_Smallest_Without_Sorting {

	public static void main(String[] args) {
		int[] arr = new int[7];
		int smallest,secondSmallest;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 5 negative numbers");
		
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		smallest = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(smallest>arr[i])
			{
				smallest=arr[i];
			}			
		}
		System.out.println("Smallest Number : "+smallest);
		
		secondSmallest = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(secondSmallest>arr[i] && secondSmallest>smallest)
			{
				int temp=secondSmallest;
				secondSmallest = arr[i];
				smallest=temp;
			}
			System.out.println("Second Smallest : "+secondSmallest);
		}
		
		System.out.println("Second Smallest Number : "+secondSmallest);
		sc.close();

		

	}

}
