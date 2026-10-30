/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

	Spiderman n1 = new Spiderman("Tobey Maguire");
	n1.setAge(48);
	n1.setVillain("Green Goblin");

	Spiderman n2 = new Spiderman("Andrew Garfield", 40);
	n2.setVillain("Electro");

	Spiderman n3 = new Spiderman("Tom Holland", 27, "The Vulture");

	Spiderman n4 = new Spiderman();
	n4.setActor("Aarov Shah");
	n4.setAge(16);
	n4.setVillain("Veer Shah");
	}
}
