package fr.dawan.syntaxe.Transtypage;

public class ConcatenationVariables {

	public static void main(String[] args) {

		int n = 15;
		System.out.println(n);
		System.out.println("Le contenu de n est : " +n); //Différents affichages
		
		System.out.println("Le double de n est "+ n+n + "."); //Résultat 1515
		
		System.out.println("Le double de n est "+ (n+n)+"."); //Résultat 30
		
		System.out.println(n+ " est égale à " + n + "."); //15 est égal à 15
	
		System.out.println(n+n + " est le double de n" + "."); // Au début pas besoin de parenthèse
		
		
		
		// Ex avec multiplication
		System.out.println("Le produit de n*n est "+ n*n + ".");
		
		
		
		
		
		// CONCATENATION SE FAIT AVEC LE + 
		
		
		
		
		

	}

}
