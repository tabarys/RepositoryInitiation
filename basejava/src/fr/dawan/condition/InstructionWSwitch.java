package fr.dawan.condition;

import java.util.Scanner;

public class InstructionWSwitch {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner (System.in);
		
		 int jours = 7;
		
		System.out.println("Saisir le num du jour: ");
		jours = clavier.nextInt();
		
		/*Boucle else if
		if(jours == 1) {
			System.out.println("Lundi");
			
		} else if (jours==2) {
			System.out.println("Mardi");
		
		} else if (jours==3) {
		System.out.println("Mercredi");
		
		// ETC ETC PUIS ELSE POUR PAS QUE NIMPORTE QUEL CHIFFRE > 7 DONNE DIMANCHE 
		
		} else {
			System.out.println("Entrée invalide : Veuillez saisir un num de jours entre 1&7");
		}
		*/
		
		// INSTRUCTION SWITCH = variante du if else
		// Pour une question de rapidité et de performance, switch est mieux que les blocs else-if
		
		switch (jours) {
		case 1:
			System.out.println("Lundi");
			break;
		case 2: 
			System.out.println("Mardi");
			break;
		case 3:
			System.out.println("Mercredi");
			break;
		case 4:
			System.out.println("Jeudi");
			break;
		case 5:
			System.out.println("Vendredi");
			break;
		case 6:
			System.out.println("Samedi");
			break;
		case 7:
			System.out.println("Dimanche");
			break;
		default:
			System.out.println("Entrée invalide");
			
			//L'instruction switch est plus rapide que l'instruction if/else if/else
			// Au lieu d'évaluer chaque condition séquentiellement, il faut chercher une fois
			//l'expression et passer direct à la condition VRAIE.
			
			//L'expression est évaluée une fois dans le switch. Break permet de sortir
			// du switch 
			
			// Switch utilisé quand on a des conditions "a la carte" 
		}
		
		
/*
 * UTILISATION DU DÉBOGAGE
C’est un outil très pratique qui permet de voir le déroulement de notre programme, 
et d’exécuter les instructions les unes après les autres, et d’observer le contenu 
des variables, de revenir en arrière, de pouvoir savoir exactement ce qu’il se passe et 
surtout pourquoi tel bout de code ne fonctionne pas.


CONDITION
Les instructions conditionnelles permettent d'exécuter des instructions seulement 
si une condition est vérifiée.  Une condition se construit grâce à des opérateurs 
de comparaison.
 
Switch commence par évaluer la variable qui lui est passée entre parenthèses. 
Avec le mot clé case on énumère les différents cas possibles pour la variable et on
 exécute les instructions correspondantes jusqu’au mot clé break qui signifie que 
 l’on sort du switch
 
L’opérateur conditionnel ? :  également appelé opérateur conditionnel ternaire, 
évalue une expression booléenne et retourne le résultat de l’une des deux expressions, 
selon que l’expression booléenne a pour valeur true ou false.
 */
	}

}
