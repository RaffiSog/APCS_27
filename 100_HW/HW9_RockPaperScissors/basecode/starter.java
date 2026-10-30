/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;






class starter {

    public static int getObject(){  
    int object = (int)(Math.random()*3)+1;
    return object;
}
public static int compare2(int a, int b){
    if (a == b){
    return 0;
    }
    if (a == 1 && b == 2){
    return 2;
    }
    if (a == 1 && b == 3){
    return 1;
    }
    if (a == 2 && b == 1){
    return 1;
    }
    if (a == 2 && b == 3){
    return 2;
    }
    if (a == 3 && b == 1){
    return 2;
    }
    if (a == 3 && b == 2){
    return 1;
    }
    else{
    return 0;
    }
}




    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int Usermove = 0;
    String Userchoice;
    System.out.println("Would you like to play the computer? (yes/no/done)");
    String play = sc.nextLine();

    while (!play.equalsIgnoreCase("done")){
    

    if (play.equalsIgnoreCase("yes")){
    System.out.println();
    System.out.println("--------------------------------------------------------------");
    System.out.println("Please enter rock/paper/scissors:");
    Userchoice = sc.nextLine();

    while (!Userchoice.equalsIgnoreCase("rock") && !Userchoice.equalsIgnoreCase("paper") && !Userchoice.equalsIgnoreCase("scissors")){
    System.out.println("Invalid input, please type in rock/paper/scissors:");
    Userchoice = sc.nextLine();
    }

    if (Userchoice.equalsIgnoreCase("rock")){
    Usermove = 1;
    }
    if (Userchoice.equalsIgnoreCase("paper")){
    Usermove = 2;
    }
    if (Userchoice.equalsIgnoreCase("scissors")){
    Usermove = 3;
    }
    int ComputerMove = getObject();
    int result = compare2(Usermove, ComputerMove);
    if (result == 0){
    System.out.println("You tied!");
    }
    if (result == 1){
    System.out.println("You won!!!");
    }
    if (result == 2){
    System.out.println("You lost! :(");
    }
}

    if (play.equalsIgnoreCase("no")){
    System.out.println();
    System.out.println("--------------------------------------------------------------");
    System.out.println("How many times would you like the computer to play itself?");
    int x = sc.nextInt();
    sc.nextLine();

    while (x > 0) {
        int ComputerMove1 = getObject();
        int ComputerMove2 = getObject();
        int result = compare2(ComputerMove1, ComputerMove2);
        if (result == 0) {
            System.out.println("Game " + x + ": Tied!");
        } else if (result == 1) {
            System.out.println("Game " + x + ": Computer 1 won!");
        } else {
            System.out.println("Game " + x + ": Computer 2 won!");
        }
        x = x - 1;
    }
    }
    System.out.println("Would you like to play the computer? (yes/no/done)");
    play = sc.nextLine();
    }
}




}
