package fr.dawan.syntaxe.op�rateur;

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
		
		// Grande diff�rence entre �crire e++ et ++e
		// PRE INCREMENTATION => ++e ajoute dabord 1 puis affiche e
		// POST INCREMENTATION => e++ affiche e et apres ajoute 1
		// On affiche avant d'incr�menter

		int e = 10;
		System.out.println("Post-incr�mentation: " + e++);
		System.out.println("Pre-incr�mentation: " + ++e);
		
		int f = 10;
		System.out.println("Pr� incr�: " + ++f);
		System.out.println("post incr�: " + f++);
		
		int g = 10;
		System.out.println("pre incr�: "+ ++g);
		System.out.println("post incr�: "+ g++);
		
		
		
	}

}
