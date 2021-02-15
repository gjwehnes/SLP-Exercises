package ex027;
/*
 * Write a method getTimesDivisible that checks how many times the divisor can be iteratively
 * divided (using integer division) into a given number.
 * 
 * Note: This is a simple algorithm to approximate the logarithm of a number!
 * See the unit tests for example output.
*/
public class Loops5 {

	public static int getTimesDivisible(int number, int divisor) {
		int count = 0;
		
		while (number / divisor >= 1) {
			count++;
			number /= divisor;
		}
		return count;
	}
	
}
	