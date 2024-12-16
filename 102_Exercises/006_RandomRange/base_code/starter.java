/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
         Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter a random number that you would like your number range to start from");
		 int num1 = sc.nextInt();
		 
		 System.out.println("Enter another number bigger than the first");
         int num2 = sc.nextInt();
		
		System.out.println("Here is your random number-");
		System.out.println((int)(Math.random() * num2) + num1);
		
		
		
	}
}
