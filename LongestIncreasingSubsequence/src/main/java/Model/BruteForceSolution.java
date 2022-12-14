package Model;

import java.util.ArrayList;
import java.util.List;

public class BruteForceSolution extends Solution{
    @Override
    public int runSolution(int[] input) {
        if (input == null || input.length == 0) {
            throw new IllegalArgumentException("Input cannot be null or empty!");
        }
        List<List<Integer>> subs = new ArrayList<>();
        int max = 0;
        helper(input, 0, subs, new ArrayList<>());
        for (List<Integer> sub : subs) {
            max = Math.max(max, sub.size());
        }
        return max;
    }

    private void helper(int[] nums, int index, List<List<Integer>> subs, List<Integer> inner) {
        if (index >= nums.length) {
            subs.add(new ArrayList<>(inner));
            return;
        }
        int cur = nums[index];
        if (inner.size() == 0 || cur > inner.get(inner.size() - 1)) {
            inner.add(cur);
            helper(nums, index + 1, subs, inner);
            if (inner.size() > 0) {
                inner.remove(inner.size() - 1);
            }
        }
        helper(nums, index + 1, subs, inner);
    }
}
