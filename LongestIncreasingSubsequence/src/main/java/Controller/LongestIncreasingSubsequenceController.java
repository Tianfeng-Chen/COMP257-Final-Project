package Controller;

import Model.BruteForceSolution;
import Model.DynamicProgrammingSolution;
import Model.GreedyStrategySolution;
import Model.Solution;

public class LongestIncreasingSubsequenceController {
    private Solution bruteForceSolution;
    private Solution dynamicProgrammingSolution;
    private Solution greedyStrategySolution;

    public LongestIncreasingSubsequenceController() {
        bruteForceSolution = new BruteForceSolution();
        dynamicProgrammingSolution = new DynamicProgrammingSolution();
        greedyStrategySolution = new GreedyStrategySolution();
    }

    public int runBruteForceSolution(int[] input) {
        return bruteForceSolution.runSolution(input);
    }
    public int runDynamicProgrammingSolution(int[] input) {
        return dynamicProgrammingSolution.runSolution(input);
    }
    public int runGreedySolution(int[] input) {
        return greedyStrategySolution.runSolution(input);
    }
    public String getBruteForceSolutionRuntime(int[] input) {
        return bruteForceSolution.calculateRunTime(input);
    }
    public String getDynamicProgrammingRuntime(int[] input) {
        return dynamicProgrammingSolution.calculateRunTime(input);
    }
    public String getGreedyRuntime(int[] input) {
        return greedyStrategySolution.calculateRunTime(input);
    }
}
