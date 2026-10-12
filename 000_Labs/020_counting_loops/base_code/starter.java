/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter your name: ");
	String Name = sc.nextLine();
	System.out.println();
	System.out.print("Please enter how many times you'd like to print your name: ");
	int y = sc.nextInt();
	int x = 0;
	
	while (x < y) {
	System.out.println(Name);
	x = x+1;
	}



		
	}
}
