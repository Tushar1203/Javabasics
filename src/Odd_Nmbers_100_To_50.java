package test_package;

public class Odd_Nmbers_100_To_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		
		for(i=100;i>=50;i--)
		{
			if(!(i%2==0))
			//if(i%2!=0)
			{
				System.out.println(i);
			}
		}

	}

}
