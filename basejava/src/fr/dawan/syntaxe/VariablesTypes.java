package fr.dawan.syntaxe;

	/* =Zone m�moire qui contient une valeur typ�e 
	 * 8 types de base en Java: 
	 * TYPES PRIMITIFS
	 * Entier 1octet=8bits) = byte (1octet) short (2octets), int (4o), long (8o)
	 * Type caract�re = char 
	 * Type boolean = boolean (ne peuvent prendre que deux valeur, true false)
	 * Type flottants = float (4o) et double float (8o) 
	 * 
	 * 
	 * TYPES COMPLEXES 
	 * Objets
	 * Tableaux
	 * String
	 * Classes
	 * 
	 * Diff�rences entre primitif et complexe: 
	 */
public class VariablesTypes {

	public static void main(String[] args) {
		// 1 Type caract�re : char

		char c = 'a';

		// Type entier: byte, short, int, long
		byte b = 1;
		short s = 2;
		int i = 3;
		long l = 4;
		
		// c b s i l = variables 
		/*Pour type long, 
		 * on peur forcer une valeur litt�rale a etre interpret� 
		 * comme un entier long L apres valeur
		 */
		
		long l2 = 100L;
				
		/* Les long peuvent contenir bcp de valeurs
		 * Pour plus de lisibilit� on peut s�parer les miliers par underscore
		 */
		long l3 = 1_000_000_000;
		
		System.out.println("le contenu de l3: "+l3);

		// Les types � virgule flottante (d�cimal) : float, double
		double d1 = 5;
		System.out.println("le contenu de d; = +d1");
	
		float f = 0.5F; 
	//Pour les variables de type float, il faut suffixer la valeur par F ou f
		
		boolean bool = true;
		
		// Types complexes
		String chaine = "Dawan";
		int[] tab = {200, 300, 50};
		System.out.println(tab); 
		
		//Regles de nommage variable _ variable commence par minuscule !!!! 
		int nombre_de_vie = 5; // avec underscore pour espace
		int nombreDeVie = 5; // CamelCase commence par minuscule 
		
		
	}
	

}
