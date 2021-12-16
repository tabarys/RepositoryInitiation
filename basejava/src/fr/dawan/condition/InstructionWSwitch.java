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
			System.out.println("Entr�e invalide : Veuillez saisir un num de jours entre 1&7");
		}
		*/
		
		// INSTRUCTION SWITCH = variante du if else
		// Pour une question de rapidit� et de performance, switch est mieux que les blocs else-if
		
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
			System.out.println("Entr�e invalide");
			
			//L'instruction switch est plus rapide que l'instruction if/else if/else
			// Au lieu d'�valuer chaque condition s�quentiellement, il faut chercher une fois
			//l'expression et passer direct � la condition VRAIE.
			
			//L'expression est �valu�e une fois dans le switch. Break permet de sortir
			// du switch 
			
			// Switch utilis� quand on a des conditions "a la carte" 
		}
		
		
/*
 * UTILISATION DU D�BOGAGE
C�est un outil tr�s pratique qui permet de voir le d�roulement de notre programme, 
et d�ex�cuter les instructions les unes apr�s les autres, et d�observer le contenu 
des variables, de revenir en arri�re, de pouvoir savoir exactement ce qu�il se passe et 
surtout pourquoi tel bout de code ne fonctionne pas.


CONDITION
Les instructions conditionnelles permettent d'ex�cuter des instructions seulement 
si une condition est v�rifi�e.  Une condition se construit gr�ce � des op�rateurs 
de comparaison.
 
Switch commence par �valuer la variable qui lui est pass�e entre parenth�ses. 
Avec le mot cl� case on �num�re les diff�rents cas possibles pour la variable et on
 ex�cute les instructions correspondantes jusqu�au mot cl� break qui signifie que 
 l�on sort du switch
 
L�op�rateur conditionnel ? :  �galement appel� op�rateur conditionnel ternaire, 
�value une expression bool�enne et retourne le r�sultat de l�une des deux expressions, 
selon que l�expression bool�enne a pour valeur true ou false.
 */
	}

}
