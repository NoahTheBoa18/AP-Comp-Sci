/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        
        
        //NUMBER 1
        if (num1 % 2 == 0) {
        	System.out.println("The first number is even");
        }
        else {
        	System.out.println("The first number is odd");
        }
        
        
        
        //NUMBER 2
        if (num2 % 2 == 0) {
        	System.out.println("The second number is even");
        }
        else {
        	System.out.println("The second number is odd");
        }
        
        
        //NUMBER 1
        if (num1 % 3 == 0) {
        	System.out.println("The first number is divisble by 3");
        }
        else {
        	System.out.println("The first number is not divisble by 3");
        }
        
        
        
        //NUMBER 1
        if (num1 % 4 == 0) {
        	System.out.println("The first number is divisble by 4");
        }
        else {
        	System.out.println("The first number is not divisble by 4");
        }
        
        
        
        //NUMBER 1
        if (num1 % 5 == 0) {
        	System.out.println("The first number is divisble by 5");
        }
        else {
        	System.out.println("The first number is not divisble by 5");
        }
        
        
        System.out.println(" ");

        
        
        //NUMBER 2
        if (num2 % 3 == 0) {
        	System.out.println("The second number is divisble by 3");
        }
        else {
        	System.out.println("The second number is not divisble by 3");
        }
        
        
        
        //NUMBER 2
        if (num2 % 4 == 0) {
        	System.out.println("The second number is divisble by 4");
        }
        else {
        	System.out.println("The second number is not divisble by 4");
        }
        
        
        
        //NUMBER 2
        if (num2 % 5 == 0) {
        	System.out.println("The second number is divisble by 5");
        }
        else {
        	System.out.println("The second number is not divisble by 5");
        }

        
		
	}
}
