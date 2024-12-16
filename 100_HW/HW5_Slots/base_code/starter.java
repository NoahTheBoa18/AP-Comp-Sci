/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

        int balance = 100;
        System.out.println("Welcome to the Slot Machine! You start with $100.");

        while (balance > 0) {
            System.out.println("You have $" + balance);
            System.out.print("Enter your wager: ");
            int wager = scanner.nextInt();

            if (wager > balance || wager <= 0) {
                System.out.println("Invalid wager amount.");
              
            }

            int roll1 = random.nextInt(6) + 1;
            int roll2 = random.nextInt(6) + 1;
            int roll3 = random.nextInt(6) + 1;
            System.out.println("Roll: " + roll1 + " " + roll2 + " " + roll3);

            if (roll1 == roll2 && roll2 == roll3) {
                balance += wager * 2;
                System.out.println("JACKPOT! You win $" + (wager * 3));
            } else if (roll1 == roll2 || roll1 == roll3 || roll2 == roll3) {
                balance += wager;
                System.out.println("You matched two! You win $" + (wager * 2));
            } else {
                balance -= wager;  
                System.out.println("No match. You lose $" + wager);
            }

            
        }

        System.out.println("Game over. You have $" + balance + " left.");
        scanner.close();
    }
}
		
	