/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class MyCharacter4{
	String name;
    String title;
    int charisma;
    int intelligence;
		
	Scanner sc = new Scanner(System.in);	
		
	public MyCharacter4(){
		
		System.out.println ("Whats ur name?");
    	String n = sc.nextString();
		System.out.println ("Whats ur title?");
    	String t = sc.nextString();
    	System.out.println("You have 20 points, spend them wisely")
		System.out.println ("Pick your charisma out of 20");
    	int c = sc.nextInt();
		System.out.println ("Pick your intelligence out of 20");
    	int i = sc.nextInt();
    	System.out.println ("Pick your dexterity out of 20");
    	int d = sc.nextInt();
    	
 
    }
    
    public MyCharacter4(String name, String title, int charisma, int intelligence, int dexterity){
		name = n;
        title = t;
        charisma = c;
        intelligence = i;
        dexterity = d;
    }
    
    public void print(){
       System.out.print("Your name is " + name);
       System.out.println(title);
       System.out.println("Your charisma out of 100 is- " + charisma);
       System.out.println("Your intelligence out of 100 is- " + intelligence);
       System.out.println("Your dexterity out of 100 is- " + dexterity);
       
    }
    
    
    
    
    
}
