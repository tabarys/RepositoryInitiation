package fr.dawan.syntaxe.Transtypage;

public class TranstypageImpliciteEtExplicite {

	public static void main(String[] args) {


		/* Qu'est ce qu'un transtypage ?
		 * IMPLICITE : type inférieur vers type supérieur. Concerne le passage d'un type inf vers un type sup
		 * il y a rien a faire !
		 * EXPLICITE : passage d'un type sup vers type inf
		 * Evite de faire un casting (=pour les conversions des types compatibles)
		 */

		int i = 42;
		double d = i;
		// Ici int plus petit que double donc rien a faire = IMPLICITE 
		System.out.println(d);
		
		int i1 = 123;
		short s = (short) i1; // = EXPLICITE 
		
		double d1 = 44.95;
		int i2 = (int) d1;
		// Perte de précision : il faut que le type qui recoit la valeur ait la capacité de contenir cette valeur
		// Ex: byte compris entre -128 et 127 
		
		
		int i3 = 200;
		byte b = (byte) i3;
		System.out.println(b);
		
// LE CASTING CONCERNE LES TYPES COMPATIBLES 
		
		
		
		
	}

}
