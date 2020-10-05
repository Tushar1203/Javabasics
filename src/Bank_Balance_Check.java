package test_package;

import java.util.Scanner;

public class Bank_Balance_Check {
	
	String bnkName;
	Double opBal, deposit, withdraw, clBal;
	
	public void bnkDetails(String bnkName,Double opBal)
	{
		this.bnkName = bnkName;
		this.opBal=opBal;
	}
	public void transDetails(Double deposit,Double withdraw)
	{
		this.deposit = deposit;
		this.withdraw=withdraw;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Bank Name : ");
		String bn=sc.next();
		System.out.println("Please enter Opening Balance : ");
		Double ob=sc.nextDouble();
		Bank_Balance_Check bbc=new Bank_Balance_Check();
		bbc.bnkDetails(bn, ob);
		System.out.println("Please enter Deposit Amount : ");
		Double depo = sc.nextDouble();
		System.out.println("Please enter Withdraw Amount : ");
		Double witd = sc.nextDouble();
		bbc.transDetails(depo, witd);
		
		bbc.clBal = bbc.opBal + bbc.deposit - bbc.withdraw;
		
		System.out.println("Closing Balance : "+bbc.clBal);
		sc.close();
	}

}
