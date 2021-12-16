package fr.dawan.syntaxe.util;

public class ClassMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		;
		
		System.out.println("La racine carré de 25 est " + Math.sqrt(25));
		System.out.println("PI = " + Math.PI);
		// On veut arrondir PI a 3.14
		
		System.out.println("PI_arrondi = " + Math.round(Math.PI*100.0)/100.0);
		
		//Avoir Cosinus d'un angle (180°)
		System.out.println("Le cosinus de 180° est: " + Math.cos(180));
		// On attend un angle en radian donc 180° en radian
		double angle = (180*Math.PI)/180;
		System.out.println("Le cosinus de 180° est: " + Math.cos(angle));
		
		System.out.println("Le cosinus de 180° est: " + Math.cos(Math.toRadians(180)));
	
		
		
		
		
		
		
		
	}

}
