package fr.dawan.tableauxstatiques;

public class IterationClassiqyeVSIterationValeurs { // AVANTAGES ET INCONVENIENTS

	public static void main(String[] args) {

		
		
		// ITERATION CLASSIQUE : 
		
		// ITERATION SUR UN ENSEMBLE DE VALEURS :
		
		int[] tab = {100, 200, 300, 10};
		
		System.out.println("iteration classique");
		for(int i = 0; i < tab.length-1; i++) { // 1ERE PARTIE INITIALISATION (SI DEPASSEMENT, METTRE -1 apres length-1; i++)
		System.out.println(tab[i]); 
		//tab[i]= 22; // SI ON FAIT CA, VALEURS DU TABLEAU SONT TTES 22 
		
		tab[i+1]=154; // TABLEAU STATIQUE DONC ON PEUT PAS LE MODIFIER ICI [i+1] = element 2 donc 300
		// ICI ESSAIE D'ATTEINDRE UN INDICE QUI N'EST PAS DANS LE TABLEAU = DEPASSEMENT 
		// message erreur Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3 
		// signifie que y a que 3
		
		}
		//System.out.println("tab[0] : " +tab[0]);
		
		System.out.println("\nForeach: Iteration sur un ens de valeurs");
		for (int element: tab) {
			System.out.println(element);
		//	element = 11;
		}
		System.out.println("tab[0]:" + tab[0]);
		
		// Pour modifier une valeur = ITERATION CLASSIQUE 
		
		// 2eme cas : on peut pas tester 2 valeurs dans le tableau avec foreach
		// Par contre, la boucle for le permet ! on peut écrire tab[i] == tab[i+1] ou tab[i]<tab[i+1] 
		
		
	}

}
