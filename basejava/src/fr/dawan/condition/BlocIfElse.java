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
		
		
		// On d�clare une variable 
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
			System.out.println("Le nombre est �gal � z�ro.");
		} else if (nombre*nombre==25) {
			System.out.println("Le nbr entr� est -5");	
		} else { 
		    System.out.println("Le nombre est n�gatif ou �gal � z�ro."); }
		
		// Les symboles : op�rateurs de comparaison.
		// > = sup  < = inf     == pour �galit� (pas = car = c'est l'affectation)
		// != diff�rent 
		
		//Instruction switch 
		
		
		}
	
		
	}


