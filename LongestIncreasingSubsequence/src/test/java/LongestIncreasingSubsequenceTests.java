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
    private int[] testCase6;
    private int[] testCase7;
    private int[] testCase8;
    private int[] testCase9;
    private int[] testCase10;
    private int[] testCase11;
    private int[] testCase12;
    private int[] testCase13;
    private int[] testCase14;
    private LongestIncreasingSubsequenceController longestIncreasingSubsequenceController;

    @BeforeAll
    public void setUp() {
        testCase1 = TestCases.testCase1;
        testCase2 = TestCases.testCase2;
        testCase3 = TestCases.testCase3;
        testCase4 = TestCases.testCase4;
        testCase5 = TestCases.testCase5;
        testCase6 = TestCases.testCase6;
        testCase7 = TestCases.testCase7;
        testCase8 = TestCases.testCase8;
        testCase9 = TestCases.testCase9;
        testCase10 = TestCases.testCase10;
        testCase11 = TestCases.testCase11;
        testCase12 = TestCases.testCase12;
        testCase13 = TestCases.testCase13;
        testCase14 = TestCases.testCase14;
        longestIncreasingSubsequenceController = new LongestIncreasingSubsequenceController();
    }

    @Test
    public void TestCase_1_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(2, longestIncreasingSubsequenceController.runBruteForceSolution(testCase1), "BruteForce: ");
        Assertions.assertEquals(2, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase1), "DynamicProgramming: ");
        Assertions.assertEquals(2, longestIncreasingSubsequenceController.runGreedySolution(testCase1), "Greedy: ");
        System.out.println("TestCase1 Runtime: ");
        String runTime1 = longestIncreasingSubsequenceController.getBruteForceSolutionRuntime(testCase1);
        System.out.println("Brute Force: " + runTime1 + " nanoseconds.");
        String runTime2 = longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase1);
        System.out.println("DynamicProgramming: " + runTime2 + " nanoseconds.");
        String runTime3 = longestIncreasingSubsequenceController.getGreedyRuntime(testCase1);
        System.out.println("Greedy: " + runTime3 + " nanoseconds.");
        System.out.println();
    }

    @Test
    public void TestCase_2_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(5, longestIncreasingSubsequenceController.runBruteForceSolution(testCase2), "BruteForce: ");
        Assertions.assertEquals(5, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase2), "DynamicProgramming: ");
        Assertions.assertEquals(5, longestIncreasingSubsequenceController.runGreedySolution(testCase2), "Greedy: ");
        System.out.println("TestCase2 Runtime: ");
        String runTime1 = longestIncreasingSubsequenceController.getBruteForceSolutionRuntime(testCase2);
        System.out.println("Brute Force: " + runTime1 + " nanoseconds.");
        String runTime2 = longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase2);
        System.out.println("DynamicProgramming: " + runTime2 + " nanoseconds.");
        String runTime3 = longestIncreasingSubsequenceController.getGreedyRuntime(testCase2);
        System.out.println("Greedy: " + runTime3 + " nanoseconds.");
        System.out.println();
    }

    @Test
    public void TestCase_3_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(3, longestIncreasingSubsequenceController.runBruteForceSolution(testCase3), "BruteForce: ");
        Assertions.assertEquals(3, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase3), "DynamicProgramming: ");
        Assertions.assertEquals(3, longestIncreasingSubsequenceController.runGreedySolution(testCase3), "Greedy: ");
        System.out.println("TestCase3 Runtime: ");
        String runTime1 = longestIncreasingSubsequenceController.getBruteForceSolutionRuntime(testCase3);
        System.out.println("Brute Force: " + runTime1 + " nanoseconds.");
        String runTime2 = longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase3);
        System.out.println("DynamicProgramming: " + runTime2 + " nanoseconds.");
        String runTime3 = longestIncreasingSubsequenceController.getGreedyRuntime(testCase3);
        System.out.println("Greedy: " + runTime3 + " nanoseconds.");
        System.out.println();
    }

    @Test
    public void TestCase_4_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(9, longestIncreasingSubsequenceController.runBruteForceSolution(testCase4), "BruteForce: ");
        Assertions.assertEquals(9, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase4), "DynamicProgramming: ");
        Assertions.assertEquals(9, longestIncreasingSubsequenceController.runGreedySolution(testCase4), "Greedy: ");
        System.out.println("TestCase4 Runtime: ");
        String runTime1 = longestIncreasingSubsequenceController.getBruteForceSolutionRuntime(testCase4);
        System.out.println("Brute Force: " + runTime1 + " nanoseconds.");
        String runTime2 = longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase4);
        System.out.println("DynamicProgramming: " + runTime2 + " nanoseconds.");
        String runTime3 = longestIncreasingSubsequenceController.getGreedyRuntime(testCase4);
        System.out.println("Greedy: " + runTime3 + " nanoseconds.");
        System.out.println();
    }

    @Test
    public void TestCase_5_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(10, longestIncreasingSubsequenceController.runBruteForceSolution(testCase5), "BruteForce: ");
        Assertions.assertEquals(10, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase5), "DynamicProgramming: ");
        Assertions.assertEquals(10, longestIncreasingSubsequenceController.runGreedySolution(testCase5), "Greedy: ");
        System.out.println("TestCase5 Runtime: ");
        String runTime1 = longestIncreasingSubsequenceController.getBruteForceSolutionRuntime(testCase5);
        System.out.println("Brute Force: " + runTime1 + " nanoseconds.");
        String runTime2 = longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase5);
        System.out.println("DynamicProgramming: " + runTime2 + " nanoseconds.");
        String runTime3 = longestIncreasingSubsequenceController.getGreedyRuntime(testCase5);
        System.out.println("Greedy: " + runTime3 + " nanoseconds.");
        System.out.println();
    }

    @Test
    public void TestCase_6_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(10, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase6), "DynamicProgramming: ");
        Assertions.assertEquals(10, longestIncreasingSubsequenceController.runGreedySolution(testCase6), "Greedy: ");
        System.out.println("TestCase6 Runtime: ");
        String runTime2 = longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase6);
        System.out.println("DynamicProgramming: " + runTime2 + " nanoseconds.");
        String runTime3 = longestIncreasingSubsequenceController.getGreedyRuntime(testCase6);
        System.out.println("Greedy: " + runTime3 + " nanoseconds.");
        System.out.println();
    }

    @Test
    public void TestCase_7_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(14, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase7), "DynamicProgramming: ");
        Assertions.assertEquals(14, longestIncreasingSubsequenceController.runGreedySolution(testCase7), "Greedy: ");
        System.out.println("TestCase7 Runtime: ");
        String runTime2 = longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase7);
        System.out.println("DynamicProgramming: " + runTime2 + " nanoseconds.");
        String runTime3 = longestIncreasingSubsequenceController.getGreedyRuntime(testCase7);
        System.out.println("Greedy: " + runTime3 + " nanoseconds.");
        System.out.println();
    }

    @Test
    public void TestCase_8_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(14, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase8), "DynamicProgramming: ");
        Assertions.assertEquals(14, longestIncreasingSubsequenceController.runGreedySolution(testCase8), "Greedy: ");
        System.out.println("TestCase8 Runtime: ");
        String runTime2 = longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase8);
        System.out.println("DynamicProgramming: " + runTime2 + " nanoseconds.");
        String runTime3 = longestIncreasingSubsequenceController.getGreedyRuntime(testCase8);
        System.out.println("Greedy: " + runTime3 + " nanoseconds.");
        System.out.println();
    }

    @Test
    public void TestCase_9_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(15, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase9), "DynamicProgramming: ");
        Assertions.assertEquals(15, longestIncreasingSubsequenceController.runGreedySolution(testCase9), "Greedy: ");
        System.out.println("TestCase9 Runtime: ");
        String runTime2 = longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase9);
        System.out.println("DynamicProgramming: " + runTime2 + " nanoseconds.");
        String runTime3 = longestIncreasingSubsequenceController.getGreedyRuntime(testCase9);
        System.out.println("Greedy: " + runTime3 + " nanoseconds.");
        System.out.println();
    }

    @Test
    public void TestCase_10_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(15, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase10), "DynamicProgramming: ");
        Assertions.assertEquals(15, longestIncreasingSubsequenceController.runGreedySolution(testCase10), "Greedy: ");
        System.out.println("TestCase10 Runtime: ");
        String runTime2 = longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase10);
        System.out.println("DynamicProgramming: " + runTime2 + " nanoseconds.");
        String runTime3 = longestIncreasingSubsequenceController.getGreedyRuntime(testCase10);
        System.out.println("Greedy: " + runTime3 + " nanoseconds.");
        System.out.println();
    }

    @Test
    public void TestCase_11_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(19, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase11), "DynamicProgramming: ");
        Assertions.assertEquals(19, longestIncreasingSubsequenceController.runGreedySolution(testCase11), "Greedy: ");
        System.out.println("TestCase11 Runtime: ");
        String runTime2 = longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase11);
        System.out.println("DynamicProgramming: " + runTime2 + " nanoseconds.");
        String runTime3 = longestIncreasingSubsequenceController.getGreedyRuntime(testCase11);
        System.out.println("Greedy: " + runTime3 + " nanoseconds.");
        System.out.println();
    }

    @Test
    public void TestCase_12_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(19, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase12), "DynamicProgramming: ");
        Assertions.assertEquals(19, longestIncreasingSubsequenceController.runGreedySolution(testCase12), "Greedy: ");
        System.out.println("TestCase12 Runtime: ");
        String runTime2 = longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase12);
        System.out.println("DynamicProgramming: " + runTime2 + " nanoseconds.");
        String runTime3 = longestIncreasingSubsequenceController.getGreedyRuntime(testCase12);
        System.out.println("Greedy: " + runTime3 + " nanoseconds.");
        System.out.println();
    }

    @Test
    public void TestCase_13_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(27, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase13), "DynamicProgramming: ");
        Assertions.assertEquals(27, longestIncreasingSubsequenceController.runGreedySolution(testCase13), "Greedy: ");
        System.out.println("TestCase13 Runtime: ");
        String runTime2 = longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase13);
        System.out.println("DynamicProgramming: " + runTime2 + " nanoseconds.");
        String runTime3 = longestIncreasingSubsequenceController.getGreedyRuntime(testCase13);
        System.out.println("Greedy: " + runTime3 + " nanoseconds.");
        System.out.println();
    }

    @Test
    public void TestCase_14_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(34, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase14), "DynamicProgramming: ");
        Assertions.assertEquals(34, longestIncreasingSubsequenceController.runGreedySolution(testCase14), "Greedy: ");
        System.out.println("TestCase14 Runtime: ");
        String runTime2 = longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase14);
        System.out.println("DynamicProgramming: " + runTime2 + " nanoseconds.");
        String runTime3 = longestIncreasingSubsequenceController.getGreedyRuntime(testCase14);
        System.out.println("Greedy: " + runTime3 + " nanoseconds.");
        System.out.println();
    }
}
