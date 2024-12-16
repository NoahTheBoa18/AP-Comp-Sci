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
        String player = scanner.nextLine();
        
		System.out.println ("What is your title? Ex: Slayer of Dragons ");
        String title = scanner.nextLine();
        
        System.out.println ("Great! Your name is " + player  + " " + title);
       
       
        System.out.println ("Would you like to be a wizard, warrior, or a rogue ");
        String player1 = scanner.nextLine();
        
        if (player1.equals("warrior"))
        	{
        		System.out.println("You have chosen warrior, fight to the death!");
        	}
		
		else if (player1.equals("wizard"))
			{
				System.out.println("You have chosen wizard, cast some spells!");
			}
		
		else if (player1.equals("rogue"))
			{
				System.out.println("You have chosen rogue, how cunning...");
			}
			
		else if (player1 != "warrior")
			{
				System.out.println("Please rerun the program and choose again from the choices above");
			}
			
		
		
		else if (player1 != "wizard")
			{
				System.out.println("Please rerun the program and choose again from the choices above");
			}
			
			
		else if (player1 != "rogue")
			{
				System.out.println("Please rerun the program and choose again from the choices above");
			}
			
		System.out.println(" ");
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. You can only spend up to 10 points on each. Spend them wisely.");



		int p = 20;


		System.out.println(" ");
		System.out.println("You have " + p + " points to spend");
		System.out.print("Strength 1-10: ");
        int Strength = scanner.nextInt();
        
        p = p - Strength;
        if (Strength > 10) {
        	System.out.println("Pick a number less than or equal to 10");
        
        if (Strength < 10)
			
				System.out.println("Please rerun the program and choose a number less than or equal to 10");
			}
        
        
        System.out.println(" ");
        System.out.println("You have " + p + " points to spend");
        System.out.print("Dexterity 1-10: ");
        int Dexterity = scanner.nextInt();
        
        p = p - Dexterity;
        if (Dexterity > 10) {
        	System.out.println("Pick a number less than or equal to 10");
        
        if (Dexterity < 10)
			
				System.out.println("Please rerun the program and choose a number less than or equal to 10");
			}
        
        
        System.out.println(" ");
        System.out.println("You have " + p + " points to spend");
        System.out.print("Intelligence 1-10: ");
        int Intelligence = scanner.nextInt();
        
        p = p - Intelligence;
        if (Intelligence > 10) {
        	System.out.println("Pick a number less than or equal to 10");
        
        if (Intelligence < 10)
			
				System.out.println("Please rerun the program and choose a number less than or equal to 10");
				
			}
        
        
        
        System.out.println(" ");
        System.out.println("You have " + p + " points to spend");
        System.out.print("Charisma 1-10: ");
        int Charisma = scanner.nextInt();
        
        p = p - Charisma;
        if (Charisma > 10) {
        	System.out.println("Pick a number less than or equal to 10");
        
        if (Charisma < 10)
			
				System.out.println("Please rerun the program and choose a number less than or equal to 10");
			}
			
		System.out.println(" ");
		System.out.println("______________________________________________________________");
		System.out.println("You are " + player + title + "!");
		System.out.println("You're a " + player1 + " with the following stats!");
		System.out.println("Strength- " + Intelligence);
		System.out.println("Dexterity- " + Intelligence);	
		System.out.println("Intelligence- " + Intelligence);	
		System.out.println("Charisma- " + Charisma);
		
        
	}
}
