/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;

public class MyCharacter3{
	
	String name;
    String title;
    int strength;
    int intelligence;
    int dexterity;
    int constitution;
    int charisma;
	
	Scanner sc = new Scanner(System.in);	
		
	public MyCharacter3(){
		name = "Noah";
        title = " The Dragon Slayer";
        strength = 100;
        intelligence = 100;
        dexterity = 100;
        constitution = 100;
        charisma = 100;
    }
    
    public MyCharacter3(String name, String title, int strength, int intelligence,int constitution, int charisma){
		this.name = name;
        this.title = title;
        this.strength = strength;
        this.intelligence = intelligence;
        this.constitution = constitution;
        this.charisma = charisma;
    }
    
    public void myToString(){
       System.out.print("Your name is " + name);
       System.out.print("You are a " + title);
       System.out.println("Your strength out of 100 is- " + strength);
       System.out.println("Your intelligence out of 100 is- " + intelligence);
       System.out.println("Your dexterity out of 100 is- " + dexterity);
       System.out.println("Your constitution out of 100 is- " + constitution);
       System.out.println("Your charisma out of 100 is- " + charisma);
    }
    
}

