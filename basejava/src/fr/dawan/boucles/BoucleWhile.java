package fr.dawan.boucles;

import java.util.Scanner;

public class BoucleWhile {

	public static void main(String[] args) {

		
		
		Scanner clavier = new Scanner(System.in);
		int age = 0; // QUAND "int var = 0" signifie on initialise int 
		
		while(age<=0) {
			System.out.println("Entrer votre âge: ");
			age = clavier.nextInt();
			if(age<=0) {
				System.out.println("\nL'age doit etre positif\n");
				
			}
		}
		
		System.out.println("Vous avez " + age + "ans");
		
	}

}
