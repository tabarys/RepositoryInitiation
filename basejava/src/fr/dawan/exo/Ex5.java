package fr.dawan.exo;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Saisir la longueur: ");
		int longueur = clavier.nextInt();
		
		System.out.print("Saisir la largeur: ");
		int largeur = clavier.nextInt();
		
		System.out.println("Périmètre = " + (longueur + largeur)*2);

		
		/*
		 * try (Scanner clavier = new Scanner(System.in)) {
			System.out.print("Saisir la longueur: ");
			int longueur = clavier.nextInt();
			
			System.out.print("Saisir la largeur: ");
			int largeur = clavier.nextInt();
			
			System.out.println("Périmètre = " + (longueur + largeur)*2); */
			
	}

}
