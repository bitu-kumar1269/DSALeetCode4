class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);

        long totalSum = 0;
        int negNum = n/2;

        for(int i=0; i<negNum; i++){
            totalSum -= (long) nums[i]*nums[i];
        }
        for(int i=negNum; i<n; i++){
            totalSum += (long) nums[i]*nums[i];
        }
        return totalSum;
    }
}