/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf();
		PooleDwarf a = new PooleDwarf("Dopey", 42);
		PooleDwarf b = new PooleDwarf("Bashful", 13);
		PooleDwarf c = new PooleDwarf("Grumpy", 35);
		PooleDwarf d = new PooleDwarf("Sleepy", 69);
		PooleDwarf e = new PooleDwarf("Sneezy", 85);
		PooleDwarf f = new PooleDwarf("Happy", 27);
		PooleDwarf g = new PooleDwarf("Doc", 21);
	
		
	}
}
