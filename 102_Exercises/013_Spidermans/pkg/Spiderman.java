package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	private String actor;		// What's the actors name?
	private int age;			// What's the age of the actor?
	private String villain;// Who's the arch nemesis of this Spiderman?
	
	
	public Spiderman() {
		this.actor = "unknown";
		this.age = 0;
		this.villain = "unknown"
	}
	
	public Spiderman(int age, String villain) {
		this.actor = "unknown";
		this.age = age;
		this.villain = villain;
	}
	
	public Spiderman(String actor, String villain) {
		this.actor = actor;
		this.age = 0;
		this.villain = villain
	}
	
	public Spiderman(String villain) {
		this.actor = "unknown";
		this.age = 0;
		this.villain = villain
	}
	
		public Spiderman(String actor,int age, String villain) {
		this.actor = actor;
		this.age = age;
		this.villain = villain
	}
	
	
	
	
	public void setActor(String actor) {
		this.actor = actor;
	}
	public string getActor(){
		return actor;
	}
	
	
	
		public void setAge(int age) {
		this.age = age;
	}
	public string getAge(){
		return age;
	}
	
	
	
		public void setVillan(String villain) {
		this.villain = villain;
	}
	public string getVillain(){
		return villain;
	}
	
	
	
	
	
	

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	
	


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
