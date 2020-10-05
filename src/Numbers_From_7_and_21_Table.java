package test_package;

public class Numbers_From_7_and_21_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		
		for(i=1;i<=500;i++)
		{
			if(i%7==0 && i%21==0 && i<=210)
			{
				System.out.println("Number "+i+" is present in the table of 7 as well as 21");
				
			}

		}

	}

}
