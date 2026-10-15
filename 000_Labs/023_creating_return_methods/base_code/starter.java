/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;


class starter {

public static int pow(int a, int b){
int ans = (int) Math.pow(a,b);
return ans;
}
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);

	System.out.println("What is your base number?");
	int base = sc.nextInt();
	System.out.println("What is your exponent number?");
	int expo = sc.nextInt();
	System.out.println("Your answer is: " + pow(base,expo));

		
	}
}
