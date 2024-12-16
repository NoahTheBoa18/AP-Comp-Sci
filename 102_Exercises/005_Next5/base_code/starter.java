/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
	    Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number1 = sc.nextInt();
        
        System.out.println("Here are the next five numbers");
        System.out.println(number1 + 1);
        System.out.println(number1 + 2);
        System.out.println(number1 + 3);
        System.out.println(number1 + 4);
        System.out.println(number1 + 5);

        System.out.println("Here are the next five multiples");
        System.out.println(number1 * 1);
        System.out.println(number1 * 2);
        System.out.println(number1 * 3);
        System.out.println(number1 * 4);
        System.out.println(number1 * 5);
        

        System.out.println("Here is the number divided by 100");
        System.out.println(number1 / 100.0);
        
        
        System.out.println("Here is the number divided by 10");
        System.out.println(number1 / 10.0);
	}
}
