package fr.dawan.exo;

import java.util.Scanner;

public class CorrectSommeMoyennePourcent {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);
		double note1, note2, note3, note4, note5;
		double total, moyenne, pourcentage;
		//Double pour décimale en résultat mais aussi en variable 
		
		//On fournit les données
		System.out.println("Saisir la 1ere note : ");
		note1 = clavier.nextDouble();
		
		System.out.println("Saisir la 2eme note : ");
		note2 = clavier.nextDouble();
		
		System.out.println("Saisir la 3eme note : ");
		note3 = clavier.nextDouble();
		
		System.out.println("Saisir la 4eme note : ");
		note4 = clavier.nextDouble();
		
		System.out.println("Saisir la 5eme note : ");
		note5 = clavier.nextDouble();
		
		//Calculer la moyenne 
		total = note1+note2+note3+note4+note5;
		moyenne = total/5;
		pourcentage = (total/500)*100;
		
		//Afficher résultat
		System.out.println("Total = " + total);
		System.out.println("Moyenne = " + moyenne);
		System.out.println("Pourcentage = " + pourcentage);
		

	
	}

}
