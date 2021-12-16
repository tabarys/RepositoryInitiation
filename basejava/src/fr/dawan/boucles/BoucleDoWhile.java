package fr.dawan.boucles;

import java.util.Scanner;

public class BoucleDoWhile {

	// La condition est test� a la fin avec la boucle Do While.
	// Elle permet de r�p�ter des instructions tant qu'une condition n'est pas v�rifi�e
	// Comme la condition est test�e � la fin, on est sur de passer dans le bloc au moins une fois
	// On fait faire TANT QUE 
	// do { instruction
	
	public static void main(String[] args) {
// on demande l'age a l'utilisateur
		
		Scanner clavier = new Scanner (System.in);
		int age = 0;
		do {
			System.out.println("Entrer votre �ge: ");
			age = clavier.nextInt();
			
		} while(age <= 0);
		
		System.out.println("Vous avez " + age + "ans");

		
		// CCL: Contrairement � la boucle FOR, on ne connait pas le nombre de fois que 
		// ce bloc d'instruction va se r�p�ter 
		
		
	}

}
