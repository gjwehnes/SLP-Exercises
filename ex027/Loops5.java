public class Loops5 {
    public static int getTimesDivisible(int number, int divisor) {

    	if (divisor == 0 || divisor == 1) { 
    		throw new ArithmeticException();
    	};
    	
    	if (number < 0 || divisor < 0) { 
    		throw new IllegalArgumentException();
    	};
    	
    	
    	int count = 0;
        while (number >= divisor) {
            number /= divisor;
            count++;
        }
        return count;
    }

}