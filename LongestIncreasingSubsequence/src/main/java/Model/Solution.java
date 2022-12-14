package Model;

import java.util.ArrayList;
import java.util.List;

public abstract class Solution {
    private String runTime = null;

    public abstract int runSolution(int[] input);

    public String calculateRunTime(int[] input) {
        List<Integer> list = new ArrayList<>();
        long startTime = System.nanoTime();
        runSolution(input);
        long endTime = System.nanoTime();
        for (int n : input) {
            list.add(n);
        }
        return String.valueOf(Math.abs(endTime - startTime));
    }
}
