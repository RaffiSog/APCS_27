/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import javax.swing.plaf.synth.SynthStyle;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int money = 100;
		int wager = 0;
		System.out.println("Slot Machine Rules: "); 
		System.out.println("1. Each player starts with $100."); 
		System.out.println("2. Input a wager less than your total amount of money."); 
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10."); 
		System.out.println("   a. If two numbers match, you double your money."); 
		System.out.println("   b. If three numbers match, you triple your money."); 
		System.out.println("   b. If three numbers match, you triple your money."); 
		System.out.println("   c. If none match, you lose your money."); 
		System.out.println("--------------------------------------------------"); 
		System.out.println(""); 
		Scanner sc = new Scanner(System.in);

		
		while (money>0){
		wager = 0;
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y) :"); 
		String play = sc.nextLine();
			
		if (play.equalsIgnoreCase("y") || play.equalsIgnoreCase("yes")){
		System.out.print("You have $" + money + ". How much would you like to wager? ");
		wager = sc.nextInt();
		sc.nextLine();
		
		while (wager <= 0 || wager>money){
		if (wager>money){
		System.out.print ("You only have $" + money + "! Please enter a smaller number : ");
		}
		if (wager <= 0){
		System.out.println ("Sneaky! No negatives or 0!");
		System.out.print("Please enter a smaller number :");
		}
		wager = sc.nextInt();
		sc.nextLine();
		}

		System.out.println("Great! Let's play!!!");
		System.out.println("Your rolls are: ");
		System.out.println("_______________________");
		int n1 = (int)(Math.random()*10)+1;
		int n2 = (int)(Math.random()*10)+1;
		int n3 = (int)(Math.random()*10)+1;
		System.out.println(" | " + n1 + "| " + n2 +" | " + n3 + " |");
		System.out.println("_______________________");
		if (n1 == n2 && n2 == n3){
		System.out.println("You won! You're wager has now been tripled!");
		money = money + 2*wager;
		System.out.println("You now have $" + money + ".");
		}
		else if (n1 == n2 || n1 == n3 || n2 == n3){
		System.out.println("You won! You're wager has now been doubled!");
		money = money + wager;
		System.out.println("You now have $" + money + ".");
		}
		else {
		System.out.println("Didn't win this time, better luck next time!");
		money = money - wager;
		System.out.println("You now have $" + money + ".");
		}
		System.out.println();
		System.out.println("--------------------------------------------------");
		System.out.println();
		}
		else if (play.equalsIgnoreCase("n") || play.equalsIgnoreCase("no")){
		System.out.println("Sad to see you go! You still have $" + money + "left. Come again soon! Thanks!");
		break;
		}
		else {
		System.out.println("That wasn't quite the correct answer. Try again.");
		System.out.println("--------------------------------------------------");
		continue;
		}
		}

	}
}

