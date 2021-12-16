package fr.dawan.condition;

import java.util.Scanner;

public class BlocIfElse {

	public static void main(String[] args) {

		/* if (condition) {
		 * }else {
		 * }
		 * 
		 * 
		 * if (condition) val bolean { // BLOC D'INSTRUCTIONS1 = condition VRAI
		 * 
		 * le bloc IF = quand condition est vraie
		 * le bloc ELSE = quand la condition est fausse
		 * le blac ELSE IF = traite un cas particulier (ex nombre == 0)
		 * 
		 * Si j'ai une instructruction juste alors IF si fausse alors ELSE BLOC D'INSTRUCTIONS2
		 */
		
		Scanner clavier = new Scanner(System.in);
		
		
		// On déclare une variable 
		int nombre = 0;
		
		System.out.println("Entrer un nombre : ");
		nombre = clavier.nextInt();
		
		//Texte conditionnel, 
		// Si (condition est vraie)
		//	instructions;
		//Sinon 
		//  autre instruction
		
		if (nombre > 0 ) {
			System.out.println("Le nombre est positif");
		} else if (nombre == 0) {
			System.out.println("Le nombre est égal à zéro.");
		} else if (nombre*nombre==25) {
			System.out.println("Le nbr entré est -5");	
		} else { 
		    System.out.println("Le nombre est négatif ou égal à zéro."); }
		
		// Les symboles : opérateurs de comparaison.
		// > = sup  < = inf     == pour égalité (pas = car = c'est l'affectation)
		// != différent 
		
		//Instruction switch 
		
		
		}
	
		
	}


