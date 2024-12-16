/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println ("Would you like to be a wizard, warrior, or a rogue ");
        String player = scanner.nextLine();
        
        if (player.equals("warrior"))
        	{
        		System.out.println("You have chosen warrior, fight to the death!");
        	}
		
		else if (player.equals("wizard"))
			{
				System.out.println("You have chosen wizard, what spells will you cast?");
			}
		
		else if (player.equals("rogue"))
			{
				System.out.println("You have chosen rogue, how cunning...");
			}
			
		else if (player != "warrior")
			{
				System.out.println("Please rerun the program and choose again from the choices above");
			}
			
		
			
		else if (player != "wizard")
			{
				System.out.println("Please rerun the program and choose again from the choices above");
			}
			
			
		else if (player != "rogue")
			{
				System.out.println("Please rerun the program and choose again from the choices above");
			}
		
		}
}
