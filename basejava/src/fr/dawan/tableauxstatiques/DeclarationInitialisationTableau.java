package fr.dawan.tableauxstatiques;

public class DeclarationInitialisationTableau {

	public static void main(String[] args) {

		// COMMENT DECLARER LES TABLEAUX ? 2 FACONS
		// 1) DECLARATION ET INITIALISATION QUAND ON CONNAIT LES ELEMENTS 
		
		int [] tab1; //DECLARATION DU TABLEAU 
		int [] tab2 = {12, 38, 4, 98, 78}; // DECLARATION ET INITIALISATION 
		
		System.out.println(tab2); //ADRESSE/REFERENCE DU TABLEAU tab2 = [I@15db9742
 
		System.out.println(tab2[0]);
		
		System.out.println(tab2[0] + tab2[1]);
		
		// 2) SI ON CONNAIT PAS LES VALEURS DU TABLEAU ON PEUT INITIALISER AVEC CETTE 2EME METHODE
		
		int[] tab = new int[4]; // ENTIER INITIALISE A ZERO, JE RESERVE 4 PLACES EN MEMOIRE / 4 EMPLACEMENTS FIXES DANS LE TAS INITIALISE A ZERO
		// Si double alors 0.0                                     TABLEAU STATIQUE 
		
		System.out.println(tab[1]);
		
		tab[0] = 30;
		tab[1] = 3;
		System.out.println(tab[0]+tab[2]); //Résultat est 30 
		
		//COMMENT FAIRE POUR ITERER 
		
		
	}

}
