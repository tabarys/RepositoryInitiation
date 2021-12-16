package fr.dawan.exo;

import java.util.Scanner;

public class Ex19Correction {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);
		
		int nombreSecret;
		int nombreUtilisateur;
		int NombreDeCoups = 1;
		
		
		/*do {	
			System.out.println("Entrer un nombre entre 1 et 1000 : ");
			nombre = clavier.nextInt(); 
		
			
		if(nombre < 224) {
		System.out.println("Le nombre "+ nombre +" est trop petit, veuillez réessayer :"); 
		}
		
		else {
		System.out.println("Le nombre "+ nombre +" est trop grand, veuillez réessayer : "); 
		}
		
		nombre = clavier.nextInt(); 
			
		} while(nombre == 224); {
		System.out.println("Le "+ nombre +" est le bon numéro !"); 
			}}}*/
		
		nombreSecret = (int)Math.random()*999+1; // Variable varie entre 1 et 1000 
		
		
	/*	do {
			System.out.println("Entrer un nbr entre 1 et 1000 :");
			nombreUtilisateur = clavier.nextInt();
			
			if(nombreUtilisateur == nombreSecret) {
				System.out.println("Trouvé en " );
			}
	//	} while(); 
		
		System.out.println(nombreSecret); */
		
		
		}
}