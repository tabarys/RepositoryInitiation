package fr.dawan.syntaxe.entreessortiesstandart;

import java.util.Scanner;

public class LectureDunEntier {

	public static void main(String[] args) {
		//On va faire interagir le client via le clavier. On va utilis� les classes JDK
		// System.in est un flux standart d'entr�e APPRENDRE CE QUE FAIT IN 
		
		Scanner clavier = new Scanner(System.in); //"in" Valeur provient du clavier de l'utilisateur
		
		int n = 0;
		
		System.out.print("Ecrivez un nombre : ");
		n = clavier.nextInt(); 
		
		System.out.println("le carr� de " + n + " est " + n*n);
		
		
		
	}

}
