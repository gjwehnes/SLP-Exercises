package ex023;
/*
 * Write a for loop that will sum the whole numbers starting at 1 and ending at the input inclusive.
*/
public class Loops1 {

	public static int getSum(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}
	
}
	