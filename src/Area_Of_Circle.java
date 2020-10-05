package test_package;

import java.util.Scanner;

public class Area_Of_Circle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter radius of a circle : ");
		int r=sc.nextInt();
		Area_Of_Circle aoc=new Area_Of_Circle();
		aoc.area_Cir(r);
		sc.close();
	}
	
	void area_Cir(int radius)
	{
		Double areaOfCircle = 3.14*(radius*radius);
		System.out.println("Area of Circle is : "+areaOfCircle);
	}

}
