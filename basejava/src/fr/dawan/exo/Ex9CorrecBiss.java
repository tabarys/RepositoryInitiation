package fr.dawan.exo;

import java.util.Scanner;

public class Ex9CorrecBiss {

	public static void main(String[] args) {
// Formule sur wikip�dia = ann�e divisible par 
// 
		Scanner clavier = new Scanner(System.in);
		
		int annee;

		
		System.out.println("Saisir une ann�e : ");
		annee = clavier.nextInt();
		//si l'ann�e est divisible par 4 et par 100 ou par 400
		if((annee%4 == 0) && (annee%100 != 0) || (annee % 400 == 0)) {
		System.out.println(annee + " est une annee bissextile");
		
		
	} else {
		System.out.println("Ann�e simple");
		
	}
				
				
		
		
		
	}

}
