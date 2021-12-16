package fr.dawan.syntaxe.Transtypage;

public class TranstypageOutCasting {

	public static void main(String[] args) {
		int var1 = 4;
		int var2 = 10;
		
		//on veut obtenir 4/10=0.4 et pas seulement le 0 comme dans opérateurs
		
		int iquotient = var1/var2; 
		System.out.println("result= " + iquotient);//iquotient pour différencier du 2eme exo
		
		double quotient = var1/var2;
		System.out.println("result= " + quotient);
		
		// On a 4/10 = la division de deux entiers nous donne un résultat entier 
		// Pour avoir 0.4 il faut les décimales

		double _var1 = 4;
		double _var2 = 10;
		double _quotient= _var1/_var2;
		System.out.println("result: " + _quotient);
		
		// Comment garder var1 et var2 comme des entiers
		//Les types var1 et var2 peuvent être convertis en utilisant le casting 
		
		double quotient1 = (double) var1/var2; //Valeur (double) peut etre pour var1 ou var2
		System.out.println("result: " + quotient1);
		
		// CETAIT LE CASTING
		
		
		
		
	}

}
