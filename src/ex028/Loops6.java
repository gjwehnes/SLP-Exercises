package ex028;
/*
 * Write a method investmentCalculator that checks how many years it would take for an initial
 * investment to reach a target investment, given compound growth at an annual interest rate.
 * 
 * Note: The core of this calculation is simple, and can be written with a while loop.
 * However, there are two unusual cases which would give you an infinite loop, because the
 * initial investment would never reach the target investment. You will need to handle these
 * separately.
 * 
 * See the unit tests for example output.
*/
public class Loops6 {

	public static int investmentCalculator(double initialAmount, double percent, double targetAmount) {

		int count = 0;

		if (percent <= 0) {
			return -1;
		}
		else if (initialAmount == 0) {
			return -1;
		}
		else {
			while (initialAmount < targetAmount) {
				count++;
				initialAmount *= (1 + (percent / 100.0));
			}
			return count;
		}		
	}
	
}
	