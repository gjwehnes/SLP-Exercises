package ex020;
/*
 * Write method getAnimal that returns whether the breed passed in represents a dog, cat, or other
 * 
 * You don't have to make this list exhaustive; you only need to handle the inputs given in the unit test.
*/

public class ConditionalStatements3 {

	public static String getAnimal(String breed) {
				
		if (breed.equals("husky") || breed.equals("shepherd") || breed.equals("beagle")) {
			return "dog";
		}
		else if (breed.equals("siamese") || breed.equals("persian") || breed.equals("sphynx")) {
			return "cat";
		}
		else {
			return "other";
		}
	}
	
}
