package fr.�meraude.apprentissage;

public class main {

	public static void main(String[] args) {
		
		String pseudo = "Emeraude";
		int age = 248;
		//pour d�finir une variable il fait choisir en amontquel type de variable utiliser
		//ici String cha�ne de carct�re et int entier
		
		
		System.out.println(pseudo + age);
		//envoyer un message ou autre dans la console, ln rajoute des sauts de ligne print() existe
	
		age = age + 1;
		//possible age ++ ou -- ...
				
		System.out.println(pseudo + age);
		
		age += 5;
		System.out.println(pseudo + age);
		
		float note1 = 10;
		float note2 = 4;
		float note3 = 9;
		//de base l'exemple ts avec int mais sinon pas possible d'avoir autre chose qu'un entier en r�sultat du calcul
		
		float calcul = (note1 + note2 + note3)/3;
		System.out.println(calcul);
		
		System.out.println("le pseudo change");
		pseudo = "Emeraude248";
		System.out.println(pseudo + " bravo !!");
		
	}

}
