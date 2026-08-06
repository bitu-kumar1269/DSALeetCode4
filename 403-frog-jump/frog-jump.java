class Solution {

    Map<Integer, Integer> map = new HashMap<>();
    Boolean[][] dp;

    public boolean canCross(int[] stones) {

        int n = stones.length;

        for (int i = 0; i < n; i++) {
            map.put(stones[i], i);
        }

        dp = new Boolean[n][n + 1];

        return solve(stones, 0, 0);
    }

    public boolean solve(int[] stones, int idx, int jump) {

        if (idx == stones.length - 1)
            return true;

        if (dp[idx][jump] != null)
            return dp[idx][jump];

        for (int nextJump = jump - 1; nextJump <= jump + 1; nextJump++) {

            if (nextJump <= 0)
                continue;

            int nextStone = stones[idx] + nextJump;

            if (map.containsKey(nextStone)) {

                if (solve(stones, map.get(nextStone), nextJump)) {
                    return dp[idx][jump] = true;
                }
            }
        }

        return dp[idx][jump] = false;
    }
}