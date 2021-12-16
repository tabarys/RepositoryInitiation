package fr.dawan.tableauxstatiques;

public class It�rationTableau {

	public static void main(String[] args) {

		// ITERATION = 
		
		int [] tab = {200, 330, 50};
		double [] tab2 = {25.8, 6.54, 100.01, 91.1};
		
		/*
		 * METHODE 1 : BOUCLE for CLASSIQUE POUR ITERER 
		 */
		
		for(int i = 0; i < 3; i++ ) // Pour initialisation. "3" car toujours la taille du tableau (200 330 50)
		System.out.println("Element � la position "+i+" :" + tab[i]);
		
		/* RENDU =
		 * Element � la position 0 :200
Element � la position 1 :330
Element � la position 2 :50

		 */
		
		// OBTENIR LA TAILLE DU TABLEAU 
		System.out.println("\nTaille du tableau : " + tab.length+ "\n"); // LENGTH pour taille 
		
		
		// METHODE 2 : BOUCLE FOREACH = pour chaque �l�ment! Sur un ensemble de valeur 
		
		System.out.println("Boucle foreach: It�ration sur un ens de valeur");
		for (double element:tab2) { // for = pour chaque �l�ment = 25.8 6.54... = tab2
			System.out.println(element); // PAS DE MODIF DE VALEUR 
			
		}
		
		
	}

}
