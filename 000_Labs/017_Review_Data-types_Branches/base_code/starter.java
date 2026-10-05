/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String Name = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String Title = sc.nextLine();

		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?"); 
		String Role = sc.nextLine();
		if (Role.equalsIgnoreCase("Wizard")){
		System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if (Role.equalsIgnoreCase("Warrior")){
		System.out.println("You've chosen the Warrior! For honor!");
		}
		else if (Role.equalsIgnoreCase("Rogue")){
		System.out.println("You've chosen the Rogue! How cunning!");			
		}
		else {
		System.out.println("You've decided not to chose a role. Rerun program.");
		}
		System.out.println();

		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		System.out.println();
		int PointsLeft = 20;
		
		System.out.print("Strength (1-10):" ); 
		int Strength = sc.nextInt();
		PointsLeft = 20;
		if (Strength > 10){
		System.out.print("Please input a smaller value. Strength (1-10): ");
		Strength = sc.nextInt();
		}
		PointsLeft = 20 - Strength;
		System.out.println("You have " + PointsLeft + " left to spend.");
		System.out.println();

		System.out.print("Dexterity (1-10):" ); 
		int Dexterity = sc.nextInt();
		if (Dexterity > 10 || Dexterity > PointsLeft){
		System.out.print("Please input a smaller value. Dexterity (1-10): ");
		Dexterity = sc.nextInt();
		}
		PointsLeft = PointsLeft - Dexterity;
		System.out.println("You have " + PointsLeft + " left to spend.");
		System.out.println();
		
		System.out.print("Intelligence (1-10):" ); 
		int Intelligence = sc.nextInt();
		if (Intelligence > 10 || Intelligence > PointsLeft){
		System.out.print("Please input a smaller value. Intelligence (1-10): ");
		Intelligence = sc.nextInt();
		}
		PointsLeft = PointsLeft - Intelligence;
		System.out.println("You have " + PointsLeft + " left to spend.");
		System.out.println();

		System.out.print("Charisma (1-10):" ); 
		int Charisma = sc.nextInt();
		if (Charisma > 10 || Charisma > PointsLeft){
		System.out.print("Please input a smaller value. Charisma (1-10): ");
		Charisma = sc.nextInt();
		}
		PointsLeft = PointsLeft - Charisma;
		System.out.println("You have " + PointsLeft + " left to spend.");
		System.out.println();




		System.out.println("--------------------------------------------------");
		System.out.println("You are " + Name + ", the " + Title + " of CVHS.");
		System.out.println("You're a " + Role + " with the following stats!");
		System.out.println("Strength - " + Strength);
		System.out.println("Dexterity - " + Dexterity);
		System.out.println("Intelligence - " + Intelligence);
		System.out.println("Charisma - " + Charisma);

		System.out.println();
		System.out.println("Good luck on your quest " + Name + "!");



	}
}
