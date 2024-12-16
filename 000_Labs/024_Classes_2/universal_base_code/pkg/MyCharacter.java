/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class MyCharacter{
	String name;
    String title;
    int strength;
    int intelligence;
		
		
		
	public MyCharacter(){
		name = "Noah";
        title = " The Dragon Slayer";
        strength = 100;
        intelligence = 100;
    }
    
    public void print(){
       System.out.print("Your name is " + name);
       System.out.println(title);
       System.out.println("Your strength out of 100 is- " + strength);
       System.out.println("Your intelligence out of 100 is- " + intelligence);
       
       
    }
    
    
    
    
    
}