package fr.dawan.syntaxe.opérateur;

public class OperateurIncrementationEtDecrementation {

	public static void main(String[] args) {
		
		// Incrementation et decrementation ++
		
		int c = 10;
		c++; //= c = 10+1 / ON AJOUTE 1 
		System.out.println(c);
		
		
		int d = 15;
		d--; // = d = d-1 / ON ENLEVE 1 
		System.out.println(d);
		
		// POST-INCREMENTATION & PRE-INCREMENTATION
		
		// Grande différence entre écrire e++ et ++e
		// PRE INCREMENTATION => ++e ajoute dabord 1 puis affiche e
		// POST INCREMENTATION => e++ affiche e et apres ajoute 1
		// On affiche avant d'incrémenter

		int e = 10;
		System.out.println("Post-incrémentation: " + e++);
		System.out.println("Pre-incrémentation: " + ++e);
		
		int f = 10;
		System.out.println("Pré incré: " + ++f);
		System.out.println("post incré: " + f++);
		
		int g = 10;
		System.out.println("pre incré: "+ ++g);
		System.out.println("post incré: "+ g++);
		
		
		
	}

}
