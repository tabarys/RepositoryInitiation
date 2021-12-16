package fr.dawan.tableauxdynamiques;

import java.util.ArrayList; // classe ArrayList pour les types complexes 

public class WrappersTest {

	public static void main(String[] args) {

		ArrayList<Integer> tab = new ArrayList<Integer>();
		
		
		// PARSER une chaine de caracteres entier
		int k = Integer.parseInt("20");
		
		// Convertir une chaine de caractere en un entier de type wrapper
		Integer i = Integer.valueOf("210");
		System.out.println(i);
		
		// Convertir une chaine de caractere en double de type wrapper 
		Double d = Double.valueOf("35.14");
		
		System.out.println(d);
		
		// on peut convertir des types de donnees primitifs en leur objets de classe wrapper
		
		// AUTO BOXING = on a un type primitif
		int a = 56; // Qu'on convertit en wrappers en type complexe
		Integer i1 = a; // =auto boxing 
		
		//on ne peut creer une collection ou un tableau dynamique de type primitif
		// ArrayList<int> tab = new ArrayList<>(); INCORRECT 
		
		int a1 = 45;
		tab.add(a1); // auto boxing
		tab.add(60);
		
				//unboxing est opposé de auto boxingou on converti l'objet de la classe 
				// Wrapper vers son type primitif
		Integer s = 45;
		int a2 = s;  //un boxing 
		
		
		//Utilisation de l'autoboxing 
		ArrayList<Integer> a12 = new ArrayList<Integer>();
		int a3 = a12.get(0); // un boxing
		int val = a3+10;
		
		
		/*
		 * Les mots qu'on utilise pour représenter des variables primitives: int, char, byte etc. 
		 * sont basiques, d'ailleurs ce ne sont pas des objets comment quand on vous disait, petits, 
		 * que l'atome est l'unité la plus petite
		 * ici c'est aussi une sorte de petit mensonge de dire que int le mot déclarant une variable primitive 
		 * est l'élément le plus petit mais l'idée est là (modifié)
		 * des Wrapper sont des classes qui sont faites pour donner des outils pour faire des opérations 
		 * qui sont récurrentes
		 */
		
		
		
	}

}
