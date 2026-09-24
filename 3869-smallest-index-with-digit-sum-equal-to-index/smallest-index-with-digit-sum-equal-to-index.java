class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int sum = 0; // sum is store the every digit sum
            int n = nums[i];
            while(n > 0){
                sum += n%10;
                n /= 10;
            }
            if(sum == i){ // digit sum is equal to i then return first matching index of i
                return i;
            }
        }
        return -1;
    }
}