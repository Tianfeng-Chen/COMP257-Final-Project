import Controller.LongestIncreasingSubsequenceController;
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
        testCase1 = new int[]{10,9,2,5,3,7,101,18};
        testCase2 = new int[]{2,6,7,-1,3,10,0,90,50,2};
        testCase3 = new int[]{3,6,9,1,7,4,-3,-4,-90,10,-5,66};
        testCase4 = new int[]{100,10,15,9,16,27,6,1000,500,710,90,26,71,928,-69,-5,-6,0};
        testCase5 = new int[]{-90,-6,-100,-56,-101,-201,-99,-80,-70,-18,-10,-60,-1,-6};
        longestIncreasingSubsequenceController = new LongestIncreasingSubsequenceController();
    }

    @Test
    public void TestCase_1_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(4, longestIncreasingSubsequenceController.runBruteForceSolution(testCase1));
        Assertions.assertEquals(4, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase1));
        Assertions.assertEquals(4, longestIncreasingSubsequenceController.runGreedySolution(testCase1));
        System.out.println("TestCase1 Runtime: ");
        System.out.println("Brute Force: " + longestIncreasingSubsequenceController.getBruteForceSolutionRuntime(testCase1));
        System.out.println("DP: " + longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase1));
        System.out.println("Greedy: " + longestIncreasingSubsequenceController.getGreedyRuntime(testCase1));
    }

    @Test
    public void TestCase_2_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(5, longestIncreasingSubsequenceController.runBruteForceSolution(testCase2));
        Assertions.assertEquals(5, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase2));
        Assertions.assertEquals(5, longestIncreasingSubsequenceController.runGreedySolution(testCase2));
        System.out.println("TestCase2 Runtime: ");
        System.out.println("Brute Force: " + longestIncreasingSubsequenceController.getBruteForceSolutionRuntime(testCase2));
        System.out.println("DP: " + longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase2));
        System.out.println("Greedy: " + longestIncreasingSubsequenceController.getGreedyRuntime(testCase2));
    }

    @Test
    public void TestCase_3_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(5, longestIncreasingSubsequenceController.runBruteForceSolution(testCase3));
        Assertions.assertEquals(5, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase3));
        Assertions.assertEquals(5, longestIncreasingSubsequenceController.runGreedySolution(testCase3));
        System.out.println("TestCase3 Runtime: ");
        System.out.println("Brute Force: " + longestIncreasingSubsequenceController.getBruteForceSolutionRuntime(testCase3));
        System.out.println("DP: " + longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase3));
        System.out.println("Greedy: " + longestIncreasingSubsequenceController.getGreedyRuntime(testCase3));
    }

    @Test
    public void TestCase_4_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(7, longestIncreasingSubsequenceController.runBruteForceSolution(testCase4));
        Assertions.assertEquals(7, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase4));
        Assertions.assertEquals(7, longestIncreasingSubsequenceController.runGreedySolution(testCase4));
        System.out.println("TestCase4 Runtime: ");
        System.out.println("Brute Force: " + longestIncreasingSubsequenceController.getBruteForceSolutionRuntime(testCase4));
        System.out.println("DP: " + longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase4));
        System.out.println("Greedy: " + longestIncreasingSubsequenceController.getGreedyRuntime(testCase4));
    }

    @Test
    public void TestCase_5_Should_Have_Expected_Result_For_All_Algorithms(){
        Assertions.assertEquals(7, longestIncreasingSubsequenceController.runBruteForceSolution(testCase5));
        Assertions.assertEquals(7, longestIncreasingSubsequenceController.runDynamicProgrammingSolution(testCase5));
        Assertions.assertEquals(7, longestIncreasingSubsequenceController.runGreedySolution(testCase5));
        System.out.println("TestCase5 Runtime: ");
        System.out.println("Brute Force: " + longestIncreasingSubsequenceController.getBruteForceSolutionRuntime(testCase5));
        System.out.println("DP: " + longestIncreasingSubsequenceController.getDynamicProgrammingRuntime(testCase5));
        System.out.println("Greedy: " + longestIncreasingSubsequenceController.getGreedyRuntime(testCase5));
    }
}
