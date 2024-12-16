/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
	
	Scanner scanner = new Scanner(System.in);


        Random random = new Random();
        int numberguess = random.nextInt(1000) + 1;
        
        int playerguess = 0;
        int attemptcount = 0;
        
        System.out.println("Welcome to Noahs Gessing Game");
        System.out.println("Ipicked a number between 1 and 1000. Guess the number");

        while (playerguess != numberguess) {
            System.out.print("Enter your guess: ");
            playerguess = scanner.nextInt();
            attemptcount++;

            if (playerguess < numberguess) {
                System.out.println("Too low! Try again.");
            } else if (playerguess > numberguess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congrats! You guessed the correct number-  " + numberguess + " , in " + attemptcount + " attempts.");
            }
        }

        scanner.close();
    }
}

   


