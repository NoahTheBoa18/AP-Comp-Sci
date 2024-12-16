/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Guess a random number 0-1000");
    	int y = sc.nextInt();
        
        System.out.print("This was the correct number: ");
		int x = (int)(Math.random() * 1001);
		System.out.println(x);
	
		
		
		
		
		
	}
	
}
