package ex016;
/*
 * Create two methods that help a bakery calculate how many boxes will be required
 * for an order of donuts. Each box can contain up to 12 donuts. Each order will require at
 * minimum one box, and obviously the bakery wants to use the minimum amount of boxes.
*/
public class DonutBoxes {
	
	public static int calculateBoxes(int numberOfDonuts) {
		return ( (numberOfDonuts + 11)/12);
	}
	
	public static int calculateRemainder(int numberOfDonuts) {
		if (numberOfDonuts%12 == 0) {
			return 12;
		}
		else {
			return (numberOfDonuts % 12);
		}
	}

}
