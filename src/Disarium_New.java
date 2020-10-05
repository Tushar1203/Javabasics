package test_package;

public class Disarium_New {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,num,num1,res,num2,num3;
		
		for(i = 100; i<=200;i++)
		{
			//i=135;
			num=i;
			num3=num%10;
			num=num/10;
			num2=num%10;
			num=num/10;
			num1 = num%10;
			
			res=num1+(num2*num2)+(num3*num3*num3);
			if(res == i)
			{
				System.out.println(i+" is Disarium Number");
			}
		}
		
	
	}



}
