/*
 *	Author:	
 *  Date:	
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a number for x");
		 int x = sc.nextInt();
		 
	System.out.println("Please enter a number for y");
		 int y = sc.nextInt();
		 
	
	double base = x;
	double exponent = y;
	double result = Math.pow(base, exponent);		
		 
	System.out.println(Math.pow(x,y));
	
	
	
	}
}