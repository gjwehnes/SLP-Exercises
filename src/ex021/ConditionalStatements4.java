package ex021;
/*
 * Changing a verb in English to a corresponding adverb is fairly straight forward in English.
 * 
 * There are three rules to follow:
 * -In most cases, we do this by simply adding -ly to the end of the adjective
 * -When the adjective you want to make into an adverb ends in -y, you must change the y to an i, then add -ly.
 * -When the adjective ends in -le, remove the e and replace it with a y.
 * 
 * Create a method makeAdjective which does exactly this.
*/
public class ConditionalStatements4 {

	public static String makeAdjective(String verb) {
		if (verb.substring(verb.length() - 2).equals("le")) {
			System.out.println("-le");
			return verb.substring(0, verb.length() - 2) + "ly";
		}
		else if (verb.substring(verb.length() - 1).equals("y")) {
			System.out.println("-y");
			return verb.substring(0, verb.length() - 1) + "ily";
		}
		else {
			System.out.println("normal");
			return verb + "ly";
		}
	}
	
}
