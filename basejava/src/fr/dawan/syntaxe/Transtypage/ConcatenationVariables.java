package fr.dawan.syntaxe.Transtypage;

public class ConcatenationVariables {

	public static void main(String[] args) {

		int n = 15;
		System.out.println(n);
		System.out.println("Le contenu de n est : " +n); //Diff�rents affichages
		
		System.out.println("Le double de n est "+ n+n + "."); //R�sultat 1515
		
		System.out.println("Le double de n est "+ (n+n)+"."); //R�sultat 30
		
		System.out.println(n+ " est �gale � " + n + "."); //15 est �gal � 15
	
		System.out.println(n+n + " est le double de n" + "."); // Au d�but pas besoin de parenth�se
		
		
		
		// Ex avec multiplication
		System.out.println("Le produit de n*n est "+ n*n + ".");
		
		
		
		
		
		// CONCATENATION SE FAIT AVEC LE + 
		
		
		
		
		

	}

}
