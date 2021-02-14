package ex014;

public class StringFormatter {

  
  public static String formatCoordinate(int x, int y) {
    return String.format("(%d,%d)", x, y);
  }
  public static String formatDollarAmount(double a) {
    return String.format("$ %.2f", a);
  }
  public static String formatProperties(String a, boolean x, boolean y) {
    return String.format("Class: %s; accessible: %b; mutable: %b", a, x, y);
  }
  public static String formatTableRow(String b, double x, long y, int z) {
    return String.format("| %-20s | %8.2f | %08d | %-5d |", b, x, y, z);
  }
}
