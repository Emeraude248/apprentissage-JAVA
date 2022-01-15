//if similaire à JS, == != <= >=
//&& ||

package fr.émeraude.apprentissage;

public class main {

	public static void main(String[] args) {
		
		int age = 17;
		if(age >= 18) {
			System.out.println("oui");
		} else if(age <= 10){
			System.out.println("oui, très jeune");
		} else {
			System.out.println("non");
		}
		
	}

}


//switch quand répétition, quand beaucoup conditions

package fr.émeraude.apprentissage;

public class main {

	public static void main(String[] args) {
		
		int age = 33;
		
		switch(age) {
			case 10:
				System.out.println("la personne a 10 ans");
			break;
				
			case 17:
				System.out.println("la personne a 17 ans");
			break;
			
			default:
				System.out.println("rien à dire ^^");
		}
				
	}
}


//exemple

package fr.émeraude.apprentissage;

public class main {

	public static void main(String[] args) {
		
		int money = 800;
		int prix = 800;
		boolean hasPhone = true;
		
		if(money >= prix && !hasPhone) {
			System.out.println("C'est une bonne idée d'acheter un téléphone");
		} else if(money>= prix && hasPhone) {
			System.out.println("C'est du luxe de racheter un téléphone");
		} else {
			System.out.println("Pas possible d'acheter un téléphone");
			
		}
				
	}
}