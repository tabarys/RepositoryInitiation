package fr.dawan.syntaxe.entreessortiesstandart;

import java.util.Scanner;

public class NextLinetest {

	static Scanner clavier = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Methode NextLine permet de lire une ligne de texte jusqu'au prochaine retour a la ligne
		
		int n = 0;
		String str1 = "";
		String str2 = "";
		
		System.out.print("Entrer un entier: ");
		n = clavier.nextInt();
		
		System.out.println("Entrer du texte: ");
		str1 = clavier.nextLine();
		
		System.out.println("Entrer du texte: ");
		str2 = clavier.nextLine();
		
		//On affiche le contenu entré par l'utilisateur
		
		System.out.println("n= " + n);
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		
	// EXEMPLE 2 	
		int _n = 0;
		String _str1 = "";
		String _str2 = "";
		
		System.out.print("Entrer un entier: ");
		_n = clavier.nextInt();
		
		clavier.nextLine(); //Permet de pas prendre en compte valeur apres "5" (Evite de lire les caractères apres l'entier récupéré par le clavier
		
		
		System.out.print("Entrer du texte: ");
		_str1 = clavier.nextLine();
		
		System.out.print("Entrer du texte: ");
		_str2 = clavier.nextLine();
		
		//On affiche le contenu entré par l'utilisateur
		
		System.out.println("_n= " + _n);
		System.out.println("_str1 = " + _str1);
		System.out.println("_str2 = " + _str2);
		
		
		
	}

}
