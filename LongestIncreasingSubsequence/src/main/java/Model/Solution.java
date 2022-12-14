package Model;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public abstract class Solution {
    public abstract int runSolution(int[] input);

    public String calculateRunTime(int[] input) {
        Instant start = Instant.now();
        runSolution(input);
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);

        return Arrays.asList(input) + " => Time taken: " + timeElapsed.toMillis() + " Milliseconds.";
    }
}
