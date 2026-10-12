/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to the guessing game!");
	int x = (int)(Math.random()*1000)+1;
	int y = 0;

	while (y != x) {
	System.out.print("Please guess a number: ");
	y = sc.nextInt();
	if (y < x) {
	System.out.println("The number is higher.");
	}
	if (y > x){
	System.out.println("The number is lower.");
	}
	if (x == y) {
	break;
	}
	}
	System.out.println("You got the number!");
	}
}
