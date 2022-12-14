import Controller.LongestIncreasingSubsequenceController;
import Util.TestCases;
import org.junit.jupiter.api.*;

public class LongestIncreasingSubsequenceTests {
    private int[] testCase1;
    private int[] testCase2;
    private int[] testCase3;
    private int[] testCase4;
    private int[] testCase5;
    private LongestIncreasingSubsequenceController longestIncreasingSubsequenceController;

    @BeforeEach
    public void setUp() {
        testCase1 = TestCases.testCase1;
        testCase2 = TestCases.testCase2;
        testCase3 = TestCases.testCase3;
        testCase4 = TestCases.testCase4;
        testCase5 = TestCases.testCase5;
        longestIncreasingSubsequenceController = new LongestIncreasingSubsequenceController();
    }

    @Test
    public void TestCase_1_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(5, longestIncreasingSubsequenceController.runBruteForceSolution(testCase1), "BruteForce: ");
        Assertions.assertEquals(5, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase1), "DynamicProgramming: ");
        Assertions.assertEquals(5, longestIncreasingSubsequenceController.runGreedySolution(testCase1), "Greedy: ");
        System.out.println("TestCase1 Runtime: ");
        System.out.println("Brute Force: " + longestIncreasingSubsequenceController.getBruteForceSolutionRuntime(testCase1));
        System.out.println("DP: " + longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase1));
        System.out.println("Greedy: " + longestIncreasingSubsequenceController.getGreedyRuntime(testCase1));
        System.out.println();
    }

    @Test
    public void TestCase_2_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(7, longestIncreasingSubsequenceController.runBruteForceSolution(testCase2), "BruteForce: ");
        Assertions.assertEquals(7, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase2), "DynamicProgramming: ");
        Assertions.assertEquals(7, longestIncreasingSubsequenceController.runGreedySolution(testCase2), "Greedy: ");
        System.out.println("TestCase2 Runtime: ");
        System.out.println("Brute Force: " + longestIncreasingSubsequenceController.getBruteForceSolutionRuntime(testCase2));
        System.out.println("DP: " + longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase2));
        System.out.println("Greedy: " + longestIncreasingSubsequenceController.getGreedyRuntime(testCase2));
        System.out.println();
    }

    @Test
    public void TestCase_3_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(10, longestIncreasingSubsequenceController.runBruteForceSolution(testCase3), "BruteForce: ");
        Assertions.assertEquals(10, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase3), "DynamicProgramming: ");
        Assertions.assertEquals(10, longestIncreasingSubsequenceController.runGreedySolution(testCase3), "Greedy: ");
        System.out.println("TestCase3 Runtime: ");
        System.out.println("Brute Force: " + longestIncreasingSubsequenceController.getBruteForceSolutionRuntime(testCase3));
        System.out.println("DP: " + longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase3));
        System.out.println("Greedy: " + longestIncreasingSubsequenceController.getGreedyRuntime(testCase3));
        System.out.println();
    }

    @Test
    public void TestCase_4_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(15, longestIncreasingSubsequenceController.runBruteForceSolution(testCase4), "BruteForce: ");
        Assertions.assertEquals(15, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase4), "DynamicProgramming: ");
        Assertions.assertEquals(15, longestIncreasingSubsequenceController.runGreedySolution(testCase4), "Greedy: ");
        System.out.println("TestCase4 Runtime: ");
        System.out.println("Brute Force: " + longestIncreasingSubsequenceController.getBruteForceSolutionRuntime(testCase4));
        System.out.println("DP: " + longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase4));
        System.out.println("Greedy: " + longestIncreasingSubsequenceController.getGreedyRuntime(testCase4));
        System.out.println();
    }

    @Test
    public void TestCase_5_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(15, longestIncreasingSubsequenceController.runBruteForceSolution(testCase5), "BruteForce: ");
        Assertions.assertEquals(15, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase5), "DynamicProgramming: ");
        Assertions.assertEquals(15, longestIncreasingSubsequenceController.runGreedySolution(testCase5), "Greedy: ");
        System.out.println("TestCase5 Runtime: ");
        System.out.println("Brute Force: " + longestIncreasingSubsequenceController.getBruteForceSolutionRuntime(testCase5));
        System.out.println("DP: " + longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase5));
        System.out.println("Greedy: " + longestIncreasingSubsequenceController.getGreedyRuntime(testCase5));
        System.out.println();
    }
}
