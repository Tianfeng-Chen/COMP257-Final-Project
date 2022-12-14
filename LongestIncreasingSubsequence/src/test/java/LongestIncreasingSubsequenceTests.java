import Controller.LongestIncreasingSubsequenceController;
import Util.RuntimePlot;
import Util.TestCases;
import javafx.stage.Stage;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LongestIncreasingSubsequenceTests {
    private int[] testCase1;
    private int[] testCase2;
    private int[] testCase3;
    private int[] testCase4;
    private int[] testCase5;
    private LongestIncreasingSubsequenceController longestIncreasingSubsequenceController;
    private RuntimePlot runtimePlot;

    @BeforeAll
    public void setUp() {
        testCase1 = TestCases.testCase1;
        testCase2 = TestCases.testCase2;
        testCase3 = TestCases.testCase3;
        testCase4 = TestCases.testCase4;
        testCase5 = TestCases.testCase5;
        longestIncreasingSubsequenceController = new LongestIncreasingSubsequenceController();
        runtimePlot = new RuntimePlot();
    }

    @Test
    public void TestCase_1_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(5, longestIncreasingSubsequenceController.runBruteForceSolution(testCase1), "BruteForce: ");
        Assertions.assertEquals(5, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase1), "DynamicProgramming: ");
        Assertions.assertEquals(5, longestIncreasingSubsequenceController.runGreedySolution(testCase1), "Greedy: ");
        System.out.println("TestCase1 Runtime: ");
        String runTime1 = longestIncreasingSubsequenceController.getBruteForceSolutionRuntime(testCase1);
        runtimePlot.addValueToYAxis(RuntimePlot.Type.BruteForce, runTime1);
        System.out.println("Brute Force: " + runTime1 + " nanoseconds.");
        String runTime2 = longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase1);
        runtimePlot.addValueToYAxis(RuntimePlot.Type.DynamicProgramming, runTime2);
        System.out.println("DynamicProgramming: " + runTime2 + " nanoseconds.");
        String runTime3 = longestIncreasingSubsequenceController.getGreedyRuntime(testCase1);
        runtimePlot.addValueToYAxis(RuntimePlot.Type.Greedy, runTime3);
        System.out.println("Greedy: " + runTime3 + " nanoseconds.");
        System.out.println();
    }

    @Test
    public void TestCase_2_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(7, longestIncreasingSubsequenceController.runBruteForceSolution(testCase2), "BruteForce: ");
        Assertions.assertEquals(7, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase2), "DynamicProgramming: ");
        Assertions.assertEquals(7, longestIncreasingSubsequenceController.runGreedySolution(testCase2), "Greedy: ");
        System.out.println("TestCase2 Runtime: ");
        String runTime1 = longestIncreasingSubsequenceController.getBruteForceSolutionRuntime(testCase2);
        runtimePlot.addValueToYAxis(RuntimePlot.Type.BruteForce, runTime1);
        System.out.println("Brute Force: " + runTime1 + " nanoseconds.");
        String runTime2 = longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase2);
        runtimePlot.addValueToYAxis(RuntimePlot.Type.DynamicProgramming, runTime2);
        System.out.println("DynamicProgramming: " + runTime2 + " nanoseconds.");
        String runTime3 = longestIncreasingSubsequenceController.getGreedyRuntime(testCase2);
        runtimePlot.addValueToYAxis(RuntimePlot.Type.Greedy, runTime3);
        System.out.println("Greedy: " + runTime3 + " nanoseconds.");
        System.out.println();
    }

    @Test
    public void TestCase_3_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(10, longestIncreasingSubsequenceController.runBruteForceSolution(testCase3), "BruteForce: ");
        Assertions.assertEquals(10, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase3), "DynamicProgramming: ");
        Assertions.assertEquals(10, longestIncreasingSubsequenceController.runGreedySolution(testCase3), "Greedy: ");
        System.out.println("TestCase3 Runtime: ");
        String runTime1 = longestIncreasingSubsequenceController.getBruteForceSolutionRuntime(testCase3);
        runtimePlot.addValueToYAxis(RuntimePlot.Type.BruteForce, runTime1);
        System.out.println("Brute Force: " + runTime1 + " nanoseconds.");
        String runTime2 = longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase3);
        runtimePlot.addValueToYAxis(RuntimePlot.Type.DynamicProgramming, runTime2);
        System.out.println("DynamicProgramming: " + runTime2 + " nanoseconds.");
        String runTime3 = longestIncreasingSubsequenceController.getGreedyRuntime(testCase3);
        runtimePlot.addValueToYAxis(RuntimePlot.Type.Greedy, runTime3);
        System.out.println("Greedy: " + runTime3 + " nanoseconds.");
        System.out.println();
    }

    @Test
    public void TestCase_4_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(15, longestIncreasingSubsequenceController.runBruteForceSolution(testCase4), "BruteForce: ");
        Assertions.assertEquals(15, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase4), "DynamicProgramming: ");
        Assertions.assertEquals(15, longestIncreasingSubsequenceController.runGreedySolution(testCase4), "Greedy: ");
        System.out.println("TestCase4 Runtime: ");
        String runTime1 = longestIncreasingSubsequenceController.getBruteForceSolutionRuntime(testCase4);
        runtimePlot.addValueToYAxis(RuntimePlot.Type.BruteForce, runTime1);
        System.out.println("Brute Force: " + runTime1 + " nanoseconds.");
        String runTime2 = longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase4);
        runtimePlot.addValueToYAxis(RuntimePlot.Type.DynamicProgramming, runTime2);
        System.out.println("DynamicProgramming: " + runTime2 + " nanoseconds.");
        String runTime3 = longestIncreasingSubsequenceController.getGreedyRuntime(testCase4);
        runtimePlot.addValueToYAxis(RuntimePlot.Type.Greedy, runTime3);
        System.out.println("Greedy: " + runTime3 + " nanoseconds.");
        System.out.println();
    }

    @Test
    public void TestCase_5_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(15, longestIncreasingSubsequenceController.runBruteForceSolution(testCase5), "BruteForce: ");
        Assertions.assertEquals(15, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase5), "DynamicProgramming: ");
        Assertions.assertEquals(15, longestIncreasingSubsequenceController.runGreedySolution(testCase5), "Greedy: ");
        System.out.println("TestCase5 Runtime: ");
        String runTime1 = longestIncreasingSubsequenceController.getBruteForceSolutionRuntime(testCase5);
        runtimePlot.addValueToYAxis(RuntimePlot.Type.BruteForce, runTime1);
        System.out.println("Brute Force: " + runTime1 + " nanoseconds.");
        String runTime2 = longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase5);
        runtimePlot.addValueToYAxis(RuntimePlot.Type.DynamicProgramming, runTime2);
        System.out.println("DynamicProgramming: " + runTime2 + " nanoseconds.");
        String runTime3 = longestIncreasingSubsequenceController.getGreedyRuntime(testCase5);
        runtimePlot.addValueToYAxis(RuntimePlot.Type.Greedy, runTime3);
        System.out.println("Greedy: " + runTime3 + " nanoseconds.");
        System.out.println();
    }

    @AfterAll
    public void showPlot() throws Exception {
        runtimePlot.start(new Stage());
    }
}
