package ex024;
/*
 * Write a for loop that will create a string containing every nth number between start and end (exclusive)
 * See the unit tests for example output.
*/
public class Loops2 {

	public static String getRange(int start, int end, int step) {
		String output = "";
		for (int i = start; i < end; i+=step) {
			output += "(" + Integer.toString(i) + ")";
		}
		return output;
	}
	
}
	