import java.util.List;
import org.junit.runner.*;

public class Main {

  static JUnitCore core = new JUnitCore();
  static int totalRunCount = 0;
  static int totalFailureCount = 0;

  public static void main(String[] args) {

    runTest(ex015.DividerTest.class);
    runTest(ex016.DonutBoxesTest.class);
    runTest(ex017.MaximumTest.class);
    runTest(ex018.ConditionalStatements1Test.class);
    runTest(ex019.ConditionalStatements2Test.class);
    runTest(ex020.ConditionalStatements3Test.class);
    runTest(ex021.ConditionalStatements4Test.class);
    runTest(ex022.ConditionalStatements6Test.class);
    runTest(ex023.Loops1Test.class);
    runTest(ex024.Loops2Test.class);
    runTest(ex025.Loops3Test.class);
    runTest(ex026.Loops4Test.class);
    runTest(ex027.Loops5Test.class);
    runTest(ex028.Loops6Test.class);

    System.out.println("*** TOTAL ***");
    System.out.println(String.format("[%10d tests started         ]", totalRunCount));
    System.out.println(String.format("[%10d tests failed          ]", totalFailureCount));

  }

  private static void runTest(Class testClass) {

	String className = testClass.toString().substring(5);
    System.out.println("*** " + className + " ***");

	Result result = core.run(testClass);

	List<org.junit.runner.notification.Failure> failures = result.getFailures();

    if (failures.size() > 0) {
        System.out.println(String.format("Failures (%d)", failures.size()));
        for (org.junit.runner.notification.Failure failure : failures) {
            System.out.println("Test:   " + failure.getTestHeader());
            System.out.println("Msg:    " + failure.getMessage());
            
            String[] trace = failure.getTrace().split("\\r?\\n");
            for (int i = 0; i < trace.length; i++) {
            	if (trace[i].contains(className)) {
                    System.out.println("Trace:  " + trace[i]);
            	}
            }
        }
    }

    System.out.println(String.format("Test run finished after %d ms", result.getRunTime()));
    System.out.println(String.format("[%10d tests started         ]", result.getRunCount()));
    System.out.println(String.format("[%10d tests failed          ]", result.getFailureCount()));

    totalRunCount += result.getRunCount();
    totalFailureCount += result.getFailureCount();

  }

  
}
