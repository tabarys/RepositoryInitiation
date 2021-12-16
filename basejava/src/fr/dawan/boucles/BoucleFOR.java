package fr.dawan.boucles;

public class BoucleFOR {

	/*BOUCLES
Elles sont souvent utilisées pour parcourir des éléments énumérables, 
comme le sont les tableaux ou les listes. Elles peuvent également être utilisées 
pour effectuer la même action tant qu'une condition n'est pas réalisée.
·        On utilise la boucle for pour répéter des instructions tant qu'une 
condition n'est pas vérifiée, les éléments de la condition changeant à chaque itération
·        On utilise en général la boucle for pour parcourir un tableau, 
avec un indice qui s'incrémente à chaque itération.
·        La boucle foreach est utilisée pour simplifier le parcours 
des tableaux ou des listes.
·        La boucle while permet de répéter des instructions tant qu'une condition 
n'est pas vérifiée. C'est la boucle la plus souple.
·         WHILE Versus DO-WHILE
◦   DO-WHILE :  La condition est testée à la fin, on est donc sûre de passer dans 
le bloc d'instruction au moins une fois
◦   WHILE : La condition est vérifiée avant, si la condition est fausse, on ne passe 
pas dans le bloc d'instruction
·        Il faut faire attention aux conditions de sortie d'une boucle afin d'éviter 
les boucles infinies qui font planter l'application.
*/
	
	public static void main(String[] args) {
// Qu'est-ce qu'une boucle ? Permet de pas répéter le même code = 
// REPETE PLUSIEUR FOIS LA MEME OPERATION (un certain nombre de fois)
		
	/*	System.out.println("Le double de 1 est : "+ 1*2);
		System.out.println("Le double de 1 est : "+ 2*2);
		System.out.println("Le double de 1 est : "+ 3*2);
		System.out.println("Le double de 1 est : "+ 4*2);
		System.out.println("Le double de 1 est : "+ 5*2);
		System.out.println("Le double de 1 est : "+ 6*2);
		*/
	// Travail en faut fastidieux, boucles pour eviter ca 
		// Boucle FOR = quand on connait le nombre d'itération (nbr de fois qu'on exécute l'éxecution) 
		
		
		// for(initialisation; condition; opération; {
		// instructions
		// } 
		// Opération permet de sortir de la boucle
		// 1) initialisation est exécuté 
		// 2) si la cond est fausse => sort de la boucle 
		// 3) bloc d'instruction est éxécuté 
		
		
		
		System.out.println("LA BOUCLE FOR");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Le double de " + i + " est " + i*2);
			
			// 10 est le nombre d'itération 
			
			
			
			
			
		}
	
	}

}
