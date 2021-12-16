package fr.dawan.tableauxstatiques;

public class ItérationTableau {

	public static void main(String[] args) {

		// ITERATION = 
		
		int [] tab = {200, 330, 50};
		double [] tab2 = {25.8, 6.54, 100.01, 91.1};
		
		/*
		 * METHODE 1 : BOUCLE for CLASSIQUE POUR ITERER 
		 */
		
		for(int i = 0; i < 3; i++ ) // Pour initialisation. "3" car toujours la taille du tableau (200 330 50)
		System.out.println("Element à la position "+i+" :" + tab[i]);
		
		/* RENDU =
		 * Element à la position 0 :200
Element à la position 1 :330
Element à la position 2 :50

		 */
		
		// OBTENIR LA TAILLE DU TABLEAU 
		System.out.println("\nTaille du tableau : " + tab.length+ "\n"); // LENGTH pour taille 
		
		
		// METHODE 2 : BOUCLE FOREACH = pour chaque élément! Sur un ensemble de valeur 
		
		System.out.println("Boucle foreach: Itération sur un ens de valeur");
		for (double element:tab2) { // for = pour chaque élément = 25.8 6.54... = tab2
			System.out.println(element); // PAS DE MODIF DE VALEUR 
			
		}
		
		
	}

}
