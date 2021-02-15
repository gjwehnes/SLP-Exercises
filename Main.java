import java.util.List;
import org.junit.runner.*;

public class Main {

  static JUnitCore core = new JUnitCore();
  static int totalRunCount = 0;
  static int totalFailureCount = 0;

  public static void main(String[] args) {

    runTest(ex015.Divider.class);

    System.out.println("*** TOTAL ***");
    System.out.println(String.format("[%10d tests started         ]", totalRunCount));
    System.out.println(String.format("[%10d tests failed          ]", totalFailureCount));

  }

  private static void runTest(Class testClass) {

    System.out.println("*** " + testClass.toString() + " ***");

	Result result = core.run(testClass);

	List<org.junit.runner.notification.Failure> failures = result.getFailures();

    if (failures.size() > 0) {
        System.out.println(String.format("Failures (%d)", failures.size()));
        for (org.junit.runner.notification.Failure failure : failures) {
            System.out.println("Test:   " + failure.getTestHeader());
            System.out.println("Msg:    " + failure.getMessage());
            //System.out.println("Trace:  " + failure.getTrace());
        }
    }

    System.out.println(String.format("Test run finished after %d ms", result.getRunTime()));
    System.out.println(String.format("[%10d tests started         ]", result.getRunCount()));
    System.out.println(String.format("[%10d tests failed          ]", result.getFailureCount()));

    totalRunCount += result.getRunCount();
    totalFailureCount += result.getFailureCount();

  }

  
}
