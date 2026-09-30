/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input your first number: ");
		int x = sc.nextInt();
		System.out.println();
		System.out.print("Please input your second number: ");
		int y = sc.nextInt();
		

		if (x != y){
		System.out.println("The variables are different");
		}
		if (x == y){
		System.out.println("The variables are the same");
		} 
	}
}
