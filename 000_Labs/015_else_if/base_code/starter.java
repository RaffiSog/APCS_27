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
		int Comp = (int)(Math.random()*1000)+1;
		System.out.print("Pick a number between 1 - 1000: ");
		int Player = sc.nextInt();

		if (Comp > Player){
		System.out.println("Your number was smaller than the number. The number was " + Comp + " .");
		}
		else if (Comp < Player){
		System.out.println("Your number was larger than the number. The number was " + Comp + " .");
		}
		else if (Comp == Player){
		System.out.println("You picked the right number!");
		}


	}
}
