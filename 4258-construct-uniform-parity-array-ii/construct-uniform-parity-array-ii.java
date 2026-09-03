class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        int oddCount = 0;

        for(int x: nums1){
            if(x < min){
                min = x;
            }
            if(x % 2 != 0){
                oddCount++;
            }
        }
        // // True if minimum is odd, or if there are no odds at all (all even)
        return (min % 2 != 0) || (oddCount ==0);
    }
}