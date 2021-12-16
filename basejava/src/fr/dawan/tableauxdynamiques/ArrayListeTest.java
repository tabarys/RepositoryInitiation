package fr.dawan.tableauxdynamiques;

import java.util.ArrayList;


public class ArrayListeTest {

	public static void main(String[] args) {

		// TABLEAU DYNAMIQUE N'EST PAS STATIQUE, ON PEUT LE MODIFIER, TAILLE PEUT AUGMENTER 
		// ON PREND CLASSE ARRAYLIST POUR TABLEAU DYNAMIQUE 
		// C'EST UN OBJET N'A PAS DE TAILLE LIMITE COMME LES TABLEAUX FIXES
		
		// CLASSE ARRAYLIST UTILISEE POUR LES TYPES EVOLUES / COMPLEXE ET PAS LES TYPES PRIMITIFS
		
		//ON PEUT LUI AFFECTER ENTRE CHEVRON LE TYPE DE DONNEES QU'IL VA STOCKER
		
		// =POUR LES CHAINES DE CARACTERES 
		ArrayList<String> tab1 = new ArrayList<String>(); //String car type complexe, ne marche pas avec "int" par exemple
		
		// = taille du tableau
		System.out.println(tab1.size());  
		
		// TABLEAU D'ENTIER
		ArrayList<Integer> tab2 = new ArrayList<Integer>(); // WRAPPERS = OBJETS DE TYPE COMPLEXES
		
		// AJOUT ELEMENT SUR TABLEAU 
		tab2.add(20);
		
		System.out.println(tab2.get(0));
		
		
		//Ajouter élément dans le tableau!   ===  set(a, b) 
		tab2.set(0, 60); 
		System.out.println(tab2.get(0));
		
		tab2.add(350);
		tab2.add(980);
		tab2.add(210);
		
		System.out.println("Element à la position 2 : " + tab2.get(2));
		
		if(tab2.contains(50)) {
			System.out.println("L'élement 50 est présent dans mon tableau");
		} else {
			System.out.println("L'element 50 n'est pas dans le tableau");
			
		}
		
		if(tab2.isEmpty()) {
			System.out.println("Tableau vide");
		} else {
			System.out.println("Element a la position 3 : " + tab2.get(3));
		}
		
		if(tab2.indexOf(621) == -1) {
			System.out.println("element 621 pas dans le tableau");
		}else { 
			System.out.println();
		}
			
			
			
			
			
	}

}
