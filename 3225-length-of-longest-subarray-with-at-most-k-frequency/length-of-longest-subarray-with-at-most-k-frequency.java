class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> freq = new HashMap<>();
        int maxLength = 0, left = 0;
        
        for(int right = 0; right < n; right++){
            int num = nums[right];
            freq.put(num, freq.getOrDefault(num, 0)+ 1);

            while(freq.get(num) > k){
                int leftnum = nums[left];
                freq.put(leftnum, freq.get(leftnum)- 1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left +1);
        }
        return maxLength;

    }
}