package fr.dawan.tableauxstatiques;

public class TableauxMultidimensionnelsITERATION {

	public static void main(String[] args) {


		int[][] scores = {
				{5, 25, 72, 16, 38}, // indice 0 = ligne 1
				{90, 7, 30},		 // indice 1 = ligne 2
				{37, 97, 1, 52}		 // indice 2 = ligne 3
				};
		
		// Premiere boucle for parcourre les lignes
		
		for(int i = 0; i <scores.length;i++) {   //nbRaws
			
		// Deuxieme boucle pour les colonnes 
		
		for(int j=0; j < scores[i].length; j++) {
			
			System.out.println(scores[i][j]+" ");
			
		}
		
		System.out.println();
		
		}
		
		
		
		
	}

}
