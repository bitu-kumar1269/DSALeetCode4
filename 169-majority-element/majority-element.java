class Solution {
    public int majorityElement(int[] nums) {
        /* 
        Optimal Approach: Boyer-Moore Voting AlgorithmTo solve this in O(n) time and O(1)auxiliary space
        */
        int major = nums[0];
        int count = 0;
        
        for(int num: nums){
            if(count == 0) major = num;
            count += (num == major) ? 1: -1;
        }
        
        return major;
    }
}