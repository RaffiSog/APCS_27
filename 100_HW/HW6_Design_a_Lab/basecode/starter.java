/*
 *	Author:
 *  Date:
 * 	Collaborator:
 */

import java.util.Scanner;
import java.util.Random;

public class starter {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int snackprice;
    String Snack;
    System.out.print("Enter your name: ");
    String name = sc.nextLine();
    System.out.println();
    System.out.println("Hello welcome to CVHS Theater which movie would you like to see: ");
    System.out.println("Spiderman 15$");
    System.out.println("The Odyssey 15$");
    System.out.println("Avengers 15$");
    System.out.println("'I don't want to watch a movie'");
    String movie = sc.nextLine();
    System.out.println();
    if (movie.equalsIgnoreCase("spiderman") || (movie.equalsIgnoreCase("odyssey") || movie.equalsIgnoreCase("the odyssey")) || movie.equalsIgnoreCase("avengers")){
    System.out.println("Great Choice!");
    System.out.print("Kids (Under 13) and Seniors (Above 65) get a 25% discount on their tickets. What age are you? ");
    int Age = sc.nextInt();
    String blank = sc.nextLine();
    System.out.println("Would you like any snacks?");
    System.out.println("Nothing");
    System.out.println("Popcorn (7$)");
    System.out.println("Fountain Drink (4$)");
    System.out.println("Candy (3$)");
    System.out.println("Combo (12$)");
    Snack = sc.nextLine();

    if (Snack.equalsIgnoreCase("Popcorn")){
    snackprice = 7;
    }
    else if (Snack.equalsIgnoreCase("Fountain Drink") || Snack.equalsIgnoreCase("Drink")){
    snackprice = 4;
    }
    else if (Snack.equalsIgnoreCase("Candy")){
    snackprice = 3;
    }
    else if (Snack.equalsIgnoreCase("Combo")){
    snackprice = 12;
    }
    else {
    snackprice = 0;
    System.out.println("Alright, no snacks then.");
    }

    double Price;
    if (Age > 13 || Age < 65) {
    Price = 11.25;
    }
    else {
    Price = 15.0;
    }

    System.out.println("Alright here is your reciept");
    System.out.println("-----------------------------------------");
    System.out.println("Reciept for: " + name);
    System.out.println("Ticket for: " + movie + " (15$)");
    System.out.println(Snack + ": " + snackprice + "$");
    System.out.println("Total: " + (Price + snackprice) + "$");
    System.out.println("-----------------------------------------");
    }
    else {
    System.out.println("You did not choose a movie rerun.");
    }
    }
}
