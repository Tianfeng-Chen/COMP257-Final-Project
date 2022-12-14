package Model;

import java.util.ArrayList;
import java.util.List;

public class GreedyStrategySolution extends Solution{
    @Override
    public int runSolution(int[] input) {
        if (input == null || input.length == 0) {
            throw new IllegalArgumentException("Input cannot be null or empty!");
        }
        List<Integer> list = new ArrayList<>();
        for (int num: input) {
            int index = insertHelper(list, num);
            if (index == list.size()) {
                list.add(num);
            } else {
                list.set(index, num);
            }
        }
        return list.size();
    }

    private int insertHelper(List<Integer> list, int num) {
        int left = 0, right = list.size();
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid) == num) {
                return mid;
            }
            if (list.get(mid) < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
