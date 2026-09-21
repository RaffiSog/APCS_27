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
		
		System.out.print("A number between 0 - 9: ");
		System.out.println((int)(Math.random()*10));
		System.out.print("A number between 1 - 10: ");
		System.out.println((int)(Math.random()*10 + 1));
		System.out.print("A number between 2.5 - 3.5: ");
		System.out.println((Math.random()+2.5));
		System.out.print("A double between 14 - 589: ");
		System.out.println((Math.random()*575+14));
	}
}
