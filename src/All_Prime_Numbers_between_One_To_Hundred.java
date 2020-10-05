package test_package;

public class All_Prime_Numbers_between_One_To_Hundred {

	public static void main(String[] args) {
	
		int c=0;
		
		for(int k=2;k<=100;k++)
		{
			if(k%2!=0) //check whether number is odd or even
			{
				
				for(int i=2;i<=k/2;i++)
				{
					if(k%i==0)
					{
						c++;
					}					
				}
				
				if(c==0)				
				{
					System.out.println("Number "+k+" is prime");					
				}
				c=0;				
			}
		}

	}

}
