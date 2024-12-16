/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println ("What is your name? ");
        String name = scanner.nextLine();
        
        System.out.println ("How many times would you like your name to be repeated? ");
        int times = scanner.nextInt();
        
        int count = 0;
        
		while(count <= times)
			{
			System.out.println(name);
			 count = count + 1;
			}

        
        

		
	}
}
