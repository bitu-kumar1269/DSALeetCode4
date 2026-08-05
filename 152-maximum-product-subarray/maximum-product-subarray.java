class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;

        int dpMax[] = new int[n]; // DP tables
        int[] dpMin = new int[n];
    // // Base cases: single-element subarray at index 0
        dpMax[0] = nums[0];
        dpMin[0] = nums[0];
        int max = nums[0];
        
        for(int i=1; i<n; i++){
            int prod1 = dpMax[i-1] * nums[i];
            int prod2 = dpMin[i-1] * nums[i];

            dpMax[i] = Math.max(nums[i], Math.max(prod1, prod2));
            dpMin[i] = Math.min(nums[i], Math.min(prod1, prod2));

            max = Math.max(max ,dpMax[i]);
        }
        return max;

    }
}