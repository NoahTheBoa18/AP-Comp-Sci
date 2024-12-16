/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	 
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Please enter your number to check if its prime or not");
		 int num1 = sc.nextInt();
		 
		while(true){
			if (num1 % 1 == 0) {
				System.out.println(" Your number is prime");
				break;
			}
			
		}
		
			while(true){
			if (num1 % num1 == 0) {
				System.out.println(" Your number is prime");
				break;
			}
			
		}
		
			while(true){
			if (num1 % 1 != 0) {
				System.out.println(" Your number is NOT prime");
				break;
			}
			
		}
		
			while(true){
			if (num1 % num1 != 0) {
				System.out.println(" Your number is NOT prime");
				break;
			}
			
		}
	}
}
