class Solution {
    private int climbStairMemo(int n, int dp[]){
        if(n == 0 || n == 1) return 1;

        if(dp[n] != 0){
            return dp[n];
        }
        return dp[n] = climbStairMemo(n-1, dp) + climbStairMemo(n-2, dp);
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        return climbStairMemo(n ,dp);
    }
}