package ex019;
/*
 * Write method getSignum that calculates whether an integer is positive, negative, or zero:
*/
public class ConditionalStatements2 {

	public static String getSignum(int number) {
		if (number < 0) {
			return "negative";
		}
		else if (number > 0) {
			return "positive";
		}
		else {
			return "zero";
		}
	}
	
}
