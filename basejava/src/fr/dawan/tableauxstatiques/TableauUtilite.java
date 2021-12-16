package fr.dawan.tableauxstatiques;

import java.util.Scanner;

public class TableauUtilite {

	public static void main(String[] args) {

		//DECLARATION D'UN TABLEAU 
		//TABLEAUX STATIQUES OU DYNAMIQUES 
		
		/* 
		 * un tableau est statique 
		 * ON VADEMANDER LAGE DES UTILISATEUR 
		 */
		
		
		Scanner clavier = new Scanner(System.in);
		
		int age1, age2 = 0;
		//int [] age = new int[27];
		double moyenne;
		
		System.out.println("Entrer l'age de l'utilisateur 1");
		age1=clavier.nextInt();
		System.out.println("Entrer l'age de l'utilisateur 2");
		age1=clavier.nextInt();
	
		moyenne = ( age1 + age2 )/2;
		System.out.println("La moyenne d'age est : " + moyenne);
		
		/*
		 * Si qtt importante de données, exemple 27 utilisateurs
		 * Il faut déclarer 27 variables, ce qui est trop loooooong, illisible, perte de temps
		 * Donc, TABLEAU ! tableaux pour éléments du même type (entier, chaine de caractere (string))
		 */
		
		
		
		
		
		
		
		
		
	}

}
