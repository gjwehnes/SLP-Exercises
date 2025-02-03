
public class Loops2 {

    public static Object getRange(int start, int end, int increment) {
    	
    	if (increment <= 0) {
    		return "";
    	}
        String list = "";
        for (int counter = start; counter < end; counter = counter + increment) {
            String counterValue = String.valueOf(counter);
            list = list + "(" + counterValue + ")";
        }
        return list;
    }
}
