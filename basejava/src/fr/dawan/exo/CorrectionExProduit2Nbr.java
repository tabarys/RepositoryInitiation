package fr.dawan.exo;

import java.util.Scanner;

public class CorrectionExProduit2Nbr {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer le 1er nombre: ");
		
		int num = clavier.nextInt();
		
		System.out.println("Entrer le 2eme nombre: ");
		int num1 = clavier.nextInt();
		
		System.out.println(num+ "x" + num1 + " = " + num*num1);
		
		// Pour décimales, mettre "double"
		
		

	}

}
