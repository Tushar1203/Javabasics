package test_package;

import java.util.Scanner;

public class Smallest_And_Greatest_Int {

	public static void main(String[] args) {
		
		
		int[] arr = new int[5];
		int greatest,smallest;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 5 numbers");
		
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		greatest = arr[0];
		System.out.println("<---------- OUTPUT ---------->");
		for(int i=1;i<arr.length;i++)
		{
			if(greatest<arr[i])
			{
				greatest=arr[i];
			}			
		}
		System.out.println("Greatest Number : "+greatest);
		smallest = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(smallest>arr[i])
			{
				smallest=arr[i];
			}			
		}
		System.out.println("Smallest Number : "+smallest);
		sc.close();

	}

}
