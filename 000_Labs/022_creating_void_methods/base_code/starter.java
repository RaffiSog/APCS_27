/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;


class starter {

	public static void toString (String a){
	System.out.println(a);
	}
	public static void toStringCombined (String a, String b){
	System.out.println(a + " " + b);
	}
	
	
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("Write a sentence!");
	String a = sc.nextLine();
	System.out.println("Write a sentence!");
	String b = sc.nextLine();

	System.out.println();
	System.out.println("This is using the methods!");
	toString(a);
	toStringCombined(a,b);


		
	}
}
