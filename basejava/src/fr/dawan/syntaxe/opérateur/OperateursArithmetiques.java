package fr.dawan.syntaxe.opérateur;

public class OperateursArithmetiques {

	public static void main(String[] args) {
		int var1 = 4;
		int var2;
		
		//Pour utiliser une variable primitive, il faut l'initialiser
		
		// SI System.out.println("var2:"+var2); //Erreur car var2 pas initialisé 
		
		var2 = 10; 
		
		//Addition:
		int somme = var1+var2;
		System.out.println("somme =" + var1 + var2); // somme =410 
		System.out.println("somme =" + (var1 + var2)); // somme =14 
		
		// Soustraction 
		int soustraction = var1 - var2;
		System.out.println("result =" + soustraction);
		
		//Multiplication
		int produit = var1 * var2;
		// System.out.println(); // Pour écrire rapidement systou + ctrl esp
		System.out.println("produit=" + produit);
		
		
		// Division normalement = 0.4 mais n'affiche que le nombre entier
		int quotient = var1/var2;
		System.out.println("result=" + quotient);
		
	
		
		
	}

}
