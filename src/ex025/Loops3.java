package ex025;
/*
 * Write a for loop that will loop through every letter of the input and strip out
 * all of the consonants. The output will thus contain only the vowels.
 * 
 * You do not need to worry about case: all input will be in lower case.
 * See the unit tests for example output.
*/
public class Loops3 {

	public static String stripConsonants(String input) {
		String output = "";
		
		for (int i = 0; i < input.length(); i++) {
			char n = input.charAt(i);
			if (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u' || n == 'y') {
				output += n;
			}
		}
		return output;
	}
	
}
	