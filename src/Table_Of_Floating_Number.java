package test_package;

public class Table_Of_Floating_Number {
	
	
	//double d=3.0;
	
	void table_of_number(double d)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(d*i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Table_Of_Floating_Number tof = new Table_Of_Floating_Number();
		tof.table_of_number(3.0);

	}

}
