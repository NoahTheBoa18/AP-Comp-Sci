/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class MyCharacter2{
	String name;
    String title;
    int strength;
    int intelligence;
		
	Scanner sc = new Scanner(System.in);	
		
	public MyCharacter2(){
		name = "Noah";
        title = " The Dragon Slayer";
        strength = 100;
        intelligence = 100;
        dexterity = 100;
    }
    
    public MyCharacter2(String name, String title, int strength, int intelligence){
		name = n;
        title = t;
        strength = s;
        intelligence = i;
    }
    
    public void print(){
       System.out.print("Your name is " + name);
       System.out.println(title);
       System.out.println("Your strength out of 100 is- " + strength);
       System.out.println("Your intelligence out of 100 is- " + intelligence);
       System.out.println("Your dexterity out of 100 is- " + dexterity);
       
    }
    
    
    
    
    
}
