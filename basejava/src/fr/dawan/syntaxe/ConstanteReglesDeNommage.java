package fr.dawan.syntaxe;

public class ConstanteReglesDeNommage {

	//Les constantes ne changent pas de valeur, variable inmodifiable. EN MAJUSCULE pour les différencier des autres variables
	public static void main(String[] args) {
		
		System.out.println("***********CONSTANTES****************");
		final int VIES_MAX =  15; 
		
		System.out.println("Nombre de vies max" + VIES_MAX);

		System.out.println("***********REGLES NOMMAGE****************");
		
		//Le nom des variables peut commencer une lettre
		int val = 15;
		
		//Les noms des variables peuvent com par underscore ou double 
		String _val = "underscore";
		String __val1 = "doubleUnderscore";
		
		//Les noms peuvent com par un dollars
		double $val3 = 5.0;
		
		//Le nom des variables peut contenir par un chiffre
		int conv2int = 500;
		
		// Une variable ne peut pas com par un chiffre !! 
		
		// Une variable ne peut pas commencer par opération mathematique (ponctuation + - ...)
		
		// Le nom d'une variable ne peut pas être un mot réservé comme double, long, short, int...
		
		// Java est langage sensible à la casse = pas le même nom pour valeur
		String valeur = "dawan"; 
		// String valeur = "jehann"; CAR MEME VALEUR POUR VARIABLE
		
		
		//Variable commence par minuscule !!!! 
		int nombre_de_vie = 5; // avec underscore pour espace
		int nombreDeVie = 5; // CamelCase commence par minuscule 
		
		
				
		
	}

}
