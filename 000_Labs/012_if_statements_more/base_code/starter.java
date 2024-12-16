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
		 System.out.println("Please enter your first number");
		 int num1 = sc.nextInt();
		 
		 System.out.println("Please enter your second number");
		 int num2 = sc.nextInt();
	
		if(num1 > num2){
        System.out.println("Number 1 is bigger than Number 2!");
    }
		
		if(num1 < num2){
        System.out.println("Number 2 is bigger than Number 1!");
    }	
    
    	if(num1 == num2){
        System.out.println("Your Numbers are equal!");
    }	
    
    
		
	}
}
