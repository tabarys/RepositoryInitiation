package fr.dawan.exo;

import java.util.Scanner;

public class Ex9Bissextile {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);
		
		int annee = 0;
		int quotient = annee/4;
		
		
			System.out.println("Entrer une ann�e : ");
			annee = clavier.nextInt();
			
			if (quotient != 0) {
				System.out.println("L'ann�e " + annee + " est bissextile"); } 
			
			else { 
			    System.out.println("L'ann�e est simple."); }

		
			
	}		
}
