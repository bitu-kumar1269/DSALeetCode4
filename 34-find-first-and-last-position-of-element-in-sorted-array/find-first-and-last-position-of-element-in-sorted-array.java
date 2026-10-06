class Solution {
    private int firstPosition(int[] nums, int target){
        int low = 0;
        int high = nums.length -1;
        int first = -1;

        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] >= target){
                if(nums[mid] == target){
                    first = mid;
                }
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return first;
    }
    private int lastPosition(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int last = -1;

        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] <= target){
                if(nums[mid] == target){
                    last = mid;
                }
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        int first = firstPosition(nums, target);
        int last = lastPosition(nums, target);

        arr[0] = first;
        arr[1] = last;

        return arr;
    }
}