package fr.dawan.syntaxe.entreessortiesstandart;

import java.util.Scanner;


public class LectureDuneChaineDuCaractereOuDunDecimal {
		
		static Scanner clavierDouble = new Scanner (System.in);
		static Scanner clavierChaine = new Scanner (System.in);

		public static void main(String[] args) {
			
		
		double var1 = 0.0;
		String chaine = "";
		
		System.out.print("Entrer un nombre réel : ");
		var1 = clavierDouble.nextDouble();
		System.out.println("Vous avez entré : " + var1);
		
		System.out.print("Entrer une chaine de caractère : ");
		chaine = clavierChaine.nextLine();
		System.out.println("Vous avez entré : " + chaine);

		
		
		
		
		chaine = clavierChaine.nextLine();
		
		

	}

}
