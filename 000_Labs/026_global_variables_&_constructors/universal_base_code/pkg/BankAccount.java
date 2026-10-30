/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
private String owner;
private int acountnum;
private double Balance;
private boolean isActive;
private static int nextAccountNumber = (int)(Math.random()*950)+50;


	// -------CONSTRUCTORS-------
	public BankAccount(){
	owner = "unkown";
	acountnum = nextAccountNumber;
	nextAccountNumber++;
	Balance = 0;
	isActive = true;

	}
	public BankAccount(String a){
	owner = a;
	acountnum = nextAccountNumber;
	nextAccountNumber++;
	Balance = 0;
	isActive = true;
	}
	public BankAccount(String a, double b) {
	owner = a;
	acountnum = nextAccountNumber;
	nextAccountNumber++;
	Balance = b;
	isActive = true;
	}
	// -------METHODS-------

}