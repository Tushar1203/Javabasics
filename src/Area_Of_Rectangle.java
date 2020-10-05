package test_package;

import java.util.Scanner;

public class Area_Of_Rectangle {
	
	int area_Of_Rect(int l, int w)
	{
		int areaOfRect= l*w;
		return areaOfRect;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter length and width of a rectangle : ");
		int le=sc.nextInt();
		int wi=sc.nextInt();
		Area_Of_Rectangle aor=new Area_Of_Rectangle();
		int ar = aor.area_Of_Rect(le, wi);
		System.out.println("Area of Rectangle is : "+ar);
		sc.close();
		

	}

}
