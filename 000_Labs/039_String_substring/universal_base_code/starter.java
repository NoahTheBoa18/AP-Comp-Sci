/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

		// Your code goes below here
		BaseClass test = new BaseClass();
		
		System.out.println ("Enter a random word");
    	String word = sc.nextLine();
    	
    	for(int i = 0; i < word.length(); i++){
    		System.out.println(word.substring(i, i+1));
    	}
    	
    	
    	


		
	}
}
