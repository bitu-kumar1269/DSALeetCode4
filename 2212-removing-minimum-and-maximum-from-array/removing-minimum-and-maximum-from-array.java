class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n <= 2) return n;

        int max = 0;
        int min = 0;
        for(int i=0; i<n; i++){
            if(nums[i] < nums[min]) min = i;
            if(nums[i] > nums[max]) max = i;
        }
        int left = Math.min(min, max);
        int right = Math.max(min, max);
        // 1. Both from front
        int bothFront = right + 1;
        // 2. Both from back
        int bothBack = n - left;
        // 3. One from front, one from back
        int frontAndBack = (left + 1) + (n - right);

        return Math.min(bothFront, Math.min(bothBack, frontAndBack));
    }
}