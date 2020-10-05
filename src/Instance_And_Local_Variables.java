package test_package;

public class Instance_And_Local_Variables {
	
	int a=11;
	String s="Enslin";
	
	public void m1(int a,String b)
	{
		this.a=a;
		this.s=b;
	}

	public static void main(String[] args) 
	{
		Instance_And_Local_Variables il=new Instance_And_Local_Variables();
		il.m1(12, "ENS");
		System.out.println(il.a);
		System.out.println(il.s);
		
		Instance_And_Local_Variables il1=new Instance_And_Local_Variables();
		System.out.println(il1.a);
		System.out.println(il1.s);

	}

}
