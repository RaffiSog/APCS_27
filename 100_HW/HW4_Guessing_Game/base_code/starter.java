/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		int x = (int)(Math.random()*3);
		System.out.println("The goal of the game is to guess a word with two hints!");
		System.out.println();

		if (x == 0){
		System.out.println("It's a furry animal!");
		System.out.print("What is your guess? ");
		String y = sc.nextLine();
		System.out.println();
		if ((y.equals("cat")) || (y.equals("Cat"))){
		System.out.println("You got it! Woo!");
		}
		else {
		System.out.println("You sadly didn't guess right, here's another hint!");
		System.out.println("It's a feline friend!");
		System.out.println();
		y = sc.nextLine();
		if ((y.equals("cat")) || (y.equals("Cat"))){
		System.out.println("You got it! Woo!");
		}
		else{
		System.out.println("The answer was cat, better luck next time!");
		}
		}
		}

		if (x == 1){
		System.out.println("It's a planet in our solar system!");
		System.out.print("What is your guess? ");
		String y = sc.nextLine();
		System.out.println();
		if ((y.equals("earth")) || (y.equals("Earth"))){
		System.out.println("You got it! Woo!");
		}
		else {
		System.out.println("You sadly didn't guess right, here's another hint!");
		System.out.println("It's the only one with humans on it!");
		System.out.println();
		y = sc.nextLine();
		if ((y.equals("earth")) || (y.equals("Earth"))){
		System.out.println("You got it! Woo!");
		}
		else{
		System.out.println("The answer was Earth, better luck next time!");
		}
		}
		}

		if (x == 2){
		System.out.println("It's a fruit!");
		System.out.print("What is your guess? ");
		String y = sc.nextLine();
		System.out.println();
		if ((y.equals("apple")) || (y.equals("Apple")) || (y.equals("apples")) || (y.equals("Apples") )){
		System.out.println("You got it! Woo!");
		}
		else {
		System.out.println("You sadly didn't guess right, here's another hint!");
		System.out.println("It's a red fruit!");
		System.out.println();
		y = sc.nextLine();
		if ((y.equals("apple")) || (y.equals("Apple")) || (y.equals("apples")) || (y.equals("Apples") )){
		System.out.println("You got it! Woo!");
		}
		else{
		System.out.println("The answer was apple, better luck next time!");
		}
		}
		}
	}
}
