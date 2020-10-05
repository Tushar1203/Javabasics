package test_package;

import java.util.Scanner;

public class Sec_Small {

	public static void main(String[] args) {
		
		
		int[] arr = new int[4];
		int smallest,secondSmallest;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 5 negative numbers");	
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		smallest = arr[0];
		secondSmallest = arr[1];
		
		  for(int i=0;i<arr.length;i++) 
		  { 
			  if(smallest<secondSmallest) 
			  { 
				  smallest=arr[i];
				  secondSmallest=arr[i+1]; 
			  } 
			  else 
			  { 
				  if(smallest>secondSmallest) 
				  {
					  smallest=arr[i+1]; 
					  secondSmallest=arr[i]; 
				  } 
			  } 
		  }
		 
		
		System.out.println("Second Smallest Number : "+smallest);
		System.out.println("Second Smallest Number : "+secondSmallest);
		sc.close();


	}

}
