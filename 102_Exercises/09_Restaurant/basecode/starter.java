/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("=================================================");
		System.out.println("WELCOME RESTURANT OWNER!");
		System.out.println("=================================================");

		System.out.println();
		System.out.print("What's the name of your restaurant? ");
		String Resturant = sc.nextLine();
		
		System.out.println();
		System.out.print("What's your name? ");
		String Name = sc.nextLine();

		System.out.println();
		System.out.println("Great to see you, " + Name + " Let's set up a menu for " + Resturant + "!");
		System.out.println("Tonight's menu has room for exactly 3 items. Let's go!");

		System.out.println();
		System.out.println("--- Item #1 ---");
		System.out.print("Item name: ");
		String Item1 = sc.nextLine();
		System.out.print("Price of " + Item1 + "($): ");
		double Price1 = sc.nextDouble ();
		sc.nextLine ();
		System.out.print("How many "+ Item1 + " would you like? ");
		int Amount1 = sc.nextInt ();
		sc.nextLine ();
		System.out.println("Added " + Amount1 + "x " + Item1 + " to your order! ($" + Amount1*Price1 + ")");

		System.out.println("--- Item #2 ---");
		System.out.print("Item name: ");
		String Item2 = sc.nextLine();
		System.out.print("Price of " + Item2 + "($): ");
		double Price2 = sc.nextDouble ();
		sc.nextLine ();
		System.out.print("How many "+ Item2 + " would you like? ");
		int Amount2 = sc.nextInt ();
		sc.nextLine ();
		System.out.println("Added " + Amount2 + "x " + Item2 + " to your order! ($" + Amount2*Price2 + ")");

		System.out.println("--- Item #3 ---");
		System.out.print("Item name: ");
		String Item3 = sc.nextLine();
		System.out.print("Price of " + Item3 + "($): ");
		double Price3 = sc.nextDouble ();
		sc.nextLine ();
		System.out.print("How many "+ Item3 + " would you like? ");
		int Amount3 = sc.nextInt ();
		sc.nextLine ();
		System.out.println("Added " + Amount3 + "x " + Item3 + " to your order! ($" + Amount3*Price3 + ")");

		System.out.print("Nice choices! What tip percentage would you like to leave? (ex: 15, 18, 20): ");
		double TipPercent = sc.nextDouble ();
		sc.nextLine ();

		double Subtotal = (Amount1*Price1) + (Amount2*Price2) + (Amount3*Price3);
		double Tax = Subtotal*(9.75/100);
		double Tip = Subtotal*(TipPercent/100);
		double Total = Subtotal + Tax + Tip;
		

		System.out.println();
		System.out.println("=================================================");
		System.out.println(Resturant + " - Menu For Today");
		System.out.println("=================================================");
		System.out.println("Owner: " + Name);
		System.out.println("-------------------------------------------------");
		System.out.println("Item				Qty		Price");
		System.out.println("-------------------------------------------------");
		System.out.println(Item1 + "				" + Amount1 + "		" + Price1);
		System.out.println(Item2 + "				" + Amount2 + "		" + Price2);
		System.out.println(Item3 + "				" + Amount3 + "		" + Price3);
		System.out.println("-------------------------------------------------");
		System.out.println("Subtotal:					" + Subtotal);
		System.out.println("Tax (9.75%):				" + Tax);
		System.out.println("Tip:						" + TipPercent);
		System.out.println("Tip Amount:					" + Tip);
		System.out.println("=================================================");
		System.out.println("TOTAL:						" + Total);
		System.out.println("=================================================");
		System.out.println();
		System.out.println("Thanks for eating at " + Resturant + "!");
		System.out.println("Come back soon -- we'll always have a byte for you!");












	}
}
