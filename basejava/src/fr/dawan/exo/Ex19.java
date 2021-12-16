package fr.dawan.exo;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {


		Scanner clavier = new Scanner(System.in);
		
		int nombre = 0;
		
		do {	
			System.out.println("Entrer un nombre entre 1 et 1000 : ");
			nombre = clavier.nextInt(); 
		
			
		if(nombre < 224) {
		System.out.println("Le nombre "+ nombre +" est trop petit, veuillez réessayer :"); 
		}
		
		else if(nombre > 224) {
		System.out.println("Le nombre "+ nombre +" est trop grand, veuillez réessayer : "); 
		}
		
			
		} while(nombre != 224); {
		System.out.println("Le "+ nombre +" est le bon numéro !"); 
		
		}
	}	
}				 
	
		

