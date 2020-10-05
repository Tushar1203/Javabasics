package test_package;

public class Perfect_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,sum=0;
		
		for(i=1;i<=100;i++)
		{
			
			for(j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			
			if(sum==i)
			{
				System.out.println(i+" is Perfect Number");
				sum=0;
			}
			
		}
	}

}
