package fr.dawan.tableauxstatiques;

public class TableauMultidimensionnel { //A DEUX DIMENSIONS

	public static void main(String[] args) {

		// CMT METTRE UNE DEUXIEME 
	//	int[] scores = {10, 20, 30}; // CA C UN TABLEAU SEPARE PAR DES VIRGULES
		// Il faudrait une boucle for pour premier tableau
		//Creation de tableau 2 Dimensions: on met 2 fois les crochets
		// VALEURS INITIALISE, ON LUI ADMET DES VALEURS EN LIGNE 18
		int[][]scores = new int[2][3]; // Premiers crochets = 2 joueurs et 3 colonnes pour les 3 scores
		
		int[][]scores1 = {{5, 25, 72, 16, 98}, {90, 7, 30, 67, 29}}; // =2 TABLEAUX ICI 1 avec 5->98 = 1ere ligne
		System.out.println(scores1[0][1]); // AFFICHE 25 CAR 
		System.out.println(scores1[1][3]); // AFFICHE 67 car 1ere valeur = 0
		
		
		int[][]scores2 = new int[2][2];
		// A LA CREATION TABLEAU EST COMME CA = {{0,0},{0,0}}
		scores2[0][0] = 5; //= 1ere colonne de la ligne 1  {{5,0},{0,0}}
		scores2[0][1] = 12; // 2eme colonne ligne 1  {{5,12},{0,0}}
		// ON PASSE A LA LIGNE 2 (DEUXIEME PARTIE DES ACCOLADES
		scores2[1][0] = 54; //1ere colonne de la ligne 2  {{5,12},{54,0}}
		scores2[1][1] = 27; 
		System.out.println("scores2[0][1] : "+ scores2[0][1]);
		
		
		
		
	}

}
