import java.util.List;
import org.junit.runner.*;

public class Main {

  static JUnitCore core = new JUnitCore();
  static int totalRunCount = 0;
  static int totalFailureCount = 0;

  public static void main(String[] args) {

    runTest(ex001.MainTest.class);
    runTest(ex002.MainTest.class);
    runTest(ex003.MainTest.class);
    runTest(ex004.MainTest.class);
    runTest(ex005.MainTest.class);
    runTest(ex006.StudentTest.class);
    runTest(ex007.BicycleTest.class);
    runTest(ex008.DogTest.class);
    runTest(ex009.CarTest.class);
    runTest(ex010.StoreProductTest.class);
    runTest(ex011.StockTest.class);
    runTest(ex012.PersonTest.class);
    runTest(ex013.InchWormTest.class);
    runTest(ex014.StringFormatterTest.class);

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
