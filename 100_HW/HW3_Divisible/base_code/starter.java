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
		System.out.print("Please enter an integer: ");
		int x = sc.nextInt();
		System.out.println("Please enter another integer: ");
		int y = sc.nextInt();
		System.out.println();

		if (x%2 == 0){
		System.out.println(x + " is an even number!");
		}
		else {
		System.out.println(x + " is an odd number!");
		}
		if (x%3 != 0 && x%4 != 0 && x%5 != 0){
		System.out.println(x + " is not divisble by 3, 4, or 5!");
		}
		else{
		if (x%3 == 0){
		System.out.println(x + " is Divisible by 3!");
		}
		if (x%4 == 0){
		System.out.println(x + " is Divisible by 4!");
		}
		if (x%5 == 0){
		System.out.println(x + " is Divisible by 5!");
		}
		}
		
		System.out.println();

		if (y%2 == 0){
		System.out.println(y + " is an even number!");
		}
		else {
		System.out.println(y + " is an odd number!");
		}
		if (y%3 != 0 && y%4 != 0 && y%5 != 0){
		System.out.println(y + " is not divisble by 3, 4, or 5!");
		}
		else{
		if (y%3 == 0){
		System.out.println(y + " is Divisible by 3!");
		}
		if (y%4 == 0){
		System.out.println(y + " is Divisible by 4!");
		}
		if (y%5 == 0){
		System.out.println(y + " is Divisible by 5!");
		}
		}
		
	}
}
