package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	public Spiderman(){ // Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	actor = "Unknown";
	age = 0;
	villain = "Unknown";
	}
	public Spiderman(String act){// String Actor constructor! 			Age - 0, Villain Unknown 
	actor = act;
	age = 0;
	villain = "Unknown";
	}
	public Spiderman(int ag){// int Age constructor! 				Actor - Unknown, Villain Unknown
	actor = "Unknown";
	age = ag;
	villain = "Unknown";
	}
	public Spiderman(String act, int ag){// String Actor, int Age constructor! 	Villain Unknown
	actor = act;
	age = ag;
	villain = "Unknown";
	}
	public Spiderman(String act, int ag, String Vill){// String Actor, int Age, String Villain constructor!		
	actor = act;
	age = ag;
	villain = Vill;
	}
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	public void setActor(String Actor){
	actor = Actor;
	}
	public String getActor(){
	return actor;
	}

	public void setAge(int Ag){
	age = Ag;
	}
	public int getAge(){
	return age;
	}

	public void setVillain(String Villain){
	villain = Villain;
	}
	public String getVillain(){
	return villain;
	}
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
