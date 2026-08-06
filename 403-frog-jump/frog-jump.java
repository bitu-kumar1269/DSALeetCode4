import java.util.*;

class Solution {
    public boolean canCross(int[] stones) {
        // Base case: The frog starts at 0 and MUST make a jump of 1 unit to reach stones[1].
        if (stones[1] != 1) return false;

        int n = stones.length;

        // Map each stone position to a set of valid incoming jump sizes 'k'
        Map<Integer, Set<Integer>> dp = new HashMap<>();
        for (int stone : stones) {
            dp.put(stone, new HashSet<>());
        }

        // Base state: At stone 0, initial jump size is 0
        dp.get(0).add(0);

        // Process each stone
        for (int i = 0; i < n; i++) {
            int currentStone = stones[i];

            // For every jump length 'k' that can reach 'currentStone'
            for (int k : dp.get(currentStone)) {
                
                // The frog can choose a next step size of k-1, k, or k+1
                for (int step = k - 1; step <= k + 1; step++) {
                    // Step must be positive (> 0) and target stone must exist in our map
                    if (step > 0 && dp.containsKey(currentStone + step)) {
                        dp.get(currentStone + step).add(step);
                    }
                }
            }
        }

        // If the set for the last stone contains any jump sizes, we can reach it!
        return !dp.get(stones[n - 1]).isEmpty();
    }
}