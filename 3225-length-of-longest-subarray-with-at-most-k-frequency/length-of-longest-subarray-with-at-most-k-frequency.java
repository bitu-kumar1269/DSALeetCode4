class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        // i use hashmap to count freq of each element 
        HashMap<Integer,Integer> freq = new HashMap<>(); 
        int maxLength = 0, left = 0; // max store maxlengthsubarray, and left for reduse when freq of nums[i] grater k
        
        for(int right = 0; right < n; right++){
            int num = nums[right];
            freq.put(num, freq.getOrDefault(num, 0)+ 1);
            // it will only excute when freq of element is > k(2)
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