package fr.dawan.condition;

import java.util.Scanner;

public class OperateursLogiques {

	public static void main(String[] args) {
//Op logiques s'appliquent sous des opérandes booléens et produisent
// résultat booléan
		
		/* 3 OPERATEURS LOGIQUES : une Unaire et deux Binaire 
		 TABLE LOGIQUE
		 A	B				A&&B			A||B			!A 
		 v	v				v				v				f		
		 v	f				f				v				f	
		 f	v				f				v				v
		 f	f 				f				f				v
		 
		 
		 A&&B est vraie (true) si A est vraie et B est vraie sinon c'est faux 
		 A||B est vraie si un des opérandes est vraie sinon faux
		 !A   A est vraie alors !A est faux
		 */
		
		Scanner clavier = new Scanner(System.in);
		// Test les opérateurs ET et OU 
		// && = et   || = ou         ! = non 
		
		
		int a, b, c;
		int nombre = 0;
		
		System.out.println("Entrer valeur a: ");
		a = clavier.nextInt();
		
		System.out.println("Entrer valeur b: ");
		b = clavier.nextInt();
		
		System.out.println("Entrer valeur c: ");
		c = clavier.nextInt();
		
		// TEST OU : au moins une condition vraie essaie avec nbr diff (a=4 b=6 c=7)
		// = rien ne sort 
		//if(a == b || b == c || a == c) {
			//System.out.println("Deux valeurs sont au moins identiques");
		//}	
			
		// TEST ET : les deux conditions sont vraies 
		// test avec 5 5 4 
		if(a == b && b == c && a == c) {
			System.out.println("Les deux conditions sont vraies/Les 3 valeurs sont identiques"); 
			//Rien ne s'affiche si cond fausse! pas de else donc rien s'affiche
		
		// TEST OPERATEUR NON = (!)
			System.out.println("\n Test de l'opérateur NON \"!\"");
			System.out.println("Entrer un nbr");
			nombre = clavier.nextInt();
			
			if(nombre>0) {
				System.out.println("Le nombre entré est négatif");
			}
			
			// PAS FINI
			
			
		}
	}
}
