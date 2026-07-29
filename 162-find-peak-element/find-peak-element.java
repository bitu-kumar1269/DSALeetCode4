class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0; // single element array
        if(nums[0] > nums[1]) return 0; //check element 0 is peak
        if(nums[n-1] > nums[n-2]) return n-1; // check last element peak
        int low =1, high = n-2; // index 0 and n-1 allready checked

        while(low <= high){
            int mid = (low + high)/2;
            // mid element > than prevois and mid is > than next element if yes then mid is peak element
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                return mid;
            }else if(nums[mid] < nums[mid+1]){ // check mid < next element then we an't find peak at mid left side so left to
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
}