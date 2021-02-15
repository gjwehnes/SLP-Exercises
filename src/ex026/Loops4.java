package ex026;
/*
 * Write a for loop that will reverse an input string.
 * You do not need to worry about case: all input will be in lower case.
 * See the unit tests for example output.
*/
public class Loops4 {

	public static String reverseString(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i); 
		}
		return output;
	}
	
}
	