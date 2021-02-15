package ex022;
/*
 * Write method maximumOfThree that finds the longest of three strings.
 * 
 * In this case, you do not have methods that can directly determine which string is longest,
 * so you will need to use conditional statements.
*/
public class ConditionalStatements6{

	public static String longestWord(String wordA, String wordB, String wordC) {
		if (wordA.length() > wordB.length()) {
			if (wordA.length() > wordC.length()) {
				return wordA;
			}
			else {
				return wordC;
			}
		} else {
			if (wordB.length() > wordC.length()) {
				return wordB;
			}
			else {
				return wordC;
			}
		}
	}
	
}
